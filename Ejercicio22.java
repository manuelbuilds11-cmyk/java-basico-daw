void main() {
    double largo = Double.parseDouble(IO.readln("Dime el largo de la piscina: "));
    double ancho = Double.parseDouble(IO.readln("Dime el ancho de la piscina: "));
    double profundidad = Double.parseDouble(IO.readln("Dime la profundidad de la piscina: "));
    double precioLitros = Double.parseDouble(IO.readln("Dime a cuanto esta el precio por litro: "));
    
    double conversorLitros = (largo * ancho * profundidad) * 1000;
    double costeFinal = conversorLitros * precioLitros;
    
    IO.println("El coste final de la piscina es de: " + costeFinal + " €");
}