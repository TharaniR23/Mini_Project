package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\Desktop\\Write_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis); // Upcasting
		
		wb.createSheet("Student_Data").createRow(0).createCell(0).setCellValue("Student_Id");
		wb.getSheet("Student_Data").getRow(0).createCell(1).setCellValue("Student_Name");
		wb.getSheet("Student_Data").createRow(1).createCell(0).setCellValue("1");
		wb.getSheet("Student_Data").getRow(1).createCell(1).setCellValue("Peter");
		wb.getSheet("Student_Data").createRow(2).createCell(0).setCellValue("2");
		wb.getSheet("Student_Data").getRow(2).createCell(1).setCellValue("John");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("Student Data Written Successfully");
	}

}
