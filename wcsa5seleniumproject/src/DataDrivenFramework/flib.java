package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	// it is used to write the data into excel 
	
	public void readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");  
		Workbook wb = WorkbookFactory.create(fis);// making that file ready for read 
		Sheet sheet = wb.getSheet("IPL");// get into the sheet..
		
		Row row = sheet.getRow(2);// get into the desired row..
		Cell cell = row.getCell(0);// get into the desired cell/coloumn..
		String data = cell.getStringCellValue();
		System.out.println(data);
	}
	
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheetName");
		int rc = sheet.getLastRowNum();
		return rc;
		
	}
	
	// it is used to write the data into excel sheet....   
	public String writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheetName");
		
		  Row row = sheet.createRow(rowCount);
		  //create the cell by using row
		  Cell cell = row.createCell(cellCount);
		// write the data into the cell
		  cell.setCellValue(data);	
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		
	}

}
