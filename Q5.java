/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lista = sc.nextLine().split(" ");

        int soma = 0;
        for (int i  = 0; i < lista.length; i++){
            soma = soma + Integer.parseInt(lista[i]);
        }
        int tamanho = lista.length;
        int media = (soma/tamanho);
        String maiorqmedia = "";

        for (int i = 0; i < lista.length; i++){
            if (Integer.parseInt(lista[i]) > media){
                maiorqmedia = maiorqmedia + lista[i] + " ";
            }
        }

        String resultado = maiorqmedia.trim();
        System.out.println(resultado);

    }
}