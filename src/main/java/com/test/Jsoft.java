package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class Jsoft {
	public static void main(String args[]) throws IOException, DocumentException{
		FileInputStream existingFileStream = new FileInputStream("E:\\PdfcGenrated\\salaryslip\\IncrementLetter.pdf");
		PdfReader pdfReader = new PdfReader(existingFileStream);
		PdfStamper stamper = new PdfStamper(pdfReader,
				new FileOutputStream("E:\\PdfcGenrated\\salaryslip\\IncrementLetter\\increment_letter.pdf"));
		AcroFields form = stamper.getAcroFields();
		HashMap map = (HashMap) form.getFields();
		Set s = map.keySet();
		s.forEach(c->{
			System.out.println(c);
		});
		//PAYSLIP FOR THE MONTH OF SEPTEMBER 2018
		int i = 0;
		for (Iterator it = s.iterator(); it.hasNext();) {
			String key = (String) it.next();
			
			if(key.equalsIgnoreCase("date")){
				form.setField(key,"July 17, 2017");
			}
			if(key.equalsIgnoreCase("name")){
				form.setField(key,"Mr. Mohammad Zaid,");
			}
			if(key.equalsIgnoreCase("mr_name")){
				form.setField(key,"Mohammad Zaid,");
			}
			
			if(key.equalsIgnoreCase("address")){
				form.setField(key,"Kurla East Mumbai-400070");
			}
			if(key.equalsIgnoreCase("inr")){
				form.setField(key,"2,25,000");
			}
			if(key.equalsIgnoreCase("effective _from")){
				form.setField(key,"April 01, 2018");
			}
			if(key.equalsIgnoreCase("Special_Conveyance_urn")){
				form.setField(key,"45,000");
			}
			if(key.equalsIgnoreCase("Conveyance_urn")){
				form.setField(key,"45,000");
			}
			
			if(key.equalsIgnoreCase("House_Rent_urn")){
				form.setField(key,"45,000");
			}
			if(key.equalsIgnoreCase("basic_urn")){
				form.setField(key,"90,000");
			}
			if(key.equalsIgnoreCase("ctc_urn")){
				form.setField(key,"2,25,000");
			}
			if(key.equalsIgnoreCase("net_salary_urn")){
				form.setField(key,"2,22,600");
			}
			if(key.equalsIgnoreCase("Professional_Tax")){
				form.setField(key,"2,400");
			}
			
			if(key.equalsIgnoreCase("Special_Conveyance")){
				form.setField(key,"3,750");
			}
			if(key.equalsIgnoreCase("Conveyance")){
				form.setField(key,"3,750");
			}
			
			if(key.equalsIgnoreCase("House Rent Allowance")){
				form.setField(key,"3,750");
			}
			if(key.equalsIgnoreCase("basic_pay")){
				form.setField(key,"7,500");
			}
			if(key.equalsIgnoreCase("ctc")){
				form.setField(key,"18,750");
			}
			if(key.equalsIgnoreCase("net_salary")){
				form.setField(key,"18,550");
			}
		}
		stamper.setFormFlattening(true);
		stamper.setFreeTextFlattening(true);
		stamper.close ();
		pdfReader.close ();
		System.out.println("sucess");
		
	} 
	public void genrateConfirmation() throws IOException, DocumentException {

		FileInputStream existingFileStream = new FileInputStream("E:\\PdfcGenrated\\salaryslip\\confirmation_template.pdf");
		PdfReader pdfReader = new PdfReader(existingFileStream);
		PdfStamper stamper = new PdfStamper(pdfReader,
				new FileOutputStream("E:\\PdfcGenrated\\salaryslip\\confirmation_letter\\confirmation_letter.pdf"));
		AcroFields form = stamper.getAcroFields();
		HashMap map = (HashMap) form.getFields();
		Set s = map.keySet();
		s.forEach(c->{
			System.out.println(c);
		});
		//PAYSLIP FOR THE MONTH OF SEPTEMBER 2018
		int i = 0;
		for (Iterator it = s.iterator(); it.hasNext();) {
			String key = (String) it.next();
			if(key.equalsIgnoreCase("emp_name")){
				form.setField(key,"Mohammad Zaid,");
			}
			if(key.equalsIgnoreCase("date")){
				form.setField(key,"July 17, 2017");
			}
			if(key.equalsIgnoreCase("name")){
				form.setField(key,"Mr. Mohammad Zaid,");
			}
			if(key.equalsIgnoreCase("address")){
				form.setField(key,"Kurla East Mumbai-400070");
			}
			if(key.equalsIgnoreCase("Jr. Programmer")){
				form.setField(key,"“Jr. Programmer”.");
			}
		}
		stamper.setFormFlattening(true);
		stamper.setFreeTextFlattening(true);
		stamper.close ();
		pdfReader.close ();
		System.out.println("sucess");
	}
	public void genratePDF() throws IOException, DocumentException {
		FileInputStream existingFileStream = new FileInputStream("E:\\PdfcGenrated\\salaryslip\\SalarySliptemplate.pdf");
		PdfReader pdfReader = new PdfReader(existingFileStream);
		PdfStamper stamper = new PdfStamper(pdfReader,
				new FileOutputStream("E:\\PdfcGenrated\\salaryslip\\Genratesalaryslip\\SalarySliptemplate.pdf"));
		AcroFields form = stamper.getAcroFields();
		HashMap map = (HashMap) form.getFields();
		Set s = map.keySet();
		s.forEach(c->{
			System.out.println(c);
		});
		//PAYSLIP FOR THE MONTH OF SEPTEMBER 2018
		int i = 0;
		for (Iterator it = s.iterator(); it.hasNext();) {
			String key = (String) it.next();
			if(key.equalsIgnoreCase("monthofSalary")){
				form.setField(key,"PAYSLIP FOR THE MONTH OF SEPTEMBER 2018");
			}
			if(key.equalsIgnoreCase("std_days")){
				form.setField(key,": 30");
			}
			if(key.equalsIgnoreCase("daysWrk")){
				form.setField(key,": 30");
			}
			if(key.equalsIgnoreCase("lwp_days")){
				form.setField(key,": 0");
			}
			if(key.equalsIgnoreCase("refund_days")){
				form.setField(key,": 0");
			}
			if(key.equalsIgnoreCase("employee_id")){
				form.setField(key,": JS32");
			}
			if(key.equalsIgnoreCase("name")){
				form.setField(key,": Saif");
			}
			if(key.equalsIgnoreCase("designation")){
				form.setField(key,": Jr.Programmer");
			}
			if(key.equalsIgnoreCase("date_of_joining")){
				form.setField(key,": 05-07-2017");
			}
			if(key.equalsIgnoreCase("basic")){
				form.setField(key,"7500.00");
			}
			if(key.equalsIgnoreCase("hra")){
				form.setField(key,"3750.00");
			}
			if(key.equalsIgnoreCase("conveyance")){
				form.setField(key,"3750.00");
			}
			if(key.equalsIgnoreCase("special_conveyance")){
				form.setField(key,"3750.00");
			}
			if(key.equalsIgnoreCase("basic_urn")){
				form.setField(key,"7500.00");
			}
			if(key.equalsIgnoreCase("hra_urn")){
				form.setField(key,"3750.00");
			}
			if(key.equalsIgnoreCase("conveyance_urn")){
				form.setField(key,"3750.00");
			}
			if(key.equalsIgnoreCase("special_conveyance_urn")){
				form.setField(key,"3750.00");
			}
			if(key.equalsIgnoreCase("gross_total")){
				form.setField(key,"18750.00");
			}
			if(key.equalsIgnoreCase("gross_total_urn")){
				form.setField(key,"18750.00");
			}
			if(key.equalsIgnoreCase("net_pay")){
				form.setField(key,"18550.00");
			}
			if(key.equalsIgnoreCase("amount_word")){
				form.setField(key,"(Rupees: EIGHTEEN THOUSAND FIVE HUNDRED FIFTY ONLY)");
			}
		}
		stamper.setFormFlattening(true);
		stamper.setFreeTextFlattening(true);
		stamper.close ();
		pdfReader.close ();
		System.out.println("sucess");
	}
}
