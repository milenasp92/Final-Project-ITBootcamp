package sajt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class UserList {

	public static void main(String[] args) {

		try (FileInputStream fi = new FileInputStream("ListOfUsers2.xls"); HSSFWorkbook wb = new HSSFWorkbook(fi)) {

			Sheet sheet = wb.getSheetAt(0);

			int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

			for (int i = 0; i < rowCount + 1; i++) {
				Row row = sheet.getRow(i);

				for (int j = 1; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);

					System.out.println(cell.toString());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
