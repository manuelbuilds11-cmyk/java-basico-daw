void main() {
    int horas = Integer.parseInt(IO.readln("Dime el numero de horas semanales: "));
    double salarioSemanal = (horas * 12);
    IO.println("El salario semanal es de: " + (salarioSemanal));
}