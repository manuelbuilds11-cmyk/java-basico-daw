void main() {
  /*Ejercicios Prácticos: Clase Persona
  Creación básica de objetos:

  Crea dos objetos de tipo Persona. La primera debe tener 40 años, 2 hijos y un peso de 82,5 kilos. La segunda debe tener 19 años, sin hijos y un peso de 58,2 kilos. Imprime por pantalla la información de ambas personas utilizando los métodos correspondientes de la librería.

  Comparación de referencias:

  Añade una línea al código del ejercicio anterior que imprima por pantalla true o false evaluando si las variables de ambas personas apuntan al mismo objeto. ¿Qué valor se muestra y por qué ocurre esto a nivel de memoria?

  Referencias cruzadas y modificación:

  Crea una Persona con 45 años, 4 hijos y un peso de 90,0 kilos. A continuación, declara una nueva variable de tipo Persona y asígnale la referencia de la primera. Utiliza esta nueva variable para cambiar el peso de esa persona a 88,5 kilos. Imprime la información consultándola a través de ambas variables. ¿Qué valores se muestran finalmente y cómo lo justificas?

  Comprobación de identidad de referencias:

  Repite la comprobación de igualdad estricta (==) utilizando las variables del ejercicio anterior. ¿Qué valor se muestra por pantalla? Justifica detalladamente el motivo.

  Prueba de seguimiento de código (Tracing):
Persona p1 = new Persona();
p1.edad = 22;
p1.peso = 60.0;

Persona p2 = new Persona();
p2.edad = 50;
p2.peso = 75.5;

Persona p3 = null;
p3 = p1;
p3.edad = 23;

p1 = p2;

System.out.println("Edad p1 = " + p1.edad);
System.out.println("Edad p2 = " + p2.edad);
System.out.println("Edad p3 = " + p3.edad);

  Analiza el siguiente fragmento de código y deduce qué mostrarán las líneas finales antes de pasarlo al IDE:
  */
  
  //Ejercicio 1 
  Persona persona1 = new Persona();
  Persona persona2 = new Persona ();
  
persona1.edad=40;
persona1.numeroHijos=2;
persona1.peso=82.5;

persona2.edad=19;
persona2.numeroHijos=0;
persona2.peso=58.2;

IO.println("La primera persona tiene: "+persona1.edad+" años");
IO.println("La primera persona tiene un total de: "+persona1.numeroHijos+" hijos");
IO.println("La primera persona persa un total de: "+persona1.peso+ "kilogramos");

IO.println("La primera persona tiene: "+persona2.edad+" años");
IO.println("La primera persona tiene un total de: "+persona2.numeroHijos+" hijos");
IO.println("La primera persona persa un total de: "+persona2.peso+ " kilogramos");

//Ejercicio 2
IO.println("Las variables de ambas personas apuntan al mismo objeto: ");
IO.println(persona1==persona2);
/*En este caso sale falso ya que son dos 
personas distintas ya que no son el mismo objeto
*/
//Ejercicio 3

Persona persona3= new Persona();

persona3.edad=45;
persona3.numeroHijos=4;
persona3.peso=90.0;

Persona persona4=persona3;
 persona4.peso=88.5;
 
 IO.println("La tercera persona tiene: "+persona3.edad+" años");
 IO.println("La tercera persona tiene un total de: "+persona3.numeroHijos+" hijos");
 IO.println("La tercera persona persa un total de: "+persona3.peso+ "kilogramos");

 //Ejercicio 4
 
IO.println( persona4==persona3);
 /* En este caso sale verdadero ya que persona4 es una variable que pertenece 
  * a la persona3 por lo que forman parte del mismo objeto
  */

//Ejercicio 5 Prueba de segumiento del código

//Vale, en este código la edad de p1 sería de 50 años, p2 de 50 y p3 de 23


//Ejercicio 6

int edad = Integer.parseInt(IO.readln("Dime cual es tu edad: "));
int numeroHijos = Integer.parseInt(IO.readln("Dime cuantos hijos tienes : "));
double peso = Double.parseDouble(IO.readln("Dime cual es tu peso en kilogramos: "));

Persona persona5 = new Persona();

persona5.edad=edad;
persona5.numeroHijos=numeroHijos;
persona5.peso=peso;

IO.println("La quinta persona tiene: "+persona3.edad+" años");
IO.println("La quinta persona tiene un total de: "+numeroHijos+" hijos");
IO.println("La quinta  persona persa un total de: "+peso+ "kilogramos");


}