public class Ejercicio10 {
void main() {
    double base = Double.parseDouble(IO.readln("Dime el valor de la base: "));
    double IVA = Double.parseDouble(IO.readln("Dime el valor de el IVA: "));
    double facturaTotal = base * IVA; 
    IO.println("El valor de la factura total es de: " + facturaTotal + "€");
}
}
