void main() {
int digitos = (Integer.parseInt(IO.readln(" Dime un numero: ")));
boolean incluido = (digitos<9|| digitos>=100)&&(digitos>=-9 || digitos<=-100);
IO.println(incluido);
}