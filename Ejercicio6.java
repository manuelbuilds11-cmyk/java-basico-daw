void main() {
    double pesetas = Double.parseDouble(IO.readln("Dime la cantidad de pesetas: "));
    double euros = (pesetas / 166.386);
    IO.readln("La cantidad convertida a euros es: " + (euros) + "€");
}