package sajt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex {
	private static XSSFWorkbook wb;
	private static FileInputStream fi;
			
	public static String getFirstname(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getLastname(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(2);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getEmail(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getPassword(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(3);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getAddress(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(4);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getCity(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(5);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getStateXpath(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(6);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getZipCode(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);
			DataFormatter formatter=new DataFormatter();
			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(7);
			
			text=formatter.formatCellValue(cell);
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}
	
	public static String getCountry(int i) {
		String text = "";
		try {
			fi = new FileInputStream("ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);
			

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(9);
			

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static String getPhone(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(9);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}
	
	public static String getAlias(int i) {
		String text = "";
		try {
			fi = new FileInputStream("src/sajt/ListOfUsers1.xlsx");
			wb = new XSSFWorkbook(fi);

			XSSFSheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(10);

			text = cell.toString();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

}
