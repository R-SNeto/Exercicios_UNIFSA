print("GENNERA\n")

nota = []

for i in range(3):
    notas = float(input(f"Digite a {i+1}º nota: "))
    nota.append(notas)

total_notas = sum(nota)

def media_notas(total_notas):
    media_notas = total_notas / 3
    return media_notas

media_notas = media_notas(total_notas)

def situacao (media_notas):
    media = media_notas
    if (media >= 7):
        return True
    else:
        return False

print(f"Média das notas do aluno X: {media_notas:.2f}")

if(situacao(media_notas)):
    print("Aluno APROVADO")
else:
    print("Aluno REPROVADO")


