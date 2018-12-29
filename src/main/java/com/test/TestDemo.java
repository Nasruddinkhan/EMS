package com.test;

import java.io.FileOutputStream;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class TestDemo {
	public static void main(String[] args) {
		/*Session ses=null;
		ses=HibernateUtil.getSession();
		System.out.println(ses);
		CourseMaster courseMaster = new CourseMaster();
		courseMaster.setCourseId(1L);
		courseMaster.setCourseName("JavaScript");
		courseMaster.setCreatedBy("Nasruddin khan");
		
		ses.merge(courseMaster);
		//System.out.println((char)65535);
*/
		Document document = new Document();
	    try
	    {
	        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("E:\\PdfcGenrated\\AddTableExample.pdf"));
	        document.open();
	        PdfPTable table = new PdfPTable(1);
	        table.setWidthPercentage(100);
	        PdfPCell personalHeader = new PdfPCell(new Paragraph("Personal Details"));
	        personalHeader.setBackgroundColor(BaseColor.BLACK);
	        table = new PdfPTable(3); // 3 columns.
	        table.setWidthPercentage(100); //Width 100%
	        table.setSpacingBefore(10f); //Space before table
	        table.setSpacingAfter(10f); //Space after table
	        //Set Column widths
	        float[] columnWidths = {1f, 1f, 1f};
	        table.setWidths(columnWidths);
	        PdfPCell cell1 = new PdfPCell(new Paragraph("Cell 1"));
	        cell1.setBorderColor(BaseColor.BLUE);
	        cell1.setPaddingLeft(10);
	        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	 
	        PdfPCell cell2 = new PdfPCell(new Paragraph("Cell 2"));
	        cell2.setBorderColor(BaseColor.GREEN);
	        cell2.setPaddingLeft(10);
	        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	 
	        PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));
	        cell3.setBorderColor(BaseColor.RED);
	        cell3.setPaddingLeft(10);
	        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
	        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	 
	        //To avoid having the cell border and the content overlap, if you are having thick cell borders
	        //cell1.setUserBorderPadding(true);
	        //cell2.setUserBorderPadding(true);
	        //cell3.setUserBorderPadding(true);
	 
	        table.addCell(cell1);
	        table.addCell(cell2);
	        table.addCell(cell3);
	        document.add(table);
	    
	 
	        document.close();
	        writer.close();
	    } catch (Exception e)
	    {
	        e.printStackTrace();
	    }	
		
	}
}
