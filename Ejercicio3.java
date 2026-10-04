void main() {
//Ejercicio 3
double base = Double.parseDouble(IO.readln("Dame la base: "));
double IVA = (base*0.21);
double totalFactura = (base+IVA);
IO.println("La factura total es "+(totalFactura));
}