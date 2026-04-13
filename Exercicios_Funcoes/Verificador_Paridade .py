print("DESCUBRA SE SEU VALOR É PAR OU ÍMPAR!!! \n")
numero = int(input("Digite um valor: "))

def e_par (numero):
    if(numero % 2 == 0):
        return True
    else:
        return False

if(e_par(numero)):
    print("Valor par!")
else:
    print("Valor ímpar!")