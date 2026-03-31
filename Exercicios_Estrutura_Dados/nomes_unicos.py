lista = []
contador = 0

while True:
    contador += 1
    nome = input(f"Digite o {contador}º nome: ")
    lista.append(nome)

    sn = input("Deseja adicionar outro nome?[s/n] ")
    if sn == "n":
        break
    
nomes_unicos = set(lista)

print("Nomes únicos:")
for nome in nomes_unicos:
    print(nome)
