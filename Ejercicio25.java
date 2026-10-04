void main() {
    // Solicita un número entero por teclado al usuario y lo convierte de texto a número entero
    int numeroEntero = Integer.parseInt(IO.readln("Dime un número entero: "));
    
    // Comprueba si el número es divisible entre 2 (resto 0); guarda true si es par o false si es impar
    boolean par = (numeroEntero % 2 == 0);
    
    // Muestra por pantalla el valor booleano resultante (true si es par, false en caso contrario)
    IO.println(par);
}