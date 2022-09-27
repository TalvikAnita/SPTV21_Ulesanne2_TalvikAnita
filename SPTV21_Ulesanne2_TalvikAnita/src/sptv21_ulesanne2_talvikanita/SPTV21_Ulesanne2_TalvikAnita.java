/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21_ulesanne2_talvikanita;

import java.util.Scanner;

/**
 *
 * @author Анита
 */
public class SPTV21_Ulesanne2_TalvikAnita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите 3-х значное число");
        int number = scanner.nextInt();
        int summa = 0;
        while(number>0){
            summa += number % 10;
            number /= 10;
        }
        System.out.println("Сумма чисел = " + summa);
    }
    
}
