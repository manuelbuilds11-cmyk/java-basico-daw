void main() {
    double produccionEnLitros = Double.parseDouble(IO.readln("Dime cuantos litros de leche has producido hoy: "));
    double reciboGalones = produccionEnLitros / 3.785;
    
    IO.println("Recibiras un total de: " + reciboGalones + " galones");
}