/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteworkstrainee.controllingExxecution;

/**
 *
 * @author MAIHANKS
 */
public class StringComparison {
  /**Exercise 14: (3) Write a method that takes two String arguments and uses all the boolean comparisons to compare the
   * two Strings and print the results. For the == and !=, also perform the equals( ) test. In main( ), 
   * call your method with some different String objects.
   * 
   */  
    void comparisons(String var1, String var2){
    if(var1 == var2) System.out.println("var1 == var2");
    if( var1!=var2 ) System.out.println("var1 != var2");
    if(var1.equals(var2)) System.out.println(" var1 equals var 2");
    }
    public static void main(String [] args){
    
    }
    
}
