void main() {
  
  //Ejercicio 9

  IO.println("CalculadoraBasicaApp");
  
  String operacion = (IO.readln("Introduce la operación a realizar (S para suma, R para resta,P  para producto y D para división: "));
  
  

  
  
  if (operacion.equalsIgnoreCase("S")) {
    double primerOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del primer operando: "));
    
    double segundoOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del segundo operando: "));
   
    IO.println("El resultado de sumar " +primerOperando+" y "+segundoOperando+" vale "+ (primerOperando+segundoOperando));
  
  }else if(operacion.equalsIgnoreCase("R")) {
   
    double primerOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del primer operando: "));
    
    double segundoOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del segundo operando: "));
   
    IO.println("El resultado de restar "+primerOperando+" y "+segundoOperando+" vale "+ (primerOperando-segundoOperando));
  }else if(operacion.equalsIgnoreCase("P")) {
    
    double primerOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del primer operando: "));
    
    double segundoOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del segundo operando: "));
   
    IO.println("El resultado del producto "+primerOperando+" y "+segundoOperando+" vale "+ (primerOperando*segundoOperando));
  }else if(operacion.equalsIgnoreCase("D")) {
    
    double primerOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del primer operando: "));
    
    double segundoOperando = Double.parseDouble(IO.readln("Dime cuanto sería el valor del segundo operando: "));
   
    IO.println("El resultado de dividir "+primerOperando+" y "+segundoOperando+" vale "+ (primerOperando/segundoOperando));
  }else{
    
    IO.println("Este carácter no tiene ningún significado en el programa, prueba mejor con S(sumar), R (restar), P( para el producto) y D(para la división)");
    
  }

  //Ejercicio 10

    IO.println("ClasificaTriángulosApp");
  
  double lado1= Double.parseDouble(IO.readln("Dime cuanto midel el  primer lado del triángulo: ")); 
  
  double lado2= Double.parseDouble(IO.readln("Dime cuanto midel el  primer lado del triángulo: ")); 
  
  double lado3= Double.parseDouble(IO.readln("Dime cuanto midel el  primer lado del triángulo: ")); 
  
  
  if(lado1==lado2&&lado2==lado3) {
    IO.println("Al tener los tres lados el mismo valor se trata de un triángulo equilátero");
    
  }else if(((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))) {
    IO.println("Dos lados son iguales y el tercero es diferente, esto significa que es un triángulo isósceles");
  }else {
   IO.println( "Al ser todos los lados diferentes el triángulo es escaleno ");
  }

//Ejercicio 11

  IO.println("SituaciónAlumnoApp");
  
  double notaMates1 = Double.parseDouble(IO.readln("Dime cual es la nota en la asignatura de Matemáticas: "));
  
  double notaLengua1 = Double.parseDouble(IO.readln("Dime cual es la nota en la asignatura de Lengua: "));
  
  
  if (notaMates1>=5&&notaLengua1>=5) {
    
    IO.println("Pasa sin pendientes");
  
  }else if (notaMates1<5&&notaLengua1>=5||notaMates1>=5&&notaLengua1<5) {
    IO.println("Pasa con una pendiente");
  
  }else{
    IO.println("El alumno repite");
    
  }

  //Ejercicio 12

    IO.println("CalificaciónGlobalApp");
  
  double notaMates = Double.parseDouble(IO.readln("Dime cual es la nota en la asignatura de Matemáticas(0-10): "));
  
  double notaLengua = Double.parseDouble(IO.readln("Dime cual es la nota en la asignatura de Lengua(0-10): "));
  
  double notaIngles = Double.parseDouble(IO.readln("Dime cual es la nota en la asignatura de Inglés(0-10): "));
  
 double calculo = (notaMates+notaLengua+notaIngles)/3;

  if(notaMates<3||notaLengua<3||notaIngles<3) {
    IO.println("Necesita mejora urgente");
  }else if(notaMates>=5&&notaLengua>=5&&notaIngles>=5&&calculo>=7) {
    IO.println("Excelente");
  }else{
      IO.println("Aprobado");
    }

    //Ejercicio 13

      IO.println("EcuacionesSegundoGradoApp");
  
  double a = Double.parseDouble(IO.readln("Introduce el coeficiente a: "));
  
  double b = Double.parseDouble(IO.readln("Introduce el coeficiente b: "));
  
  double c = Double.parseDouble(IO.readln("Introduce el coeficiente c: "));
    
  double discriminante = (b*b)-(4*a*c);
  
  if(discriminante>0) {
    
    double x1= (-b + Math.sqrt(discriminante))/(2*a);
    double x2=(-b - Math.sqrt(discriminante))/(2*a);
    IO.println("La ecuación tiene dos raíces reales y distintas: x1 = " + x1 + " y x2 = " + x2);
  }
  else if(discriminante==0) {
    double x = -b/(2*a);
    
    IO.println("Las dos raíces son reales e iguales: x = "+ x);
    
  }else {
    IO.println("La ecuación no tiene soluciones reales");
  }
  
  //Ejercicio 14

   IO.println("NumeroCifrasApp");
  
  int numero = Integer.parseInt(IO.readln("Introduce un número entero y te diré cuantas cifras tiene: " ));
  
  if(numero<=9&&numero>=0||(numero>=-9&&numero<=-1)) {
    IO.println("El número tiene una cifra");
 
  }else if(numero<=99&&numero>=10||numero>=-99&&numero<=-10){
    IO.println("El número tiene dos cifras");
  
  }else if(numero>=100&&numero<=999||numero<=-100&&numero>=-999) {
    IO.println("El número tiene tres cifras");
  }else {
    IO.println("El número tiene  más de  tres cifras");
  }
  
  //Ejercicio 15

   IO.println("MayorDeDosApp");
  
 int numero1 = Integer.parseInt(IO.readln("Dime el valor del primer número: "));
 
 int numero2 = Integer.parseInt(IO.readln("Dime el valor del segundo  número: "));
  

 String mensaje =(numero1>numero2)? ("El primer número es mayor que el segundo"):("El segundo número es mayor que el primero");

IO.println(mensaje);

//Ejercicio 16

void main() {

 IO.println("MayorTresApp");
  
 int numero1 = Integer.parseInt(IO.readln("Dime el valor del primer número: "));
 
 int numero2 = Integer.parseInt(IO.readln("Dime el valor del segundo  número: "));
  
 int numero3 = Integer.parseInt(IO.readln("Dime el valor del tercer  número: "));

 String mensaje1 = (numero1 > numero2 && numero1 > numero3)  ? "El primer número es el mayor"  : "El primer número no es el mayor";

String mensaje2= (numero2>numero1&&numero2>numero3) ? "El segundo número es el mayor": "El segundo número no es el mayor";

String mensaje3 = (numero3>numero1&&numero3>numero2) ? "El tercer número es el mayor": "El tercer número no es el mayor";

IO.println(mensaje1);

IO.println(mensaje2);

IO.println(mensaje3);

}











































































































