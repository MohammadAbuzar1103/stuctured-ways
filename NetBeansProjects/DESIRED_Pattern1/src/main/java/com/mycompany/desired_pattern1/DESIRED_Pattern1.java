
package com.mycompany.desired_pattern1;

public class DESIRED_Pattern1 {

    public static void main(String[] args) {
        for (int i = 1; i<= 5; i++) {
           
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= i ; j++) {
                System.out.print(1 + " ");
            }

            System.out.println();
        }
       
    }
}
