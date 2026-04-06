funcionarios = {}

for i in range(3):
    print(f"\nCadastro do funcionário {i+1}")
    
    nome = input("Nome: ")
    cargo = input("Cargo: ")
    salario = float(input("Salário: "))
    
    funcionarios[nome] = [cargo, salario]

print("\n--- Atualizar Salário ---")
nome_atualizar = input("Digite o nome do funcionário: ")

if nome_atualizar in funcionarios:
    novo_salario = float(input("Novo salário: "))
    funcionarios[nome_atualizar][1] = novo_salario
else:
    print("Funcionário não encontrado.")

print("\n--- Lista de Funcionários ---")
for nome, dados in funcionarios.items():
    print(f"Nome: {nome}")
    print(f"Cargo: {dados[0]}")
    print(f"Salário: R$ {dados[1]}")
    print("-" * 30)