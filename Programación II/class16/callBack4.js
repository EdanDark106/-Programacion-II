const arr =[
    {
        nombre: 'Juan',
        edad: 20
    },
    {
        nombre: 'Maria',
        edad: 22
    }
]
function funcion(nombre, arr, callback1, callback2){
    setTimeout(() => {
        let n = arr.leng;
        let encontro = false;
        for(let i = 0; i < n; i++){
            const {nombre} = arr[i]
            if (nom == nombre){
                encontro = true;
                break;
            }
                
        }

        if (encontro)
            callback1();
        else
            callback2();

    }, 2000);
}

const mensajeExito = () => {
    console.log("Encontro");
}
const mensajeNoExito = () => {
    console.log("no encontro");
}

funcion(arr, mensajeExito, mensajeNoExito);

/*Proceso asincrono:

esto se resuelve con callback anidado
1. primero 2 segundos(termino de ejecutarse el 1ro)
1. segundo2 1 segundos(termino de ejecutarse el 2do)
1. tercero2 2 segundos(termino de ejecutarse
*/