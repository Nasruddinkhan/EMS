package com.jsoft.ems.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsoft.ems.bean.UploadForm;
import com.jsoft.ems.model.User;
import com.jsoft.ems.service.CommonService;
/**
 * @author Nasruddin khan 
 *
1:34:28 AM
 */
@RestController
@RequestMapping("fileUpload")
public class FileUploadController {
	@Autowired 
	CommonService commonService;
	// save uploaded file to this folder
    private static String UPLOADED_FOLDER = "F://temp//";
    @GetMapping("upload")
    public String index() {
        return "upload";
    }
    @PostMapping("/upload")
    public String multiFileUpload(@ModelAttribute("form") UploadForm form,
                                  RedirectAttributes redirectAttributes, HttpSession httpSession) {
    	System.out.println("form ["+form+"]");
    
    	byte[] bytes = null;
    	int row = 0;
        StringJoiner sj = new StringJoiner(" , ");
        for (MultipartFile file : form.getFiles()) {
        	if (file.isEmpty()) {
        		continue; //next pls
        	}
        		try {
        			bytes = file.getBytes();
        			System.out.println(bytes);
        			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
        			Files.write(path, bytes);
        			sj.add(file.getOriginalFilename());
        			
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        }
        String uploadedFileName = sj.toString();
        if (StringUtils.isEmpty(uploadedFileName)) {
        	System.out.println("Please select a file to upload");
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "<font color = 'red'>Please select a file to upload</font>";
        } else {
        	User users = (User)httpSession.getAttribute("users");
        	users.setEncodeStr(form.getEncodeString());
        	httpSession.setAttribute("users", users);
        	form.setBytes(bytes);
        	row = commonService.updateProfilePhoto(form);
        	System.out.println("You successfully uploaded");
        	redirectAttributes.addFlashAttribute("message", "You successfully uploaded '" + uploadedFileName + "'");
        	return "<font color = 'green'>You successfully uploaded"+uploadedFileName+"</font>";
        }
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }
    public static void main(String[] args) {

	}
}
