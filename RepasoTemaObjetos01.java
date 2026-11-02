
    import programacion.bloque02.figuras.Paralelogramo;


    
    void main() {
     IO.println("NOMBRE DE LA APP: ParalelogramosApp");;
    
     //Para empezar solicitamosd por teclado al usuario la longitud del lado Horizontal 1, teniendo que ser igual que el lado 2
     
     double longitudHorizontal1 = Double.parseDouble(IO.readln("Dime la longitud del lado horizontal de un paralelogramo: "));
     double longitudHorizontal2 = longitudHorizontal1;
     
     //Delimitamos el paralelogramo pidiendo limite minimo y maximo teniendo que ser el maximo mayor que el minimo
     
     double limiteMinimo = Double.parseDouble(IO.readln("Dime el límite mínimo de un intervalo de números: "));
     
     double limiteMaximo = Double.parseDouble(IO.readln("Dime el valor máximo de un intervalo de números: "));
     
     //Creamos un objeto aleatorio para utilizarlo mas adelante en el calculo del lado vertical
     
    Random random = new Random();
    
    // Creamos la variable de tipo double lado vertical y la delimitamos con los limites y utilizamos la funcion nex double para obtern un numero aleatorio double delimitado por ambos extremos 
    
    double ladoVertical=limiteMinimo+(limiteMaximo-limiteMinimo)*random.nextDouble();
    
    //Imprimimos el lado vertical por la ventana 
    
    IO.println("El lado vertical es de un total de: "+ladoVertical);
     
    // Creamos el paralelogramo con el lado horizontaly  vertical 
    
     Paralelogramo paralelogramo1= new Paralelogramo (longitudHorizontal1,ladoVertical);
     
     //Calculamos el area y perimetro de el paralelogramo
     
     String calculoAreaPerimetro =  (paralelogramo1.getAreaPerimetro());
     
     //Imprimimos de maneraq conjunta tanto el perimetro y area de la figura
     
    IO.println( paralelogramo1.getAreaPerimetro());
     
     //Separamos ambos aspecots de el perimietro y el area del paralelogramo
    
    IO.println(calculoAreaPerimetro.indexOf(";"));
     
    //Imprimimos area y perimetro de forma separada
    
     IO.println("El area del paralelogramo es de: "+(calculoAreaPerimetro.substring(0,9)));
     
     IO.println("El perímetro del paralelogramo es un total de: "+(calculoAreaPerimetro.substring(10)));
     
     // Definimos un valor real para la escala
     
     double valorEscala = Double.parseDouble(IO.readln("Introduce un valor real positivo para la escala: "));
     
     //Escalamos el paralelogramo
     
     paralelogramo1.escala(valorEscala);
     
     //Volvemos a calcular el areay perimetro
     
     String calculoAreaPerimetroEscalado = paralelogramo1.getAreaPerimetro();
     
     //Ubicamos el ; en el paralelogramo escalado
     
     int posPuntoEscalado = calculoAreaPerimetroEscalado.indexOf(";");
     
     //Imprimos por separado area y permietro del paralelogramo escalado
     
     IO.println("El area del paralelogramo es de: "+(calculoAreaPerimetroEscalado.substring(0,posPuntoEscalado)));
     
     IO.println("El perímetro del paralelogramo es un total de: "+(calculoAreaPerimetroEscalado.substring(posPuntoEscalado+1)));
     
     // Convertimos mediante el parse los valores de perimetro y area 
     
     double sumaPerimetro= Double.parseDouble(calculoAreaPerimetroEscalado.substring(0,posPuntoEscalado));
     
     double sumaArea = Double.parseDouble((calculoAreaPerimetroEscalado.substring(posPuntoEscalado+1)));
    
     //Finalmente sumamos area y perimetro del paralelogramo escaladao
     
     IO.println("La suma del paralelogramo escalado es de: "+(sumaArea+sumaPerimetro));

}
