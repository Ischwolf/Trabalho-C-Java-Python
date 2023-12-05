3. Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
vetor. Depois, mostrar na tela o nome da pessoa mais velha.

---------------------------------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int n = input.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nomes[i] = input.next();
            System.out.print("Digite a idade da pessoa: ");
            idades[i] = input.nextInt();
        }

        int indice_mais_velho = 0;
        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[indice_mais_velho]) {
                indice_mais_velho = i;
            }
        }

        System.out.println("A pessoa mais velha é: " + nomes[indice_mais_velho]);
    }
}

---------------------------------------------------------------------------------------
