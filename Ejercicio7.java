void main() {
    double euros = Double.parseDouble(IO.readln("Dime la cantidad de euros: ")); 
    double pesetas = (euros * 166.386);
    IO.readln("La cantidad convertida a pesetas es: " + (pesetas));
}