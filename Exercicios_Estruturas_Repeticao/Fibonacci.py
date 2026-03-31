numero = int(input("Até qual número da sequência você quer ir? "))

N1 = 1
print(N1)
N2 = 1
print(N2)

for i in range(numero - 2):
    N3 = N1 + N2
    print(N3)
    N1 = N2
    N2 = N3
    