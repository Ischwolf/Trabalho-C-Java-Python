3. Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
vetor. Depois, mostrar na tela o nome da pessoa mais velha. 

---------------------------------------------------------------------------------------

#include <stdio.h>
#include <string.h>

int main() {
    int n;
    printf("Digite o número de pessoas: ");
    scanf("%d", &n);

    char nomes[n][50];
    int idades[n];

    for (int i = 0; i < n; i++) {
        printf("Digite o nome da pessoa: ");
        scanf("%s", nomes[i]);
        printf("Digite a idade da pessoa: ");
        scanf("%d", &idades[i]);
    }

    int indice_mais_velho = 0;
    for (int i = 1; i < n; i++) {
        if (idades[i] > idades[indice_mais_velho]) {
            indice_mais_velho = i;
        }
    }

    printf("A pessoa mais velha é: %s\n", nomes[indice_mais_velho]);

    return 0;
}

---------------------------------------------------------------------------------------
