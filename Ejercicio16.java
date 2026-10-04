void main() {
    double inversion1 = Double.parseDouble(IO.readln("Introduce la inversión de la persona 1: "));
    double inversion2 = Double.parseDouble(IO.readln("Introduce la inversión de la persona 2: "));
    double inversion3 = Double.parseDouble(IO.readln("Introduce la inversión de la persona 3: "));
    
    double total = inversion1 + inversion2 + inversion3;
    
    double porcentaje1 = (inversion1 / total) * 100;
    double porcentaje2 = (inversion2 / total) * 100;
    double porcentaje3 = (inversion3 / total) * 100;
    
    IO.println("La primera persona invierte un " + porcentaje1 + "%");
    IO.println("La segunda persona invierte un " + porcentaje2 + "%");
    IO.println("La tercera persona invierte un " + porcentaje3 + "%");
}