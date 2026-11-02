import prog.unidad02.figuras.Circulo;

void main() {
IO.println("NOMBRE DE LA APP: CirculosApp");;

//Definimos los límtes confiando en el usuario de que el límite inferior sera iagual o menor que el superior 

double limiteMinimo = Double.parseDouble(IO.readln("Introduce el limite mínimo de un intervalo de números reales: "));

double limiteMaximo = Double.parseDouble(IO.readln("Introduce el limite máximo de un intervalo de números reales: "));

//Creamos un objeto random

Random numeroRandom = new Random();

//Este objeto nos será muy útil para obtener el radio con el next double y delimitándolo con las dos variables double pedidas anteriormente

double radio=numeroRandom.nextDouble(limiteMinimo,limiteMaximo);

//Creamos un círculo con valor 1 de manera predeterminada

Circulo circulo1 = new Circulo(radio);

// Se imprime la longitud del radio obtendia al azar

IO.println("La longitud del radio obtenida al azar  es de: "+(radio));

//Al ser el metodo .getAreaYPerimetro un string es mas sencillo y lo podemos hacer de forma directa para separar el area y el perimetro para imprimirlo como se nos pide en el ejercicio utilizansdo substring para imprimir las partes avcotadas y index Of para delimitarlas.

IO.print("El área del círculo vale: "+(circulo1.getAreaYPerimetro().substring(0,(circulo1.getAreaYPerimetro().indexOf(":")))));

IO.print(" y el perímetro vale: "+(circulo1.getAreaYPerimetro().substring(circulo1.getAreaYPerimetro().indexOf(":")+1,circulo1.getAreaYPerimetro().length()))); 

//Pedimos por teclado un valor para la escala

double valorEscala = Double.parseDouble(IO.readln("Introduzca el factor real positivo por el que quiere ampliar \r\n"
    + "(mayor que 1) o reducir (menor que 1) el círculo"));

//Al ser un void simplemente modificamos el valor del area y perimetro del circulo mediante el .escala

circulo1.escala(valorEscala);

//Luego imprimimos los nuevos resultados escalados tanto del área y perímetro utilzando lo mismo tanto idex y substring

IO.print("El área del círculo  escalado vale: "+(circulo1.getAreaYPerimetro().substring(0,(circulo1.getAreaYPerimetro().indexOf(":")))));

IO.print(" y el perímetro escalado  vale: "+(circulo1.getAreaYPerimetro().substring(circulo1.getAreaYPerimetro().indexOf(":")+1,circulo1.getAreaYPerimetro().length()))); 

//Por último convertimos el area y permietro por separado para sumarlos y para eso hacemos una conversion de String a double con el .parse 

double suma1 = Double.parseDouble(circulo1.getAreaYPerimetro().substring(0,(circulo1.getAreaYPerimetro().indexOf(":"))));
    
double suma2 = Double.parseDouble(circulo1.getAreaYPerimetro().substring(circulo1.getAreaYPerimetro().indexOf(":")+1,circulo1.getAreaYPerimetro().length()));

//Finalmente sumamos las dos variablers que corresponden a el área y el perímetro

IO.println("La suma del área y perímetro es de: "+((suma1)+(suma2)));

//FIN DEL PROGRAMA

}
