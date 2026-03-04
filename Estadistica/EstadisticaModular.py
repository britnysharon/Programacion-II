import math
def promedio(num):
    suma = 0
    for i in num:
        suma =suma+i
    return suma / len(num)

def desviacion(num):
    p = promedio(num)
    suma = 0
    for i in num:
        suma = suma+((i-p)**2)
    return math.sqrt(suma/(len(num)-1))
numeros = []
print("Ingrese 10 numeros:")
for i in range(10):
    n = float(input())
    numeros.append(n)
print("El promedio es", round(promedio(numeros), 2))
print("La desviacion estandar es", round(desviacion(numeros), 5))