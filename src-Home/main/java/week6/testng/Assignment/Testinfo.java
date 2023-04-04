package week6.testng.Assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testinfo {
	public static String[][] read(String sheetname) throws IOException{
		XSSFWorkbook book=new XSSFWorkbook("./inputdata/testinput.xlsx");
		XSSFSheet sheet=book.getSheet(sheetname);
		int rownos=sheet.getLastRowNum();
		System.out.println("Number of rows in sheet "+sheetname+":"+rownos);
		short colnos=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in sheet "+sheetname+":"+colnos);
		String[][] data=new String[rownos][colnos];
		for(int i=1;i<=rownos;i++) {
			XSSFRow eachrow=sheet.getRow(i);
			for(int j=0;j<colnos;j++)
			{
				XSSFCell eachcell=eachrow.getCell(j);
				String val=eachcell.getStringCellValue();
				data[i-1][j]=val;
			}
			}
			
			book.close();
			
		return data;
	}

}
