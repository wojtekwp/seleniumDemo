package driverTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream(new File("C:\\junitws\\data.xlsx" ));
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheetAt(0);
        Iterator<Row> r=sh.rowIterator();
        r.next();
        while(r.hasNext())
        {
        	Row ritr=r.next();
        	Iterator<Cell> citr=ritr.iterator();
        	
        	while(citr.hasNext())
        	   	{
        		Cell cellval=citr.next();
        		String uname=cellval.getStringCellValue();
        		 cellval =citr.next();
        		 String pwd=cellval.getStringCellValue();
        		 System.out.println(uname+" "+pwd);
        	}
        }
        
	}

}
