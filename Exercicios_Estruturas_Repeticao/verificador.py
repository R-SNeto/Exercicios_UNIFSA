numero = int(input("Digite um número: "))

soma = 0

while numero > 0:
    digito = numero % 10
    soma += digito
    numero = numero // 10

print("Soma dos dígitos:", soma)