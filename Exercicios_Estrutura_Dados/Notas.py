nome = input("Digite o nome do aluno: ")

soma = 0
contador = 0

while True:
    nota = float(input("Digite uma nota: "))

    soma += nota
    contador += 1

    sim_nao = input("Deseja adicionar outra nota[s/n]? ")

    if sim_nao == "n":
        break

if contador > 0:
    media = soma / contador
else:
    media = 0

print(f"Aluno: {nome}")
print(f"Média: {media:.2f}")