dias = ["Segunda-feira", "Terça-feira", "Quarta-feira", 
        "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"]

total_vendas = 0

for i in dias:
    venda_diaria = float(input(f"Valor arrecadado na {i}: "))
    total_vendas += venda_diaria

print("----------------------------")
print(f"Valor total arrecadado na semana: {total_vendas}")
