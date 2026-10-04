void main() {
    double base = Double.parseDouble(IO.readln("Dame el valor de la base: "));
    double altura = Double.parseDouble(IO.readln("Dame el valor de la altura: "));
    double area = base * altura; 
    IO.readln("El área del rectángulo es de: " + area);
}