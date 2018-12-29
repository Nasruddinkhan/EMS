package com.jsoft.ems.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.PropertySource;

import sun.misc.BASE64Decoder;

/**
 * @author Nasruddin khan 
 *
1:33:15 AM
 */
@PropertySource(value = { "classpath:application.properties" })
public class CommonUtils {
	public static java.sql.Timestamp getCurrentDateTime() {
		return  new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
	}
	public static Object checkNull(Object inputStr) {
		return inputStr == null ? "":inputStr.toString();
	}

	public static String genrateRandomPassword() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 15) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		return salt.toString();
	}
	public static String getCurDate() {
		return  new SimpleDateFormat("dd-MMM-yyyy").format(new Date()).toUpperCase();
	}
	public static String getDay() {
		return  new SimpleDateFormat("EEEE", Locale.ENGLISH).format(new Date()).toUpperCase();
	}
	public static String diffrentTwoTimeStamp(String loginTime, String logOutTime) {
		long milliseconds = Timestamp.valueOf(logOutTime).getTime() - Timestamp.valueOf(loginTime).getTime();
		int seconds = (int) milliseconds / 1000;
		int hours = seconds / 3600;
		int minutes = (seconds % 3600) / 60;
		seconds = (seconds % 3600) % 60;
		return  String.valueOf(hours)+":"+String.valueOf(minutes)+":"+String.valueOf(seconds);
	}
	public static int getLoginHoursOnly() {
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	}
	public static String getTime() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date().getTime()).toUpperCase();
	}
	public static File createDynamicImage(String firstName)  {
		int width = 120;
		int height = 120;
		String filePath = "F://temp//";
		String imgChar = String.valueOf(firstName.charAt(0)).toUpperCase();
		String fileStr = filePath+imgChar+".jpg";
		File file = new File(fileStr);
		if(!file.exists()) {
			BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Font myFont = new Font ("Courier New", 1, 100);
			Graphics2D g2d = bufferedImage.createGraphics();
			g2d.setFont(myFont);
			g2d.setColor(Color.white);
			g2d.fillRect(0, 0, width, height);
			g2d.setColor(Color.gray);
			g2d.fillOval(0, 0, width, height);
			g2d.setColor(Color.yellow);
			g2d.drawString(imgChar, 35, 85);
			g2d.dispose();
			try {
				ImageIO.write(bufferedImage, "jpg", file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	public static String base64Encoding(File file) {
		String base64="";
		try{
			InputStream iSteamReader = new FileInputStream(file.getAbsolutePath());
			byte[] imageBytes = IOUtils.toByteArray(iSteamReader);
			base64 = Base64.getEncoder().encodeToString(imageBytes);
			System.out.println(base64);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "data:image/jpg;base64,"+base64;
	}
	public static byte[] Base64ToBytes(String imageString) {
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes = null;
		try {
			decodedBytes = decoder.decodeBuffer(imageString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return decodedBytes;
	}
	/*public static String checkEncodeFileExt(String encodeString) {
		String []ar = encodeString.split(",");
		return encodeString;
	}*/
	public static void main(String[] args)  {
		/*System.out.println(getCurDate());
		System.out.println(getCurrentDateTime());
		System.out.println(getDay());
		System.out.println(diffrentTwoTimeStamp(getCurrentDateTime().toString(), getCurrentDateTime().toString()));
		System.out.println(getLoginHoursOnly());
		System.out.println(getTime());
		 */
		System.out.println(getLoginHoursOnly());
		String str = base64Encoding(createDynamicImage("zaid"));
		String ar[] = str.split(",");
		System.out.println(ar[0].indexOf("jpg"));
		
	}
}
