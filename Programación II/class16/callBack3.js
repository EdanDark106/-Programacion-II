//el callback asincronico espera un rato
function descargar(callback){
    console.log("Inicia descarga");
    setTimeout(() => {
        console.log("arhivo descargado");
        const arch = 'archivo.jpg';
        callback(arch);
    }, 2000);
}
function mostrarArchivo(nom){
    console.log(`Mostrando ${nom}`);
}
const arch = descargar(mostrarArchivo);
/*no servira esto
const arch = descargar(mostrarArchivo(`archivo.jpg`));
*/

//tarea crear funcion que va ingresa in un vextor de objetos que tenga nombre y edad con 2 callback primreo:encontrado , segundo:no econtro el objeto