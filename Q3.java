/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        if (num1 > num2 && num2 > num3 && num3 > num4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else{
            if (num4 > num3 && num3 > num2 && num2 > num1){
                System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
            } else {
                System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
            }
        }

    }
}