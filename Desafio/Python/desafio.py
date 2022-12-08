bruto = float(input('digite o valor bruto do salário:'))
adicional = float(input('digite o valor do adicional'))

if bruto <= 1100.0:
    total = (bruto -(bruto * 0.05))+ adicional
elif bruto <=2500.0:
    total = (bruto -(bruto*0.1)) + adicional
elif bruto > 2500.0:
    total = (bruto -(bruto*0.15)) + adicional

print(total)