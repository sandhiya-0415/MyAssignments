package marathon.salesforce;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Readexcel {
	
	public static  String[][] readdata(String e) throws IOException{
	
		XSSFWorkbook book=new XSSFWorkbook("./inputdata/salestc.xlsx");
		
		  XSSFSheet sheet=book.getSheet(e);
		  int rowcount=sheet.getLastRowNum();
		  System.out.println("Row Count" +rowcount);
		short c=sheet.getRow(0).getLastCellNum();
		System.out.println("Column count:" +c);
		String[][] data=new String[rowcount][c];
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow eachrow=sheet.getRow(i);
			for(int j=0;j<c;j++)
			{
				XSSFCell eachcell=eachrow.getCell(j);
				String val=eachcell.getStringCellValue();
				data[i-1][j]=val;
				System.out.println(val);
			}
			
		}
		book.close();
		return data;
		
		
	}

}
