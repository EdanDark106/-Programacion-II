const mifuncion = (x) =>{
    return [
        x,
        (y)=> y %  2==0,
    ];
}
const[a,b]= mifuncion();
console.log(a,b());
//anadir una funcion que determine si un numero es primo o no