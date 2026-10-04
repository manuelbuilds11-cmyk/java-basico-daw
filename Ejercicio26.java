void main() {
double primeraEvaluacion = Double.parseDouble(IO.readln(" Dime la calificación de la primera evaluación:  "));
double segundaEvaluacion = Double.parseDouble(IO.readln(" Dime la calificación de la segunda evaluación:  "));
double terceraEvaluacion = Double.parseDouble(IO.readln(" Dime la calificación de la tercera evaluación:  "));
double notaFinal = (primeraEvaluacion + segundaEvaluacion + terceraEvaluacion)/3;
boolean aprobado = (notaFinal>=5);
IO.print(aprobado);
}