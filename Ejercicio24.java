void main() {
    // Pide al usuario la duración de la llamada en minutos y la convierte a número decimal (double)
    double duracionMinutos = (Double.parseDouble(IO.readln("Dime la duración de la llamada en minutos: ")));
    
    // Define el coste fijo de establecimiento de llamada
    double costeEstablecimiento = (0.20);
    
    // Define el coste por cada minuto de llamada
    double costeMinuto = (0.15);
    
    // Calcula el coste total multiplicando los minutos por el coste por minuto y sumándole el establecimiento
    double costeTotal = ((duracionMinutos * costeMinuto) + costeEstablecimiento);
    
    // Muestra por pantalla el coste total de la llamada con su símbolo de euro
    IO.println("El coste total de esta llamada es de: " + costeTotal + " €");
}