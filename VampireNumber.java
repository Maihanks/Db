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
public class VampireNumber {
     /***
     * (5) A vampire number has an even number of digits and is formed by
     * multiplying a pair of numbers containing half the number of digits of the result. The digits
     * are taken from the original number in any order. Pairs of trailing zeroes are not allowed.
     * Examples include:
     * 1260 = 21 * 60
     * 1827 = 21 * 87
     * 2187 = 27 * 81
     * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
     */


    static boolean isNumberVampireNumber(String number){
        boolean status = false;
        int theNumber = Integer.parseInt(number);
        int product;
        int[] daughters = new int [12]; //the maximum nuber of daughter pairs to be deduced from a fourdigit number
        char[] digitArray = number.toCharArray();
        daughters[0] = Integer.parseInt(number.substring(0,1) + number.substring(1,2));
        daughters[1] = Integer.parseInt(number.substring(0,1) + number.substring(2,3));
        daughters[2] = Integer.parseInt(number.substring(0,1) + number.substring(3,4));

        daughters[3] = Integer.parseInt(number.substring(1,2) + number.substring(0,1));
        daughters[4] = Integer.parseInt(number.substring(2,3) + number.substring(0,1));
        daughters[5] = Integer.parseInt(number.substring(3,4) + number.substring(0,1));

        daughters[6] = Integer.parseInt(number.substring(1,2) + number.substring(2,3));
        daughters[7] = Integer.parseInt(number.substring(1,2) + number.substring(3,4));

        daughters[8] = Integer.parseInt(number.substring(2,3) + number.substring(1,2));
        daughters[9] = Integer.parseInt(number.substring(2,3) + number.substring(3,4));

        daughters[10] = Integer.parseInt(number.substring(3,4) + number.substring(1,2));
        daughters[11] = Integer.parseInt(number.substring(3,4) + number.substring(2,3));

//else if(){// if there are matching digits

//}

    for (int b = 0; b < daughters.length - 2; b++) {
        for (int a = b + 1; a < daughters.length - 1; a++) {
            product = daughters[b] * daughters[a];
            if (theNumber == (product)) {
                System.out.println(theNumber + " = " + daughters[b] + "*" + daughters[a] + " I.e " + product + " is a vampire number");
                status = true;
                break; //break out of internal loop
            } else {
                status = false;
            }
        }
        if (status == true) break; //break out of external loop
    }
//if (status==false) System.out.println(number+" is not a vampire number");

return status;
    }
    public static void main(String []args) {

for(int a = 1111; a<10001; a++) {
    int number = a;//the number to be tested if it is a vampire number
    isNumberVampireNumber(number + "");

}
    }
}
