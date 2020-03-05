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
public class Fibonacci {
   /***
     *Exercise 9:  (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21,
     * 34, and so on, where each number (from the third on) is the sum of the previous two. Create
     * a method that takes an integer as an argument and displays that many Fibonacci numbers
     * starting from the beginning, e.g., If you run java Fibonacci 5(where Fibonacciis the
     * name of the class) the output will be: 1, 1, 2, 3, 5.
     *
     */
    static void fibonacci(int n){
     int[] fibonacciSeries = new int[n];

     for(int a = 0; a<n; a++){
          if (a ==0 || a==1 ) fibonacciSeries[a] = 1;
         else{
            // System.out.println(a);
             fibonacciSeries[a] = fibonacciSeries[a-2] + fibonacciSeries[a - 1];
         }
         System.out.print(fibonacciSeries[a] + ", ");
}
    }
    public static void main(String []args){
        int n = 5;
        fibonacci(n);
    }

}
