2. Fazer um programa que recebe duas notas parciais de um aluno (0 a 100) e
informa se ele está aprovado (média maior ou igual a 70), em exame final (média
entre 40 e 69) ou reprovado (média menor do que 40). Caso esteja em exame o
programa deve pedir a nota do exame (0 a 100) e informar se o aluno está
aprovado (média mais nota do exame maior ou igual a 100) ou reprovado (média
mais nota do exame menor do que 100).

--------------------------------------------------------------------------------------

#include <stdio.h>

int main() {
    int nota1, nota2, nota_exame;
    printf("Digite a primeira nota do aluno: ");
    scanf("%d", &nota1);
    printf("Digite a segunda nota do aluno: ");
    scanf("%d", &nota2);

    int media = (nota1 + nota2) / 2;

    if (70 <= media <= 100) {
        printf("O aluno está aprovado\n");
    } else if (40 <= media < 70) {
        printf("O aluno está em exame final\n");
        scanf("%d", &nota_exame);
        if (100 >= nota_exame) {
            printf("O aluno está aprovado\n");
        } else {
            printf("O aluno está reprovado\n");
        }
    } else {
        printf("O aluno está reprovado\n");
    }

    return 0;
}

--------------------------------------------------------------------------------------
