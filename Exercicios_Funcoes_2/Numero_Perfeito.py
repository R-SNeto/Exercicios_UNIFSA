def verificar_perfeito(num):
    soma = 0
    
    for i in range(1, num):
        if num % i == 0:
            soma += i
            
    return soma == num

def exibir_perfeitos(n):
    for i in range(1, n + 1):
        if verificar_perfeito(i):
            print(i)

n = int(input("Digite um número inteiro positivo: "))

if n < 1:
    print("Digite um número válido.")
else:
    print("Números perfeitos até", n, ":")
    exibir_perfeitos(n)