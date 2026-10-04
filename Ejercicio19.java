void main() {
    double radioCircunferencia = Double.parseDouble(IO.readln("Dime el radio de la circunferencia: "));
    double longitudDeCircunferencia = 2 * 3.14 * radioCircunferencia;
    double areaDelCirculo = 3.14 * (radioCircunferencia * radioCircunferencia);
    
    IO.println("La longitud de la circunferencia es de: " + longitudDeCircunferencia);
    IO.println("El área del circulo es de: " + areaDelCirculo);
}