package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelLoginData {
	
	public String Username(int i) throws InterruptedException, IOException,IncompatibleClassChangeError
	{
		FileInputStream file=new FileInputStream(new File("C:\\Users\\hp\\Downloads\\845070\\OrangeHrm\\Excel\\Login_Validdata.xlsx"));
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		  XSSFSheet sheet=workbook.getSheet("Sheet1");
		  
		    
			  XSSFRow row =sheet.getRow(i);
			  XSSFCell cell=row.getCell(0);
			  String em=cell.getStringCellValue();
			        
		return em;
		}

		public String Password(int i) throws InterruptedException, IOException,IncompatibleClassChangeError
	{
			FileInputStream file=new FileInputStream(new File("C:\\Users\\hp\\Downloads\\845070\\OrangeHrm\\Excel\\Login_Validdata.xlsx"));
			  XSSFWorkbook workbook = new XSSFWorkbook(file);
			  XSSFSheet sheet=workbook.getSheet("Sheet1");
			  
			  
				  XSSFRow row =sheet.getRow(i);
				  XSSFCell cell1=row.getCell(1);
				  String pwd=cell1.getStringCellValue();
	    
			return pwd;
	}

}
