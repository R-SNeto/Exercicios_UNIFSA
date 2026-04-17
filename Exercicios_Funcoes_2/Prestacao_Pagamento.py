def valor_pagamento(valor, dias_atraso):
    if dias_atraso == 0:
        return valor
    else:
        multa = valor * 0.03
        juros = valor * 0.001 * dias_atraso
        return valor + multa + juros

total_pago = 0
quantidade = 0

while True:
    valor = float(input("Digite o valor da prestação (0 para encerrar): "))

    if valor == 0:
        break

    dias_atraso = int(input("Digite o número de dias em atraso: "))

    valor_final = valor_pagamento(valor, dias_atraso)

    print(f"Valor a ser pago: R$ {valor_final:.2f}")

    total_pago += valor_final
    quantidade += 1

print("\nRelatório do dia:")
print(f"Quantidade de prestações pagas: {quantidade}")
print(f"Valor total pago: R$ {total_pago:.2f}")