/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancegenerator;


/**
 *
 * @author Felix
 */
public class InstanceGenerator {   

    public static void main(String[] args)
    {              
        // Concave function for cost of the bins
        ExcelGenerator.makeInstancesN100S1();
        ExcelGenerator.makeInstancesN200S1();
        ExcelGenerator.makeInstancesN500S1();
        ExcelGenerator.makeInstancesN1000S1();

        // Random number for cost of the bins
        ExcelGenerator.makeInstancesN100S2();
        ExcelGenerator.makeInstancesN200S2();
        ExcelGenerator.makeInstancesN500S2();
        ExcelGenerator.makeInstancesN1000S2();
        
        ExcelTranslator.ReadInstance();
       
    }
    
    
}
