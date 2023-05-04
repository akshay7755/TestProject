package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelReader {
	
	public Object[][] getTestData(String xyz) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("D:\\Xcell files\\Maventestdata.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("REG");
		Object[][] data = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
	//	System.out.println(sh.getLastRowNum());
		//check size use above
		for(int i=0; i<sh.getLastRowNum(); i++) {
			for(int j=0; j<sh.getRow(0).getLastCellNum(); j++) {
				
				data[i][j]=sh.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	    }
            public static void main(String[] args) throws EncryptedDocumentException, IOException {
			ExcelReader E=new ExcelReader();
			System.out.println(E.getTestData("REG"));
		}
          
            //output =[[Ljava.lang.Object;@6af93788
			
		}

/*@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException{
	ExcelReader E=new ExcelReader();
	Object[][] data= E.getTestData("resistration");
	return data;
	
}
	@Test(dataProvider="getData")
			*/

