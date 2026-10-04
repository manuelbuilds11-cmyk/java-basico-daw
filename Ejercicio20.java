void main() {
    double base = Double.parseDouble(IO.readln("Dime el valor de la base: "));
    double ladoIzquierdo = Double.parseDouble(IO.readln("Dime el valor del lado izquierdo: "));
    double ladoDerecho = Double.parseDouble(IO.readln("Dime el valor del lado derecho : "));
    double areaRectangulo = base * ladoDerecho;
    double areaTriangulo = (base * (ladoIzquierdo - ladoDerecho)) / 2;
    double areaTotal = areaRectangulo + areaTriangulo;
    
    IO.print("El area total de esta figura mide: " + areaTotal);
}