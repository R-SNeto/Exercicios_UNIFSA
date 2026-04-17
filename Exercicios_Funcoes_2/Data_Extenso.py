def converter_data_extenso(data):
    meses = ["janeiro", "fevereiro", "março", "abril", 
             "maio", "junho", "julho", "agosto", 
             "setembro", "outubro", "novembro", "dezembro"]
    
    if(data[3] == "/" or data[6] == "/" or len(data) != 10):
        return None

    dia = int(data[0:2])

    mes_inteiro = int(data[3:5])
    mes_extenso = meses[mes_inteiro - 1]

    ano = int(data[6:])

    return f"dia {dia} de {mes_extenso} do ano de {ano}"

data = input("Digite uma data no formato (dd/MM/yyyy): ")

if (converter_data_extenso(data) == None):
    print("Data inválida")
else:
    print(f"Data por extenso: {converter_data_extenso(data)}")
