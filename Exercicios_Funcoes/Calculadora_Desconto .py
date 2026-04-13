valor_produto = float(input("Valor do produto: "))
porcentagem_produto = float(input("Porcentagem do desconto: "))

def desconto_produto (valor_produto, porcentagem_produto):
    desconto = valor_produto - porcentagem_produto / 100 * valor_produto 
    return desconto

print(f"Valor do produto com desconto: {desconto_produto(valor_produto, porcentagem_produto)}")

