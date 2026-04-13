nome = input("Primeiro Nome: ")
sobrenome = input("Sobrenome: ")
plataforma = input("Nome da plataforma (siglas): ")

def gerar_email(nome, sobrenome, plataforma):
    nome = nome.lower()
    sobrenome = sobrenome.lower()
    plataforma = plataforma.lower()
    
    return f"{nome}.{sobrenome}@{plataforma}.com"

print(f"{gerar_email(nome, sobrenome, plataforma)}")