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
}


