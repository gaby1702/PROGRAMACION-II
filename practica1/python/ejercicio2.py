class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def getDiscriminante(self):
        return (self.b * self.b) - (4 * self.a * self.c)

    def getRaiz1(self):
        if self.getDiscriminante() >= 0:
            return (-self.b + (self.getDiscriminante() ** 0.5)) / (2 * self.a)
        else:
            return 0

    def getRaiz2(self):
        if self.getDiscriminante() >= 0:
            return (-self.b - (self.getDiscriminante() ** 0.5)) / (2 * self.a)
        else:
            return 0


# Ejemplo fijo (sin input)
eq = EcuacionCuadratica(1, 3, 1)
d = eq.getDiscriminante()

if d > 0:
    print("La ecuacion tiene dos raices", eq.getRaiz1(), "y", eq.getRaiz2())
elif d == 0:
    print("La ecuacion tiene una raiz", eq.getRaiz1())
else:
    print("La ecuacion no tiene raices reales.")
