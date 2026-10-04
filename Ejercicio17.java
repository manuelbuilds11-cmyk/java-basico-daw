void main() {
    double presupuestoTotal = Double.parseDouble(IO.readln("Dime el presupuesto del hospital: "));
    double departamentoGinecologia = presupuestoTotal * 0.4;
    double departamentoTraumatologia = presupuestoTotal * 0.35;
    double departamentoPediatria = presupuestoTotal * 0.25;

    IO.println("El presupuesto de Ginecologia es: " + departamentoGinecologia + "€");
    IO.println("El presupuesto de Traumatologia es: " + departamentoTraumatologia + "€");
    IO.println("El presupuesto de Pediatria es: " + departamentoPediatria + "€");
}