void main() {
    double salarioBase = 1200.0;
    double comision = 0.1;
    double importeVenta1 = 50.0;
    double importeVenta2 = 100.0;
    double importeVenta3 = 250.0;
    double gananciaTotal = salarioBase + (comision * (importeVenta1 + importeVenta2 + importeVenta3));
    IO.println(gananciaTotal);
}