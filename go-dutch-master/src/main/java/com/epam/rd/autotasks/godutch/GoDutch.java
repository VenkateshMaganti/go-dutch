package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner s = new Scanner(System.in);

        int bill = s.nextInt();

        int nf = s.nextInt();

        int tip, p;

        if(bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if(bill == 0) {
            System.out.println("0");
        } else if(nf <= 0) {
                System.out.println("Number of friends cannot be negative or zero");
            } else {
                tip = ((bill * 10) / 100);
                bill = bill + tip;
                p = bill / nf;
                System.out.println(p);
            }
   }
}
