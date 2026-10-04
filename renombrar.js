const fs = require('fs');

const archivos = fs.readdirSync('.');
archivos.forEach(file => {
    const match = file.match(/^Ejercicio(\d+)\.java$/);
    if (match) {
        const num = parseInt(match[1], 10);
        // Añade un cero delante si es menor de 10 (ej: 1 -> 01)
        const numFormateado = String(num).padStart(2, '0');
        const nuevoNombre = `Ejercicio${numFormateado}.java`;
        
        if (file !== nuevoNombre) {
            fs.renameSync(file, nuevoNombre);
            console.log(`Renombrado: ${file} -> ${nuevoNombre}`);
        }
    }
});
console.log('\n¡Todos los archivos renombrados correctamente!');