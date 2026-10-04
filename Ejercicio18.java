void main() {
    double notaUnidad1 = 7.0;
    double notaUnidad2 = 6.0;
    double notaUnidad3 = 8.5;
    double promedio = ((notaUnidad1 + notaUnidad2 + notaUnidad3) / 3) * 0.55;
    double examenFinal = 7.0 * 0.30;
    double trabajoClase = 6.5 * 0.15;
    double notaFinal = promedio + examenFinal + trabajoClase;
    
    IO.println("La nota final es: " + notaFinal);
}