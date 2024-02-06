/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int menor = 1000;
        float media = 0;
        String notas = "";

        while (true){
            String[] infor = sc.nextLine().split(" ");
            if (infor[0].equals("-")) {
                break;
            }
            if (Integer.parseInt(infor[1]) > maior) {
                maior = infor[1];
            }
            if (Integer.parseInt(infor1]) < menor) {
                menor = infor[1];
            }
            media = media + parseInt(infor[1]);
            notas = notas + Integer.parseInt(infor[1]) + " ";
        }

        String lista = notas.split(" ");
        media = media/lista.length();
        int acima = 0;
        int abaixo = 0;

        for (int i = 0; i<lista.length(); i++){
            if (lista[i] >= 700){
                acima ++;
            } else{
                abaixo ++;
            }
        }

        System.out.println("maior: "+maior);
        System.out.println("menor: "+menor);
        System.out.println("media: "+Integer.parseInt(media));
        System.out.println("acima: "+acima);
        System.out.println("abaixo: "+abaixo);
    }
}