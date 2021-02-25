/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d4;

import java.util.Arrays;

/**
 *
 * @author Tanui
 */
public class D4 {

    /**
     * @param args the command line arguments
     */
  
    public static int[] freeze(int example[])
    {
   return Arrays.stream(example).map(i -> i*2).toArray();
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        int doubledArray [] = {1 ,2 ,3 ,4 ,5};
       D4 perform = new D4();
        
        
        System.out.println(Arrays.toString(perform.freeze(doubledArray)));
        
        
        
        
        
    }
    
}
