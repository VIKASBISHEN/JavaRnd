package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException
	{


		FileInputStream fis=new FileInputStream(new File("C://Users//Vikash//workspace//JavaRnD//ExcelFile.xlsx"));
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row> cell=sheet.iterator();
		while(cell.hasNext())
		{
			Row row=cell.next();
			Iterator<Cell> celliterator=row.cellIterator();
			while(celliterator.hasNext())
			{
				Cell celldata=celliterator.next();
				  switch(celldata.getCellType())
				  {
				   case Cell.CELL_TYPE_STRING:
					  System.out.println(celldata.getStringCellValue());
					  break;
					  
				   case Cell.CELL_TYPE_NUMERIC:
						  System.out.println(celldata.getNumericCellValue());
						  break;
						  
				   case Cell.CELL_TYPE_BOOLEAN:
						  System.out.println(celldata.getBooleanCellValue());
						  break;
					  
				  }
			}
		}
	}

}
