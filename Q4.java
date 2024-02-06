/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacao = sc.nextLine();

        if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            if (operacao.equals("+")){
                System.out.println("RESULTADO: "+ (num1+num2));
            }else if (operacao.equals("-")) {
                System.out.println("RESULTADO: " + (num1 - num2));
            }else if (operacao.equals("*")){
                System.out.println("RESULTADO: "+ (num1*num2));
            }else if (operacao.equals("/")){
                if (num2 == 0){
                    System.out.println("ERRO");
                }else{
                    System.out.println("RESULTADO: "+ (num1/num2));
                            }
                        }
                    }
        else{
            System.out.println("ENTRADA INVALIDA");
        }
    }


}