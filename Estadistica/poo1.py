import math
class Estadistica:
    def __init__(self, datos):
        self.datos = datos
    def promedio(self):
        suma = 0
        for i in self.datos:
            suma = suma+i
        return suma/len(self.datos)
    def desviacion(self):
        p = self.promedio()
        suma = 0
        for i in self.datos:
            suma = suma +((i-p)**2)
        return math.sqrt(suma/(len(self.datos)-1))
numeros = []
print("Ingrese 10 numeros:")
for i in range(10):
    n = float(input())
    numeros.append(n)
est = Estadistica(numeros)
print("El promedio es", round(est.promedio(), 2))
print("La desviacion estandar es", round(est.desviacion(), 5))