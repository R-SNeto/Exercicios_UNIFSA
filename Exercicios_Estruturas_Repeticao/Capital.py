capital_inicial = float(input("Digite o valor do capital inicial: "))
aporte_mensal = float(input("Digite o valor do aporte mensal: "))
taxa_de_juros = float(input("Digite o valor da taxa de juros: "))

capital_total = capital_inicial
capital_dobrado = capital_inicial * 2
meses = 1

while capital_total < capital_dobrado:
    capital = capital_total + (taxa_de_juros * capital_total / 100)

    capital_total = capital + aporte_mensal

    print(f"Saldo no mês {meses}: {capital_total}")

    meses += 1

anos = 0

if meses % 12 == 0:
    anos = meses / 12
    print(f"\nObjetivo atingido em {anos} anos")
elif(meses < 12):
    print(f"\nObjetivo atigindo em {meses} meses")
else:
    anos = int(meses / 12)
    meses = meses % 12

    print(f"\nObjetivo atingido em {anos} anos e {meses - 1} meses")


    