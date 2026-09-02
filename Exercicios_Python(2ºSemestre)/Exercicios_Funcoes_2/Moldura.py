def montar_figura (linhas, colunas):
    if colunas < 2: colunas = 2
    if linhas < 2: linhas = 2

    print("+" + ("-" * (colunas - 2)) + "+")

    for i in range(linhas - 2 ):
        print("|" + (" " * (colunas - 2)) + "|")
    
    print("+" + ("-" * (colunas - 2)) + "+")



linhas = int(input("Quantas linhas terá o retângulo? (min: 1, max 20) "))
if (linhas > 20):
    print("Valor máximo de linhas ultrapassado, valor arredondado para o número mais próximo")
    linhas = 20
elif (linhas < 1): 
    print("Valor mínimo de linhas ultrapassado, valor arredondado para o número mais próximo")
    linhas = 1

colunas = int(input("Quantas colunas terá o retângulo? (min: 1, max 20) "))
if (colunas > 20):
    print("Valor máximo de colunas ultrapassado, valor arredondado para o número mais próximo")
    colunas = 20
elif (colunas < 1): 
    print("Valor mínimo de colunas ultrapassado, valor arredondado para o número mais próximo")
    colunas = 1

montar_figura(linhas, colunas)
