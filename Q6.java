/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String nome = "";
            String[] lista = sc.nextLine().split(" ");
            if (lista[0].equals("wally")){
                break;
            }
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].length() == 5) {
                    nome = lista[i];
                }
            }
            if (nome.equals("")) {
                System.out.println("?");
            }
            else{
            System.out.println(nome);
            }
        }
    }
}
