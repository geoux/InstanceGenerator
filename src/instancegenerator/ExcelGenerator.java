/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancegenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author yoyito
 */
public class ExcelGenerator {
    
    public static void makeInstancesN100S1()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[100];
       try 
       {
           //**************** Class A ***************************************************
           //instance A1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set1/N100/N100A1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance A1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 100; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A2
           fileout = new FileOutputStream(new File("src/instances/Set1/N100/N100A2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 100; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A3
           fileout = new FileOutputStream(new File("src/instances/Set1/N100/N100A3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 100; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A4
           fileout = new FileOutputStream(new File("src/instances/Set1/N100/N100A4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 100; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                cost = (int) (100 * Math.sqrt(capacity));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;                
                
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }
     
    public static void makeInstancesN200S1()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[200];
       try 
       {
           //**************** Class A ***************************************************
           //instance A1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set1/N200/N200A1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance A1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 200; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A2
           fileout = new FileOutputStream(new File("src/instances/Set1/N200/N200A2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 200; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A3
           fileout = new FileOutputStream(new File("src/instances/Set1/N200/N200A3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 200; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A4
           fileout = new FileOutputStream(new File("src/instances/Set1/N200/N200A4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 200; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                cost = (int) (100 * Math.sqrt(capacity));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;                             
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }  
    
    public static void makeInstancesN500S1()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[500];
       try 
       {
           //**************** Class A ***************************************************
           //instance A1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set1/N500/N500A1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance A1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 500; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A2
           fileout = new FileOutputStream(new File("src/instances/Set1/N500/N500A2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 500; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A3
           fileout = new FileOutputStream(new File("src/instances/Set1/N500/N500A3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 500; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A4
           fileout = new FileOutputStream(new File("src/instances/Set1/N500/N500A4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 500; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                cost = (int) (100 * Math.sqrt(capacity));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;                              
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }    
    
    public static void makeInstancesN1000S1()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[1000];
       try 
       {
           //**************** Class A ***************************************************
           //instance A1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set1/N1000/N1000A1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance A1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 1000; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A2
           fileout = new FileOutputStream(new File("src/instances/Set1/N1000/N1000A2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 1000; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A3
           fileout = new FileOutputStream(new File("src/instances/Set1/N1000/N1000A3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 1000; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               cost = (int) (100 * Math.sqrt(capacity));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance A4
           fileout = new FileOutputStream(new File("src/instances/Set1/N1000/N1000A4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 1000; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                cost = (int) (100 * Math.sqrt(capacity));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;      
                
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }        
    
    /******************* No function asociated to cost of bins ********************************/
    public static void makeInstancesN100S2()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[100];
       try 
       {
           //**************** Class B ***************************************************
           //instance B1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set2/N100/N100B1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance B1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 100; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;               
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B2
           fileout = new FileOutputStream(new File("src/instances/Set2/N100/N100B2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 100; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B3
           fileout = new FileOutputStream(new File("src/instances/Set2/N100/N100B3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 100; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B4
           fileout = new FileOutputStream(new File("src/instances/Set2/N100/N100B4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 100; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                double y = randValueReal(0.05, 0.3);
                cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;                
                
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }
    
    public static void makeInstancesN200S2()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[200];
       try 
       {
           //**************** Class B ***************************************************
           //instance B1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set2/N200/N200B1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance B1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 200; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               double y = randValueReal(0.05, 0.3);
               cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B2
           fileout = new FileOutputStream(new File("src/instances/Set2/N200/N200B2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 200; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               double y = randValueReal(0.05, 0.3);
               cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B3
           fileout = new FileOutputStream(new File("src/instances/Set2/N200/N200B3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 200; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               double y = randValueReal(0.05, 0.3);
               cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B4
           fileout = new FileOutputStream(new File("src/instances/Set2/N200/N200B4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 200; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                double y = randValueReal(0.05, 0.3);
                cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;                             
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }  
    
    public static void makeInstancesN500S2()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[500];
       try 
       {
           //**************** Class B ***************************************************
           //instance B1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set2/N500/N500B1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance B1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 500; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B2
           fileout = new FileOutputStream(new File("src/instances/Set2/N500/N500B2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 500; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B3
           fileout = new FileOutputStream(new File("src/instances/Set2/N500/N500B3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 500; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B4
           fileout = new FileOutputStream(new File("src/instances/Set2/N500/N500B4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 500; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                double y = randValueReal(0.05, 0.3);
                cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;                              
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }    
    
    public static void makeInstancesN1000S2()
    {
       int weight = 0;
       int capacity = 0;
       int cost = 0;
       int[] items = new int[1000];
       try 
       {
           //**************** Class B ***************************************************
           //instance B1
           FileOutputStream fileout = new FileOutputStream(new File("src/instances/Set2/N1000/N1000B1.xls"));
           Workbook ficheroWb = new HSSFWorkbook();
           Sheet sheet = ficheroWb.createSheet("Instance B1 for VSBPP");
           Row row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           //for the items
           int reqCapacity = 0;
           for (int i = 1; i <= 1000; i++)
           {
               weight = (int) randVal(1, 20);
               items[i-1] = weight;
               reqCapacity += weight;
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(weight);
           }
           // for the bins
           int cap = 100;
           int j = 1;
           for (int i = 1; i <= 3; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;     
                   availableCap = availableCap+capacity;
               }                                                             
           }           
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B2
           fileout = new FileOutputStream(new File("src/instances/Set2/N1000/N1000B2.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B2 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 1000; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 50;
           j = 1;
           for (int i = 1; i <= 6; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B3
           fileout = new FileOutputStream(new File("src/instances/Set2/N1000/N1000B3.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance A3 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 1000; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 25;
           j = 1;
           for (int i = 1; i <= 12; i++) 
           {
               int availableCap = 0;
               capacity = cap*i;
               while(availableCap < reqCapacity){     
                   row = sheet.getRow(j);
                   double y = randValueReal(0.05, 0.3);
                   cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                   if(row != null){
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost);  
                   }else{
                        row = sheet.createRow(j);
                        row.createCell(0).setCellValue(capacity);
                        row.createCell(1).setCellValue(cost); 
                   }                                     
                   j++;
                   availableCap = availableCap+capacity;
               }                                                           
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;
           
           //instance B4
           fileout = new FileOutputStream(new File("src/instances/Set2/N1000/N1000B4.xls"));
           ficheroWb = new HSSFWorkbook();
           sheet = ficheroWb.createSheet("Instance B4 for VSBPP");
           row = sheet.createRow(0);
           row.createCell(0).setCellValue("Capacity");
           row.createCell(1).setCellValue("Cost");
           row.createCell(2).setCellValue("Weight");
           // for the items
           for (int i = 1; i <= 1000; i++)
           {
               row = sheet.createRow(i);
               row.createCell(2).setCellValue(items[i-1]);
           }
           //for the bins
           cap = 60;
           j = 1;
           for (int i = 1; i <= 55; i++) 
           {
                capacity = cap;
                double y = randValueReal(0.05, 0.3);
                cost = (int) ((100 * Math.sqrt(capacity))*(1+y));
                row = sheet.getRow(i); 
                row.createCell(0).setCellValue(capacity);
                row.createCell(1).setCellValue(cost);                           
                cap = cap+5;                                              
           }
           ficheroWb.write(fileout);
           fileout.flush();
           capacity = 0;      
                
       }
       
       catch (IOException ex)
       {
           System.out.println(ex.getMessage());
       }
   }      
    
    public static float randVal(int low, int high)
    {
        return (float)(Math.floor(probabilityRand() * (high-low) + low + probabilityRand()));
    } 
    public static float randValue(int low, int high)
    {
        return (float)(probabilityRand() * (high-low) + low + probabilityRand());
    } 
    public static double randValueReal(double low, double high)
    {
        return probabilityRand() * (high-low) + low + probabilityRand();
    }     
    public static double probabilityRand()
    {
        return (double)(Math.random() * 1);
    }      
}
