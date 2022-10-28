package php.crm.Vtiger.Project1.genericUtitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is used to fetch and write data from excel sheet
 * @author Akash
 *
 */
public class ExcelUtility {
	/**
	 * This method is used to fetch data from excel sheet
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String fetchDataFromExcelFile(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(IPathConstant.EXCEL_PATH);
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	}

}
