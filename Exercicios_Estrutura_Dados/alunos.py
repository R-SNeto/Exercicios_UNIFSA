alunos = {}

for i in range(3):
    nome = input(f"Digite o nome do {i+1}º aluno: ")
    nota = float(input(f"Digite a nota de {nome}: "))
    alunos[nome] = nota

busca = input("\nDigite o nome do aluno que deseja consultar: ")

if busca in alunos:
    print(f"Nota de {busca}: {alunos[busca]}")
else:
    print("Aluno não encontrado.")