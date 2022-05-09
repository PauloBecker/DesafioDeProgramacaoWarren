
/*
Alguns números inteiros positivos n possuem uma propriedade na qual a soma de n + reverso(n) resultam em números ímpares.
Por exemplo, 36 + 63 = 99 e 409 + 904 = 1313. Considere que n ou reverso(n) não podem começar com 0.
Existem 120 números reversíveis abaixo de 1000. Construa um algoritmo que mostre na tela todos os números n onde
a soma de n + reverso(n) resultem em números ímpares que estão abaixo de 1 milhão.
 */

import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int[] num = new int[10001];
        int[] numReverse = new int[10001];
        int[] impar = new int[10001];
        int[] soma = new int[10001];
        int i = 1, cont = 0;

        for ( i = 1; i < 10000; i++) {
            num[i] += i;
            System.out.print("Numero inteiro [" + i + "]: " + num[i] + " ");
                while (num[i] > 0) {
                    numReverse[i] = (numReverse[i] * 10) + (num[i] % 10);
                    num[i] = num[i] / 10;
                    }

                    soma[i] = num[i] + numReverse[i];

                if (soma[i] % 2 != 0){
                    impar[i] = soma[i];
                    }
            System.out.println("| Numero reverso [" + i + "]: " + numReverse[i] + " ");
        }
        for (i = 1; i < 10000; i++) {
            cont++;

            System.out.println("Numero impar [" + i + "]: " + impar[i]);
        }
        System.out.println("Quantidade impar: " + cont);

    }
}


