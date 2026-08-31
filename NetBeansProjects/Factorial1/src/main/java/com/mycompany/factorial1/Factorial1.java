
package com.mycompany.factorial1;

import java.util.*;
public class Factorial1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double factorial=1;
        System.out.println("ENTER YOUR VALUE = ");
        int n=sc.nextInt();
        
        for( int i=1; i<=n; i++){
            factorial=factorial*i;
        }
        System.out.println("FACTORIAL OF " + n + "are = " + factorial);
    }
}
        
