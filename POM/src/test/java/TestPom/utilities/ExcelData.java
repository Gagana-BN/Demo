package TestPom.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	XSSFWorkbook wb; 
public ExcelData()
{
	File src=new File("C:/Users/Gagana BN/eclipse-workspace/POM/TestData/TestData.xlsx");
	try {
		FileInputStream fis=new FileInputStream(src); 
		wb=new XSSFWorkbook(fis);
	} catch (Exception e) {
		
		System.out.println("Unable to read excel file"+e.getMessage());
	} 
}
public String getStringData(int sheetIndex,int row,int column)
{
	return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
}

public String getStringData(String sheetName,int row,int column)
{
	return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue(); 
}
public double getNumericData(String sheetName,int row,int column)
{
return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue(); 	
}
}
