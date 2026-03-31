altura = int(input("Digite a altura da pirâmide: "))

for i in range(1, altura + 1):
    espacos = altura - i
    hashes = 2 * i - 1

    print(" " * espacos + "#" * hashes)