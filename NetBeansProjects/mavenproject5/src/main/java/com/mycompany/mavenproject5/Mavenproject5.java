/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author CSD
 */

import java.util.Scanner;
public class Mavenproject5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YOUR VALUE a- ");
        double a=sc.nextDouble();       
        
        System.out.println("ENTER YOUR VALUE b- ");
         double b=sc.nextDouble();
        
         System.out.println("ENTER YOUR VALUE c- ");
         double c=sc.nextDouble();
        
           System.out.println("ENTER YOUR VALUE d- ");
          double d=sc.nextDouble();
        
       
        double e=Math.sqrt(Math.pow(b-a,2) + Math.pow(d-c,2));
      
        System.out.println(" print distance = "+e);


    }
}
