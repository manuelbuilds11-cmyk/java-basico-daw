void main() {
    // Solicita por teclado el voltaje al usuario y lo convierte a número decimal (double)
    double voltaje = Double.parseDouble(IO.readln("Dime cual es la cantidad del voltaje: "));
    
    // Define el valor fijo de la resistencia del circuito obtenido del esquema (4 ohmios)
    int resistencia = 4;
    
    // Calcula la intensidad dividiendo el voltaje entre la resistencia (Ley de Ohm: I = V / R)
    double intensidad = (voltaje / resistencia);
    
    // Calcula la potencia multiplicando el voltaje por la intensidad (P = V * I)
    double potencia = (voltaje * intensidad);
    
    // Muestra por pantalla el resultado final de la potencia en vatios (W)
    IO.println("Finalmente la potencia vale un total de: " + (potencia) + "W");
}