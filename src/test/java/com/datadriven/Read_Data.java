package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void particular_Cell_Data() throws IOException {

		System.out.println("***Particular Data***");

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Test_Cases\\Emp_Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(3);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {
			String CellValue = c.getStringCellValue();
			System.out.println(CellValue);

		} else if (type.equals(CellType.NUMERIC)) {
			double CellValue = c.getNumericCellValue();
			int value = (int) CellValue;                            // Narrowing type casting
			System.out.println(value);
		}
		System.out.println("");
	}

	private static void all_Data() throws IOException {

		System.out.println("***All Data***");

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Emp_Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {

					String value = c.getStringCellValue();

					System.out.println(value);

				}

				else if (type.equals(CellType.NUMERIC)) {
					double numericValue = c.getNumericCellValue();
					int v = (int) numericValue;                      // Narrowing type casting
					String value = Integer.toString(v);
					System.out.println(value);

				}

			}
		}
		System.out.println("");
	}

	public static void particular_Row_Data() throws IOException {

		System.out.println("***Particular Row Data***");

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Emp_Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(5);

		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {
				String CellValue = c.getStringCellValue();
				System.out.println(CellValue);

			} else if (type.equals(CellType.NUMERIC)) {
				double CellValue = c.getNumericCellValue();
				int v = (int) CellValue;                          // Narrowing type casting
				String Value = Integer.toString(v);
				System.out.println(Value);
			}

		}

		System.out.println(" ");
	}

	public static void particular_Column_Data() throws IOException {
		
		System.out.println("***Particular Column Data***");

		File f = new File("C:\\Users\\ELCOT\\Desktop\\Emp_Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);
		
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			Cell c = r.getCell(1);
			
			CellType type = c.getCellType();
			
			if(type.equals(CellType.STRING)) {
				String cellValue = c.getStringCellValue();
				System.out.println(cellValue);
			}
				else if(type.equals(CellType.NUMERIC)) {
					double value = c.getNumericCellValue();
					System.out.println(value);
				}
			wb.close();
		}
	}
		
	public static void main(String[] args) throws IOException {

		particular_Cell_Data();

		all_Data();

		particular_Row_Data();
		
		particular_Column_Data();

	}

}
