/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancegenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author yoyito
 */
public class ExcelTranslator {      
    
    public static void ReadInstance()
    { 
        /*********************************  Set 1  ******************************************************/
        Translate("src//instances//Set1//N100//N100A1.xls", "src//instances//Set1//N100//N100A1.txt");
        Translate("src//instances//Set1//N100//N100A2.xls", "src//instances//Set1//N100//N100A2.txt");
        Translate("src//instances//Set1//N100//N100A3.xls", "src//instances//Set1//N100//N100A3.txt");
        Translate("src//instances//Set1//N100//N100A4.xls", "src//instances//Set1//N100//N100A4.txt");   
        
        Translate("src//instances//Set1//N200//N200A1.xls", "src//instances//Set1//N200//N200A1.txt");
        Translate("src//instances//Set1//N200//N200A2.xls", "src//instances//Set1//N200//N200A2.txt");
        Translate("src//instances//Set1//N200//N200A3.xls", "src//instances//Set1//N200//N200A3.txt");
        Translate("src//instances//Set1//N200//N200A4.xls", "src//instances//Set1//N200//N200A4.txt");
        
        Translate("src//instances//Set1//N500//N500A1.xls", "src//instances//Set1//N500//N500A1.txt");
        Translate("src//instances//Set1//N500//N500A2.xls", "src//instances//Set1//N500//N500A2.txt");
        Translate("src//instances//Set1//N500//N500A3.xls", "src//instances//Set1//N500//N500A3.txt");
        Translate("src//instances//Set1//N500//N500A4.xls", "src//instances//Set1//N500//N500A4.txt");
        
        Translate("src//instances//Set1//N1000//N1000A1.xls", "src//instances//Set1//N1000//N1000A1.txt");
        Translate("src//instances//Set1//N1000//N1000A2.xls", "src//instances//Set1//N1000//N1000A2.txt");
        Translate("src//instances//Set1//N1000//N1000A3.xls", "src//instances//Set1//N1000//N1000A3.txt");
        Translate("src//instances//Set1//N1000//N1000A4.xls", "src//instances//Set1//N1000//N1000A4.txt");  
        
        /*********************************  Set 2  ******************************************************/
        Translate("src//instances//Set2//N100//N100B1.xls", "src//instances//Set2//N100//N100B1.txt");
        Translate("src//instances//Set2//N100//N100B2.xls", "src//instances//Set2//N100//N100B2.txt");
        Translate("src//instances//Set2//N100//N100B3.xls", "src//instances//Set2//N100//N100B3.txt");
        Translate("src//instances//Set2//N100//N100B4.xls", "src//instances//Set2//N100//N100B4.txt");   
        
        Translate("src//instances//Set2//N200//N200B1.xls", "src//instances//Set2//N200//N200B1.txt");
        Translate("src//instances//Set2//N200//N200B2.xls", "src//instances//Set2//N200//N200B2.txt");
        Translate("src//instances//Set2//N200//N200B3.xls", "src//instances//Set2//N200//N200B3.txt");
        Translate("src//instances//Set2//N200//N200B4.xls", "src//instances//Set2//N200//N200B4.txt");
        
        Translate("src//instances//Set2//N500//N500B1.xls", "src//instances//Set2//N500//N500B1.txt");
        Translate("src//instances//Set2//N500//N500B2.xls", "src//instances//Set2//N500//N500B2.txt");
        Translate("src//instances//Set2//N500//N500B3.xls", "src//instances//Set2//N500//N500B3.txt");
        Translate("src//instances//Set2//N500//N500B4.xls", "src//instances//Set2//N500//N500B4.txt");
        
        Translate("src//instances//Set2//N1000//N1000B1.xls", "src//instances//Set2//N1000//N1000B1.txt");
        Translate("src//instances//Set2//N1000//N1000B2.xls", "src//instances//Set2//N1000//N1000B2.txt");
        Translate("src//instances//Set2//N1000//N1000B3.xls", "src//instances//Set2//N1000//N1000B3.txt");
        Translate("src//instances//Set2//N1000//N1000B4.xls", "src//instances//Set2//N1000//N1000B4.txt");          
        
    }
    
    private static void Translate(String input, String output){
        try 
        {
            FileWriter fw = new FileWriter(output);// Objeto para que establece origen de los datos
            BufferedWriter bw = new BufferedWriter(fw);// buffer para el manejo de los datos
            PrintWriter title = new PrintWriter(bw);
            FileInputStream ficheroXlsx = new FileInputStream(new File(input));
            Workbook ficheroWb = new HSSFWorkbook(ficheroXlsx);
            Sheet sheet = ficheroWb.getSheetAt(0);
            //for the items
            Row row = sheet.getRow(1);
            int i = 1;
            String itemsSet = "set J := ";
            int reqCapacity = 0;
            List<String> varItem = new ArrayList<>();
            while(row != null && row.getCell(2) != null){
                itemsSet = itemsSet+i+" ";
                int weight = (int)row.getCell(2).getNumericCellValue();
                reqCapacity += weight;
                String tmp = "";
                if(i == 1){
                    tmp = "param w:=     "+i+"   "+weight;
                }else{
                    tmp = "              "+i+"   "+weight;
                }
                varItem.add(tmp);
                i++;
                row = sheet.getRow(i);
            }
            varItem.add(";");
            itemsSet = itemsSet+";";
            
             //for the bins
            row = sheet.getRow(1);
            int j = 1;
            String binSet = "set I := ";
            List<String> binsCost = new ArrayList<>();
            List<String> binsCap = new ArrayList<>();
            while(row != null && row.getCell(0) != null){
                String tmpCost = "";
                String tmpCap = "";
                binSet = binSet+j+" ";
                if(j == 1){
                    tmpCost = "param f:=     "+j+"   "+(int) row.getCell(1).getNumericCellValue();
                    tmpCap = "param b:=     "+j+"   "+(int) row.getCell(0).getNumericCellValue();
                }else{
                    tmpCost = "              "+j+"   "+(int) row.getCell(1).getNumericCellValue();
                    tmpCap = "              "+j+"   "+(int) row.getCell(0).getNumericCellValue();
                }
                binsCost.add(tmpCost);
                binsCap.add(tmpCap);
                j++;
                row = sheet.getRow(j);
            }
            binsCap.add(";");
            binsCost.add(";");
            binSet = binSet+";";
            
            title.print(binSet);
            title.println();
            title.println();
            title.print(itemsSet);
            title.println();
            title.println();
            
            for(int x=0; x<binsCap.size(); x++){
                title.print(binsCap.get(x));
                title.println();
            }
            title.println();
            title.println();
            for(int y=0; y<binsCost.size(); y++){
                title.print(binsCost.get(y));
                title.println();
            }
            title.println();
            title.println();
            for(int z=0; z<varItem.size(); z++){
                title.print(varItem.get(z));
                title.println();
            } 
            title.println();
            title.close();            
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }        
    }
}
