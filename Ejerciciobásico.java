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

}





