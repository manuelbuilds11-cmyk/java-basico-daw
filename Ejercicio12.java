void main() {
    double radio = Double.parseDouble(IO.readln("Dime el radio del cono: "));
    double altura = Double.parseDouble(IO.readln("Dime la altura del cono: "));
    double volumenCono = (1.0 / 3.0) * 3.14 * radio * radio * altura;
    IO.println("El volumen del cono es de: " + volumenCono);
}