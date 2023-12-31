2. Fazer um programa que recebe duas notas parciais de um aluno (0 a 100) e
informa se ele está aprovado (média maior ou igual a 70), em exame final (média
entre 40 e 69) ou reprovado (média menor do que 40). Caso esteja em exame o
programa deve pedir a nota do exame (0 a 100) e informar se o aluno está
aprovado (média mais nota do exame maior ou igual a 100) ou reprovado (média
mais nota do exame menor do que 100).

--------------------------------------------------------------------------------------


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        int nota1 = input.nextInt();
        System.out.print("Digite a segunda nota do aluno: ");
        int nota2 = input.nextInt();

        int media = (nota1 + nota2) / 2;

        if (70 <= media <= 100) {
            System.out.println("O aluno está aprovado");
        } else if (40 <= media < 70) {
            System.out.println("O aluno está em exame final");
            int nota_exame = input.nextInt();
            if (100 >= nota_exame) {
                System.out.println("O aluno está aprovado");
            } else {
                System.out.println("O aluno está reprovado");
            }
        } else {
            System.out.println("O aluno está reprovado");
        }
    }
}


--------------------------------------------------------------------------------------
