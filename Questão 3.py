3. Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
vetor. Depois, mostrar na tela o nome da pessoa mais velha.

---------------------------------------------------------------------------------------

def pessoa_mais_velha(nomes, idades):
    indice_mais_velho = idades.index(max(idades))
    return nomes[indice_mais_velho]

nomes = []
idades = []

n = int(input("Digite o número de pessoas: "))

for i in range(n):
    nome = input("Digite o nome da pessoa: ")
    idade = int(input("Digite a idade da pessoa: "))
    nomes.append(nome)
    idades.append(idade)

mais_velho = pessoa_mais_velha(nomes, idades)
print(f"A pessoa mais velha é: {mais_velho}")

---------------------------------------------------------------------------------------
