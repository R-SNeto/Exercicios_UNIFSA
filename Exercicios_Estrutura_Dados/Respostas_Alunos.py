respostas = [
    "Python", "Java", "Python", "C++", "Java",
    "Python", "JavaScript", "Python", "C++"
]

linguagens = set(respostas)
print("Linguagens: ")
for linguagem in linguagens:
    print(linguagem)

contagem = {}

for linguagem in respostas:
    if linguagem in contagem:
        contagem[linguagem] += 1
    else:
        contagem[linguagem] = 1

print("\nContagem de cada linguagem:")
for linguagem, qtd in contagem.items():
    print(f"{linguagem}: {qtd}")

mais_escolhida = max(contagem, key=contagem.get)

print("\nLinguagem mais escolhida:")
print(f"{mais_escolhida} ({contagem[mais_escolhida]} votos)")