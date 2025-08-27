class Estadisticas:
    def __init__(self, datos):
        self.datos = datos

    def promedio(self):
        suma = 0
        for x in self.datos:
            suma += x
        return suma / len(self.datos)

    def desviacion(self):
        prom = self.promedio()
        suma = 0
        for x in self.datos:
            suma += (x - prom) ** 2
        return (suma / (len(self.datos) - 1)) ** 0.5


# Ejemplo con datos fijos
valores = [1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2]

est = Estadisticas(valores)

print("El promedio es", est.promedio())
print("La desviacion estandar es", est.desviacion())