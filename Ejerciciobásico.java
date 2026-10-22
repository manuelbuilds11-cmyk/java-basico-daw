void main() {
final double encargoFijo = 1.50;
double precioBase = Double.parseDouble(IO.readln("Dime cuanto sería el precio base: "));
double porcentajeRecarga = Double.parseDouble(IO.readln("Dime cuanto sería el porcentaje de recarga: "));
double cuentaFinal = (precioBase+ encargoFijo)*(1+porcentajeRecarga);
IO.println("La cuenta sería finalmente de : "+ (cuentaFinal)+ " €");



  //Siempre declaramos primero las constantes
  final double Kmh_nudo = 1.852;
  
  IO.println("MANUEL GUTIÉRREZ NAVARRO. PRÁCTICAS PARA EL EXAMEN");
  // Declaramos las variables, siendo en este ejercicio cuatro  variables
  double horas = Double.parseDouble(IO.readln("Dime cual fue el total de horas  que tardó la embarcación: "));
  double distancia = Double.parseDouble(IO.readln("Dime cual fue el total de kilometros recorridas por la embarcación: "));
  double velocidadKmh = (distancia / horas);
  int conversionNudos = (int)(velocidadKmh / Kmh_nudo);
  //Finalmente imprimimos el resultado de la conversión final
  IO.println("La conversion de un total de: " + (velocidadKmh) + "kilometros hora equivale a un total de: "
      + (conversionNudos) + " nudos");


     // Declaramos las constantes que usaremos en el programa

  final int presupuestoFijoBus = 450;
  final int gastosGestionAgencia = 120;
  final int costeAlumno = 75;
  IO.println("MANUEL GUTIÉRREZ NAVARRO. PRÁCTICAS PARA EL EXAMEN");

//Pedimos el número de alumnos que participaran en este viaje
  int alumnos = Integer.parseInt(IO.readln("Dime el número total de alumnos que participan en el viaje: "));
//Calculamos el gasto total de este viaje
  double gastoPorAlumno = (presupuestoFijoBus + gastosGestionAgencia) / alumnos + (costeAlumno);
//Imprimimos el resultado y además hacemos la conversión con el caster para que nos devuelva un valor entero

  IO.println("El gasto por alumno es de: " + (int) (gastoPorAlumno) + ("€"));


  final  double DESCUENTO = 0.15;
  final double IVA = 0.21;
  IO.println("MANUEL GUTIÉRREZ NAVARRO. PRÁCTICAS PARA EL EXAMEN");
  double precioUnitario = Double.parseDouble(IO.readln("Dime el precio unitario de tu producto: "));
  int unidadesProducto = Integer.parseInt(IO.readln("Dime las unidades que compras de dicho producto: "));
  //Se hacen los cáculos necesarios, quitandoles el DESCUENTO y sumándole el IVA
  double precioTrasDescuento= (precioUnitario*unidadesProducto)-(precioUnitario*unidadesProducto*DESCUENTO);
  double precioTrasIVA = (precioTrasDescuento+(precioTrasDescuento*IVA));
  
  IO.println("La factura total es finalmente un total de: "+(precioTrasIVA+ ("€")));


 
  // Lo primero de todo declaramos las constantes que utilizaremos en este
  // programa
  final double PRECIO_LITRO = 1.65;

  // Ponemos el nombre y el nombre del ejercicio
  IO.println("CalculoConsumoViaje. Ejercicio PRÁCTICA PARA EL EXAMEN. MANUEL GUTIÉRREZ NAVARRO");

  // Declaramos las variables necesarias en este programa
  double distanciaViaje = Double.parseDouble(IO.readln("Dime la distancia del viaje en Km: "));
  double consumoMedio = Double.parseDouble(IO.readln("Dime el consumo medio del vehículo en litros a los 100 km: "));

  // En dos de ellas tendrémos que realizar calculos matemáticos para hallar los
  // litros totales y el calculo de euros
  double calculoLitrosTotales = (distanciaViaje * consumoMedio) / 100;
  double calculoEuros = (calculoLitrosTotales * PRECIO_LITRO);

  // Por último imprimimos el resultado de las variables acompañado de un cast
  // para también imprimir el total de litros de forma entera sin decimales
  IO.println("El coste de litros totales consumidos son un total de: " + (calculoLitrosTotales)
      + (" ,el coste en litros es de un total de: " + (int) calculoLitrosTotales)
      + (" y el coste total e euros es de un total de: ") + (calculoEuros) + (" €"));


      // Para empezar declaramos las variables que vayamos a utilizar en este programa
  // en este caso la del número PI
  final double PI = 3.1415926;
  IO.println("CALCULO DE CILINDROS. PRACTICA PARA EL EXAMEN. @autor:MANUEL GUTIÉRREZ NAVARRO");
// Declaramos las variables necesarias y en las de areaBase y volumenCilindro hacemos los calculos matemáticos necesarios
  double radioBase = Double.parseDouble(IO.readln("Dime cual es el radio de la base: "));
  double alturaCilindro = Double.parseDouble(IO.readln("Dime cual es la altura del cilindro: "));
  double areaBase = (PI * radioBase * radioBase);
  double volumenCilindro = (areaBase * alturaCilindro);

// Realizamos un cast para convertir el valor de la variable voluenCilindro a un valor sin decimales asignádole un nuevo nombre de variable
  int volCilindro = (int) (volumenCilindro);
// Finalmente imprimimos el rsultado de las tres soluciones que nos pide este ejercicio
  IO.println(("Finalmente el área de la base consta de: ") + (areaBase)
      + (" metro cuadrados , el volumen del cilindro con decimales es un total de: ") + (volumenCilindro)
      + (" metros cúbicos") + (" y el volumen del cilindro sin decimales es un total de: ") + (volCilindro)
      + (" metros cúbicos"));



      final double PRECIO_PIZZA = 9.5;
  final double IVA = 0.21;
  IO.println("FACTURA PIZZERÍA. MANUEL GUTIÉRREZ NAVARRO");
  int numeroPizzas = Integer.parseInt(IO.readln("Dime cual es el número de pizzas que vas a pedir: "));
  double porcentajeDescuento = Double.parseDouble(IO.readln("Dime cual es tu porcentaje de descuento: "));

  double baseImponible = (numeroPizzas * PRECIO_PIZZA) - (numeroPizzas * PRECIO_PIZZA * porcentajeDescuento);
  double importeIVA = (baseImponible * IVA);
  double total = (baseImponible) + (baseImponible * IVA);
  int euros = (int) total ;
  double céntimos = (int) ((total-euros)*100);
  IO.println("La base imponible del pedido de pizzas es un total de: " + baseImponible
      + (" .El importe de IVA es de un:  " + importeIVA + (" finalmente el total es de: " + total+ " este siendo repartido en: ")+(euros)+ " €")+ " y  siendo un total de: "+(céntimos)+ " centimos ");

final double RETENCION_IMPUESTOS = 0.15;
  double numeroHoras = Double.parseDouble(IO.readln("Dime el número de horas trabajadas en el mes: "));
double precioHora  = Double.parseDouble(IO.readln("Dime el precio por hora trabajada: "));
double salarioBruto = (numeroHoras*precioHora);
double retencionImpuestos=(salarioBruto*RETENCION_IMPUESTOS);
double salarioNetoFinal = (salarioBruto)-(salarioBruto*RETENCION_IMPUESTOS);
IO.println("Finalmente el salario bruto es de: "+(salarioBruto)+" €");
IO.println("La retención de impuestos es de: "+(retencionImpuestos)+"€");
IO.println("El slario neto final es de: "+(salarioNetoFinal)+"€");



double precioBase = Double.parseDouble(IO.readln("Dime cual es el precio base del producto: "));
 final double tipoIva = Double.parseDouble(IO.readln("Dime cual es el tipo de IVA aplicable: "));
double importeIVA = (precioBase*tipoIva);
double precioFinal = (precioBase)+ (importeIVA);

IO.println(" El importe del IVA es de un: "+ importeIVA + " €"+ "y el precio final alcanza un total de; " + precioFinal);



IO.println("Tarifa Plana Joven.MANUEL GUTIÉRREZ NAVARRO");
  double edad = Double.parseDouble(IO.readln("Dime cual es tu edad: "));
 double numeroEntradas = Double.parseDouble(IO.readln("Dime el total de entradas del que dispones: "));
boolean aplicaPromocion = (edad<25)&&(numeroEntradas>=3);
IO.println(aplicaPromocion);



final double GRAVEDAD = 9.81;
  IO.println("EXAMEN DE MANUEL GUTIÉRREZ NAVARRO.CÁLCULO DE ENRGÍA Y VELOCIDAD");
double masaObjeto = Double.parseDouble(IO.readln("Dime la masa del objeto en kilogramos: "));
double alturaCaida = Double.parseDouble(IO.readln("Dime la altura de la que cae  el objeto: "));
double energiaPotencialGravitatoria = (masaObjeto*GRAVEDAD*alturaCaida);
double pesoObjeto = (masaObjeto*GRAVEDAD);

int pesoObject = (int) pesoObjeto;
IO.println("La energía potencial gravitatoria es de: "+ energiaPotencialGravitatoria+ " joules");
IO.println("El peso total del objeto es de un total de: "+pesoObject+ " Newtons");



// Primero de todo en el código declaramos las variables necesarias en este programa
  final int EDAD_MINIMA = 18;
 // Declaramos la edad del usuario
  int edadUsuario = 20;
//Mediante un boolean verificamos si la edad del usuario es mayor de edad, es decir, mayor que 18 años
  boolean esMayorDeEdad = (edadUsuario>=EDAD_MINIMA);
//Finalmente imprimimos el resultado
 IO.println(esMayorDeEdad);



 //Pedimos por teclado dos numero enteros para los cálculos del programa
 int numero1 = Integer.parseInt(IO.readln("Introduzca un número entero: "));
int numero2 = Integer.parseInt(IO.readln("Introduzca otro número entero: "));
//Declaramos unas variables para realizar los cálculos matemáticos 
int suma = (numero1+numero2);
double resto = (numero1%numero2);
//Finalmente imprimimos los resultados
IO.println("El resultado de la suma es: "+suma);
IO.println("El resultado del resto es: "+resto);




//Para empezar declaramos la constantes necesarias en el programa
  final int MAXIMO_PERMITIDO = 100;
//Pewdimos por teclado el número entero
  int valorUsuario = Integer.parseInt(IO.readln("Introduzca un valor entero por teclado: "));
//Aplicamos la condición con un boolean mediante comparadpres lógicos
  boolean esValido = (valorUsuario>0)&&(valorUsuario<=MAXIMO_PERMITIDO);
//Finalmente imprimimos el resultado final 
IO.print("Finalmente,¿es el valorválido?: "+esValido);



//Para empezar declaramos la constantes necesarias en el programa
 final double IVA = 1.21;
 //Pedimos por teclado los valores necesarios.
 double precioBase = Double.parseDouble(IO.readln("Dime el valor de un precio base: "));
//Realizanmos los calculos necesarios para calcular el precio total 
 double precioTotal =(precioBase*IVA);
//Hacemos una conversión tipo Cast para transformar el valor decimal a uno entero
 int precioEntero = (int)precioTotal;
//Finalmente imprimimos el resultado de ambos precio calculados anteriormente
 IO.println("El precio total con decimales es un total de: "+precioTotal+" €");
IO.println("El precio total entero sin decimales es un total de: "+precioEntero+ " €");
}
 








