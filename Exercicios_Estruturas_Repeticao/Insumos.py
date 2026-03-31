insumos = int(input("Digite a quantidade de insumos do dia: "))
contador = 0

insumos_total = insumos

while contador < insumos_total:
    print(f"Quantidade de insumos restante: {insumos}")
    insumos -= 1
    contador += 1   
