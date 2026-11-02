import prog.unidad02.fisica.Cinematica;
import prog.unidad02.medidas.Conversiones;

void main() {
 //Definimos el nombre de nuestro programa
  
  IO.println("NOMBRE DE LA APP: TrenesApp");

// Definimos las variables de tanto la distancia entre los tres en millas como las velocidades de ambos trenes en millas por hora 
  
 double DistanciaTrenes = Double.parseDouble(IO.readln("Cual es la distancia en millas entre los dos trenes: "));
 
 double VelocidadTren1 = Double.parseDouble(IO.readln("Dime cual es la velocidad del primer tren en millas por hora: "));
 
 double VelocidadTren2 =  Double.parseDouble(IO.readln("Dime cual es la velocidad del segundo  tren en millas por hora: "));
 
 //Hacemos las conversiones que se especifican siendo estas pasar la distancia y velocidad de millas a kilómetros
 
 Conversiones.millasAKilometros(DistanciaTrenes);
 
 Conversiones.millasAKilometros(VelocidadTren1);
 
 Conversiones.millasAKilometros(VelocidadTren2);
 
 //Definimos el objeto de Cinematica y le asociamos los valores siendo estos los que se han cambiado de millas a kilómetros
 
 Cinematica cinematica = new Cinematica((Conversiones.millasAKilometros(DistanciaTrenes)), (Conversiones.millasAKilometros(VelocidadTren1)),(Conversiones.millasAKilometros(VelocidadTren2)));
 
 //Asociamos en un string a el calculo que se hace con el distanciaYEncuentro
 
String calculoCinematica = cinematica.distanciaYTiempoEncuentro();
 //Definimos una variable local date para la fecha actual en la que se produce este choque 

LocalDate hoy = LocalDate.now();

// Realizamos un index of para saber justo la posición de la coma que separa las salidas que da cinematica.distanciaYTiempoEncuentro()

IO.println(calculoCinematica.indexOf(","));

//Finalmente imprimimos el resultado final siendo este el de tanto la fecha siendo dia, mes y año  además de la distancia en kilómetros de la estación de salida  y por último a cuantos segundos de la salida

IO.println("El choque se ha producido el dia de: "+(hoy.getDayOfMonth()+"/"+hoy.getMonthValue()+"/"+ hoy.getYear())+" a una distancia de: "+calculoCinematica.substring(1,calculoCinematica.indexOf(","))+(" kilometros de la estación de salida y a los : ")+calculoCinematica.substring(calculoCinematica.indexOf(",")+1,calculoCinematica.length()-1)+" segundos de la salida");

}
