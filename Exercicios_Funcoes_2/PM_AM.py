def converter_hora(hora, minuto):
    if hora == 0:
        return 12, minuto, 'A'
    elif 1 <= hora < 12:
        return hora, minuto, 'A'
    elif hora == 12:
        return 12, minuto, 'P'
    else:
        return hora - 12, minuto, 'P'


def exibir_hora(hora, minuto, periodo):
    if periodo == 'A':
        periodo_str = "A.M."
    else:
        periodo_str = "P.M."
        
    print(f"{hora}:{minuto:02d} {periodo_str}")


hora = int(input("Digite a hora (0-23): "))
minuto = int(input("Digite os minutos (0-59): "))

if hora < 0 or hora > 23 or minuto < 0 or minuto > 59:
    print("Horário inválido.")
else:
    h, m, p = converter_hora(hora, minuto)
    exibir_hora(h, m, p)

   