/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byteworkstrainee.controllingExxecution;

import java.security.SecureRandom;

/**
 *
 * @author MAIHANKS
 */
public class RandomValueComparison {
    /**Exercise (2) Write a program that generates 25 random int values. For each value,
     * use an if-else statement to classify it as greater than, less than, or equal to a second randomly generated value.
     * 
     */
    static void randomValues(){    
        SecureRandom randomNumbers = new SecureRandom();
        int [] values = new int [25];        
        values[0] =randomNumbers.nextInt();
        System.out.println(values[0]);
    for(int a = 2; a<25; a++){     values[a] = randomNumbers.nextInt();
    if(values[a-1]> values[a]) System.out.println(values[a-1]+" greater than "+values[a]); 
    else if (values[a-1]< values[a])  System.out.println(values[a-1]+" less than "+values[a]); 
    else  System.out.println(values[a-1]+" equal Second "+values[a]); 
    } 
    
    }
    public static void main(String[] args) {
        
        randomValues();
    }
}
