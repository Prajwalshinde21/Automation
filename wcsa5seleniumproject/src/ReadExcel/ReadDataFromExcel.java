package ReadExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws   IOException {
		
     // Read Data From IPL Sheet
		
		// implementation of read the data from excel
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");  
		Workbook wb = WorkbookFactory.create(fis);// making that file ready for read 
		Sheet sheet = wb.getSheet("IPL");// get into the sheet..
		
		Row row = sheet.getRow(2);// get into the desired row..
		Cell cell = row.getCell(0);// get into the desired cell/coloumn..
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
		
		
	}

}
