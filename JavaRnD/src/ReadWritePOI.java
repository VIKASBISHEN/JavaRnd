import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 
 */

/**
 * @author Vikas
 *
 */
public class ReadWritePOI
{

	//Read excel file sheet from the given location 
	@SuppressWarnings({ "deprecation", "null" })
	public void readExcelFile(String filepath,String filename,String SheetName) throws IOException
	{
		
		//Create input stream from xlsx/xls file
		FileInputStream inputfile=new FileInputStream(filepath+"/"+ filename);
		
		//Create workbook from xlsx/xls file
		Workbook workbook=null;
		
		if(filename.toLowerCase().endsWith("xlsx"))
		{
			workbook=new XSSFWorkbook(inputfile);
		}else if(filename.toLowerCase().endsWith("xls"))
		{
			workbook=new HSSFWorkbook(inputfile);
		}
		
		//Get the number of sheets form the file
		int numberofsheets=workbook.getNumberOfSheets();
		
		//Loop through each sheet
		
		for(int i=0;i<numberofsheets;i++)
		{
			//Get the nth sheet from the workbook
			Sheet sheet=workbook.getSheetAt(i);
			//Iterate each row of the sheet
			Iterator<Row> rowiterator=sheet.iterator();
			while(rowiterator.hasNext())
			{
				//Get the row object
				Row row=rowiterator.next();
				//Every row has columns get the column iterate and iterate throgh them
				Iterator<Cell> celliterator=row.cellIterator();
				 while(celliterator.hasNext())
				 {
					 //Get the cell object
					  Cell cell=celliterator.next();
					  //Check the cell type and process accordingly
					  
					  switch(cell.getCellType())
					  {
					     case Cell.CELL_TYPE_STRING:
					    	 System.out.println(cell.getStringCellValue());
					    	 
					    	 break;
					     case Cell.CELL_TYPE_NUMERIC:
					    	  System.out.println(cell.getNumericCellValue());
					    	  break;
					     case Cell.CELL_TYPE_BOOLEAN:
					          System.out.println(cell.getBooleanCellValue());
					          break;
					   }
					  
				 }
			}
		}
		
	}
	
	public void checkfile_exist(String filepath,String filename,String SheetName) throws IOException
	{
		//Create an object of file class for read an excel file.
				File file=new File(filepath+"\\"+filename);
				
				if(file.exists())
				{
					System.out.println("File exist");
				}else
				{
					file.createNewFile();
				}
	}
	
	public void writea_file(String filepath,String filename,String sheetname)
	{
		    XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet(sheetname);
	        Object[][] datatypes = {
	                {"Datatype", "Type", "Size(in bytes)"},
	                {"int", "Primitive", 2},
	                {"float", "Primitive", 4},
	                {"double", "Primitive", 8},
	                {"char", "Primitive", 1},
	                {"String", "Non-Primitive", "No fixed size"}
	        };

	        int rowNum = 0;
	        System.out.println("Creating excel");

	        for (Object[] datatype : datatypes) {
	            Row row = sheet.createRow(rowNum++);
	            int colNum = 0;
	            for (Object field : datatype) {
	                Cell cell = row.createCell(colNum++);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	        }

	        try 
	        {
	            FileOutputStream outputStream = new FileOutputStream(filename);
	            workbook.write(outputStream);
	            workbook.close();
	        }
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Done");
	    }
	
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
         
		ReadWritePOI objectExcel=new ReadWritePOI();
		String filepath=System.getProperty("user.dir");
		System.out.println(filepath);
		objectExcel.writea_file(filepath, "ExcelFile.xlsx", "TestSheet");
		objectExcel.readExcelFile(filepath, "ExcelFile.xlsx", "TestSheet");
	}

}
