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
public class PrimeNumbers {
    /**
     * (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print prime numbers 
     * (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).
     */
    static void primeNumbers(int upperBound){        
        boolean status = false;                
        for (int b = 3; b <= upperBound; b += 2) {         
         System.out.print(3+", "+5+", ");// handle case 3 and 5
            for (int a = 2; a < b / 2; a++) {
                
                if (b % a == 0) {
                    status = false;
                    break;
                } else {
                    status = true;
                }
            }
                                if (status == true) {
                System.out.print(b+", ");
            }
        }
    }
      public static void main(String [] args){
    primeNumbers(1000);
    } 
}
