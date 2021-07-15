/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



/**
 *
 * @author rafae
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();
        

        System.out.println("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cod = sc.nextInt();
            courseA.add(cod);
            

        }
        
        System.out.println("How many students for course B? ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int cod = sc.nextInt();
            courseB.add(cod);
        }
        
        System.out.println("How many students for course C? ");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int cod = sc.nextInt();
            courseC.add(cod);
        }
        
       Set<Integer> total = new HashSet<>(courseA);
       total.addAll(courseB);
       total.addAll(courseC);
        
        System.out.println("Total students: " + total.size());
        
        
        sc.close();
    }
}
