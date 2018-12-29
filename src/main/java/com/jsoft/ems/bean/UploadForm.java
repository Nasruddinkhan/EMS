package com.jsoft.ems.bean;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Nasruddin khan 
 *
 */
public class UploadForm {
	
    private int empId;
    private byte[] bytes;
    MultipartFile[] files;
    private String encodeString;
    
    
    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UploadForm [empId=" + empId + ", files=" + Arrays.toString(files) + "]";
	}

	/**
	 * @return the bytes
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * @param bytes the bytes to set
	 */
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	/**
	 * @return the encodeString
	 */
	public String getEncodeString() {
		return encodeString;
	}

	/**
	 * @param encodeString the encodeString to set
	 */
	public void setEncodeString(String encodeString) {
		this.encodeString = encodeString;
	}



}
