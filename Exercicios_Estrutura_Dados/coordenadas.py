coordenadas = []
contador = 0

while True:
    contador += 1
    x = float(input(f"Digite a {contador}º coordenada x: "))
    y = float(input(f"Digite a {contador}º coordenada y: "))

    coordenadas.append((x, y))

    sn = input("Deseja adicionar outra coordenada?[s/n] ")
    if sn == "n":
        break

print("Coordenadas:")
for x, y in coordenadas:
    print(f"Coordenada x-y: {x} - {y}")