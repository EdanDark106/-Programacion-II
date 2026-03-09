/*
import {a,b,c,d,saludo} from './index3.js';
console.log (a,b,c,d,saludo());
*/
import {useState} from './index2.js';
const[nombre, setNombre] = useState('Juan')
console.log (nombre);  //Juan
setNombre ('Rojo');     //me gusta el rojo
                        //no me gusta el verde
                        //no me gusta el azul
//agregar verde y azul