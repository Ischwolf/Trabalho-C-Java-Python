1. Escreva um programa que receba a velocidade máxima em uma avenida e a
velocidade com que um motorista estava dirigindo nela. Calcule a multa que o
motorista vai receber, considerando que são pagos R$ 5,00 por km/h que estiver
acima da velocidade permitida (considere apenas números inteiros). Se a
velocidade do motorista estiver dentro do limite, o programa deve informar que não
há multa. 

---------------------------------------------------------------------------------------

#include <stdio.h>

int main() {
    int velocidadeMaxima, velocidadeMotorista;
    printf("Digite a velocidade máxima da via: ");
    scanf("%d", &velocidadeMaxima);
    printf("Digite a velocidade do motorista: ");
    scanf("%d", &velocidadeMotorista);

    if (velocidadeMotorista > velocidadeMaxima) {
        int multa = (velocidadeMotorista - velocidadeMaxima) * 5;
        printf("O motorista receberá uma multa de R$ %d\n", multa);
    } else {
        printf("O motorista não receberá multa\n");
    }

    return 0;
}

---------------------------------------------------------------------------------------
