package aulas.aula01;

import java.util.Scanner;


public class Aula01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para saber se é Primo: ");
        long numero = scan.nextLong();
        System.out.println(testePrimo(numero));


    }
    static boolean testePrimo(long numero){
        if(numero == 1) return false;
        if(numero == 2) return true;
        if(numero % 2 ==0 ) return false;
        for (int j = 3; j < numero/2; j++) {
            if(numero % j == 0)
                return false;
        }
                return true;
    }
}