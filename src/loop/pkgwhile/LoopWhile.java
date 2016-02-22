/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author ImmolateImprove
 */
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How money do you need to retire? ");
        double goal = in.nextDouble();
        System.out.println("How much money will you contribute every year? ");
        double payment = in.nextDouble();
        System.out.println("Interest rate in %: ");
        double interestRate = in.nextDouble();
        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("You can retire in " + years + " years.");
    }

}
