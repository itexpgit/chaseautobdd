/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excel;
import java.io.File;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 *
 * @author uma
 */
public class ReadExcel {
    
    
    public String getExcelTestData(int rownumber, int columnnumber) throws IOException{
        
        Workbook workbook = WorkbookFactory.create(new File("C:\\data\\testcase.xls"));
        Sheet sheet = workbook.getSheetAt(0);
        
        Cell Criteria = sheet.getRow(rownumber).getCell(columnnumber);
        // Logic to read String vs Numeric based on cell data
                String CriteriaText;
                if (Criteria.getCellType() == CellType.NUMERIC) {
                    CriteriaText = String.valueOf((int) Criteria.getNumericCellValue());

                } else {
                    CriteriaText = Criteria.getStringCellValue();
                }
                workbook.close();
                return CriteriaText;
                
    }
    
}
