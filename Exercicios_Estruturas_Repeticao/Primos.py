valor_fornecido = int(input("Valor fornecido: "))

if valor_fornecido < 2:
    print("Chave inválida")
elif valor_fornecido == 2:
    print("Chave válida")
else:
    valor_raiz = int(valor_fornecido**0.5)
    primo = True
    for i in range(2, valor_raiz + 1):
        if valor_fornecido % i == 0:
            print("Chave inválida")
            primo = False
            break;

if primo:
    print("Chave válida")
        
        



