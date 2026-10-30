void main() {
    
 IO.println("NOMBRE DE LA APP: Navaja Suiza App");
 
 //Apartado  a, pedimos por teclado el valor de ambas cadenas
 
 String cadena1 = IO.readln("Dame el contenido de la primera cadena: ");
 
 String cadena2=IO.readln("Dame el contenido de la segunda  cadena: ");

 //Apartado  b
 
 IO.println("La longitud de la primera cadena es de un total de: "+cadena1.length());
 
 IO.println("La longitud de la segunda cadena es de un total de: "+cadena2.length());
 
 IO.println("Esta la primera cadena vacía?: "+cadena1.isEmpty());
 
 IO.println("Esta la segunda cadena vacía?: "+cadena2.isEmpty());
 
IO.println("La primera cadena contiene solo carácteres blancos?: "+cadena1.isBlank());
 
IO.println("La segunda cadena contiene solo carácteres blancos?: "+cadena2.isBlank());
 
 //Aparado c

IO.println("Asi sería la concatenación de cadenas: "+cadena1 +" "+ cadena2);
 
//Apartado d

IO.println(cadena1.equals(cadena2));

IO.println(cadena1.equalsIgnoreCase(cadena2));

//Apartado e

IO.println("¿Son la primera y segunda cadena iguales?: "+cadena1.compareTo(cadena2));

IO.println("¿Son la primera y segunda cadena iguales, sin tener en cuenta mayúsculas y minúsculas?: "+cadena1.compareToIgnoreCase(cadena2));

//Apartado f

IO.println("Contiene la primera cadena a la segunda: "+cadena1.contains(cadena2));

//Apartado g

IO.println("Comienza la primera cadena por la segunda?: "+cadena1.startsWith(cadena2));
 
//Apartado h

IO.println("Termina la primera cadena por la segunda?: "+cadena1.endsWith(cadena2));
 
//Apartado i

IO.print("Mostramos por pantalla el primer carácter de la primera cadena: "+cadena1.charAt(0));
 
 IO.println("Mostramos por pantalla el último carácter de la primera cadena: "+cadena1.charAt(-1 + cadena1.length()));
 
// Apartado j
 
 IO.println("Mostramos por pantalla la primera cadena eliminando el primer caracter: "+cadena1.substring(1));
 
//Apartado k
 
IO.println("La primera cadena toda en mayúscula: "+cadena1.toUpperCase());

IO.println("La primera cadena todo en minúscula: "+cadena1.toLowerCase());

//FIN DEL PROGRAMA

 }