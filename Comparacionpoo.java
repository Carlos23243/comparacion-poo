# Programación Tradicional: calcular el promedio semanal del clima

def obtener_temperaturas():
    temperaturas = []
    dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]
    
    for dia in dias:
        temp = float(input(f"Ingrese la temperatura del día {dia}: "))
        temperaturas.append(temp)
    
    return temperaturas

def calcular_promedio(temperaturas):
    suma = sum(temperaturas)
    promedio = suma / len(temperaturas)
    return promedio

def main():
    print("== PROMEDIO SEMANAL DEL CLIMA ==")
    temperaturas = obtener_temperaturas()
    promedio = calcular_promedio(temperaturas)
    print(f"El promedio semanal de temperatura es: {promedio:.2f}°C")

main()

# Programación Orientada a Objetos: calcular el promedio semanal del clima

class SemanaClimatica:
    def __init__(self):
        self.dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]
        self.temperaturas = []

    def registrar_temperaturas(self):
        for dia in self.dias:
            temp = float(input(f"Ingrese la temperatura del día {dia}: "))
            self.temperaturas.append(temp)

    def calcular_promedio(self):
        if not self.temperaturas:
            return 0
        return sum(self.temperaturas) / len(self.temperaturas)

    def mostrar_resultado(self):
        promedio = self.calcular_promedio()
        print(f"El promedio semanal de temperatura es: {promedio:.2f}°C")

def main():
    print("== PROMEDIO SEMANAL DEL CLIMA (POO) ==")
    semana = SemanaClimatica()
    semana.registrar_temperaturas()
    semana.mostrar_resultado()

main()

