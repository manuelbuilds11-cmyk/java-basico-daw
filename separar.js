const fs = require('fs');

// Busca automáticamente cualquier archivo .txt en la carpeta actual
const archivos = fs.readdirSync('.');
const archivoTxt = archivos.find(f => f.endsWith('.txt'));

if (!archivoTxt) {
    console.error('❌ Error: No encuentro ningún archivo .txt en esta carpeta.');
    process.exit(1);
}

console.log(`📁 Leyendo archivo encontrado: ${archivoTxt}`);
const contenido = fs.readFileSync(archivoTxt, 'utf8');

// Divide el contenido detectando cualquier variante (-Ejercicio o -Ejercicion) seguida de número
const bloques = contenido.split(/(?=-Ejercici[o|on]\s*\d+)/);

bloques.forEach(bloque => {
    const textoTrim = bloque.trim();
    if (!textoTrim) return;

    // Extrae la primera línea para capturar el número del ejercicio
    const primeraLinea = textoTrim.split('\n')[0].trim();
    const numMatch = primeraLinea.match(/\d+/);
    
    if (!numMatch) return;
    const numero = numMatch[0];
    
    // Asigna el nombre profesional EjercicioX.java
    const nombreArchivo = `Ejercicio${numero}.java`;

    // Quita la línea del marcador inicial para que el código empiece limpio en void main()
    const codigoLimpio = textoTrim.replace(/^-Ejercici[o|on]\s*\d+\s*/, '').trim();

    // Escribe el archivo individual
    fs.writeFileSync(nombreArchivo, codigoLimpio);
    console.log(`> Creado con éxito: ${nombreArchivo}`);
});

console.log('\n¡Listo! Los 30 archivos generados automáticamente.');