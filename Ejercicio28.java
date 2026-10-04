void main() {
int primeraPersona = Integer.parseInt(IO.readln("Dime cual es tu edad: "));
int segundaPersona = Integer.parseInt(IO.readln("Dime cual es tu edad: "));
int terceraPersona = Integer.parseInt(IO.readln("Dime cual es tu edad: "));
boolean mayor =(primeraPersona>segundaPersona&&segundaPersona>terceraPersona);
IO.println(mayor);
}