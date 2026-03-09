
const useState = (x) =>{
    return [
        x,
        (nom)=> {
            console.log(`hola $(nom)`)
        }
    ]
}
const [texto, setNombre] = useState ('xyz');
console.log(texto);
setNombre('Juan');
