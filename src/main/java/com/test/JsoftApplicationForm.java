/**
 * 
 */
package com.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;

import com.itextpdf.awt.geom.Rectangle;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author Nassruddin Khan
 *
 */
public class JsoftApplicationForm {
	public static void main(String[] args) throws Exception {
		Rectangle pageSize = new Rectangle(780, 525);
		Document document = new Document();
		PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("E:\\PdfcGenrated\\"+new Random().nextInt(10000000)+".pdf"));
		document.open();
		float[] colsWidth1 = {1f, 1f, 1f,1f,1f}; // Code 1
		PdfPTable table = new PdfPTable(colsWidth1);
		float[] colsWidth_main = {1f, 1f, 1f}; // Code 1
		table = new PdfPTable(colsWidth_main);
		table.getDefaultCell().setBorder(0);
		table.setWidthPercentage(100); // Code 2
		table.setHorizontalAlignment(Element.ALIGN_LEFT);//Code 3
		table.addCell(Image.getInstance("E:\\PdfcGenrated\\company.jpg"));
		table.addCell("");
		table.addCell("");
		document.add(table);
		float[] colsWidth = {1f, 1f, 1f, 1f}; // Code 1
		table = new PdfPTable(colsWidth);
		table.getDefaultCell().setBorder(0);
		table.setWidthPercentage(100); // Code 2
		table.setHorizontalAlignment(Element.ALIGN_LEFT);//Code 3
		table.addCell("Employee ID");
		table.addCell("00000");
		table.addCell("Name");
		table.addCell("00000");
		table.addCell("Department");
		table.addCell("00000");
		table.addCell("Designation");
		table.addCell("00000");
		table.addCell("Date Of Joining");
		table.addCell("00000");
		table.addCell("PF Account No");
		table.addCell("00000");
		table.addCell("Days Worked");
		table.addCell("00000");
		table.addCell("ESI Account Number");
		table.addCell("00000");
		table.addCell("Casual Leave");
		table.addCell("00000");
		table.addCell("Adhar Number");
		table.addCell("00000");
		table.addCell("PAN Number");
		table.addCell("00000");
		table.addCell(" ");
		table.addCell(" ");
		table.addCell(" ");
		table.addCell(" ");
		document.add(table);
		document.add( Chunk.NEWLINE );
		document.add( Chunk.NEWLINE );
		Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
		PdfPTable table1 = new PdfPTable(colsWidth);
		table1.setWidthPercentage(100); // Code 2
		table1.setHorizontalAlignment(Element.ALIGN_LEFT);//Code 3
		Phrase Earnings = new Phrase("Earnings", boldFont );
		Phrase Amount = new Phrase("Amount", boldFont );
		Phrase Deductions = new Phrase("Deductions", boldFont );
		Phrase Amount1 = new Phrase("Amount1", boldFont );
		Phrase total_earnings = new Phrase("Total Earning", boldFont );
		Phrase total_deductions = new Phrase("Total Deductions", boldFont );
		table1.addCell(Earnings);
		table1.addCell(Amount);
		table1.addCell(Deductions);
		table1.addCell(Amount);
		table1.addCell("Basic Pay");
		table1.addCell("00000");
		table1.addCell("PF");
		table1.addCell("00000");
		table1.addCell("HRA");
		table1.addCell("00000");
		table1.addCell("ESI");
		table1.addCell("00000");
		table1.addCell("Festival Allowance");
		table1.addCell("00000");
		table1.addCell("Professional Taxes");
		table1.addCell("00000");
		table1.addCell("Others");
		table1.addCell("00000");
		table1.addCell("Others");
		table1.addCell("00000");
		table1.addCell(total_earnings);
		table1.addCell("00000");
		table1.addCell(total_deductions);
		table1.addCell("00000");
		document.add(table1);
		PdfPTable table2 = new PdfPTable(colsWidth);
		table2.setWidthPercentage(100); // Code 2
		table2.getDefaultCell().setBorder(0);
		table2.setHorizontalAlignment(Element.ALIGN_MIDDLE);//Code 3
		Phrase employers_signature = new Phrase("Employer's Signature", boldFont );
		Phrase employees_signature = new Phrase("Employee's Signature", boldFont );
		document.add( Chunk.NEWLINE );
		table2.addCell(" ");
		table2.addCell(" ");
		table2.addCell(" ");
		table2.addCell(" ");
		table2.addCell(employers_signature);
		table2.addCell("");
		table2.addCell(employees_signature);
		table2.addCell("");
		document.add( Chunk.NEWLINE );
		document.add(table2);
		PdfContentByte cb = writer.getDirectContent();
		cb.setFontAndSize(BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, false), 24);
		cb.setLineWidth(3);
		cb.moveTo(10, 515);
		cb.lineTo(770,515 );
		cb.moveTo(10, 10);
		cb.lineTo(770,10 );
		cb.moveTo(770, 515);
		cb.lineTo(770, 10);
		cb.moveTo(10, 515);
		cb.lineTo(10, 10);
		cb.stroke();
		document.close();		
	}
}
