1. Escreva um programa que receba a velocidade máxima em uma avenida e a
velocidade com que um motorista estava dirigindo nela. Calcule a multa que o
motorista vai receber, considerando que são pagos R$ 5,00 por km/h que estiver
acima da velocidade permitida (considere apenas números inteiros). Se a
velocidade do motorista estiver dentro do limite, o programa deve informar que não
há multa. 

---------------------------------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a velocidade máxima da via: ");
        int velocidadeMaxima = input.nextInt();
        System.out.print("Digite a velocidade do motorista: ");
        int velocidadeMotorista = input.nextInt();

        if (velocidadeMotorista > velocidadeMaxima) {
            int multa = (velocidadeMotorista - velocidadeMaxima) * 5;
            System.out.println("O motorista receberá uma multa de R$ " + multa);
        } else {
            System.out.println("O motorista não receberá multa");
        }
    }
}

---------------------------------------------------------------------------------------
