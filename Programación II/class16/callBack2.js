function descargar(){
    console.log("Inicia descarga");
    setTimeout(() => {
        console.log("arhivo descargado");
        const arch = 'archivo.jpg';
        return arch;

    }, 2000);
}
function mostrarArchivo(nom){
    console.log(`Mostrando ${nom}`);
}
const arch = descargar();
mostrarArchivo(arch);