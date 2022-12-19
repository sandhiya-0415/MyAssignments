package com.leaftaps.ui.utlis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datafromexcel {
	public static String[][] readdata(String sheetname) throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook("./Externaldata/testinput.xlsx");
		XSSFSheet sheet=book.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		System.out.println("Number of rows:"+rowcount);
	short colcount=sheet.getRow(0).getLastCellNum();
	String[][] val=new String[rowcount][colcount];
	for(int i=1;i<=rowcount;i++)
	{
		XSSFRow eachrow=sheet.getRow(i);
		for(int j=0;j<colcount;j++)
		{
			XSSFCell eachcell=eachrow.getCell(j);
			String cellval=eachcell.getStringCellValue();
			val[i-1][j]=cellval;
		}
		
	}
	book.close();
	return val;
	

}
}
