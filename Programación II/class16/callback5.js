function tarea1(callback) {
    setTimeout(() => {
        console.log("Tarea 1 terminada");
        callback();
    }, 2000);
}

function tarea2(callback) {
    setTimeout(() => {
        console.log("Tarea 2 terminada");
        callback();
    }, 1000);
}

function tarea3() {
    setTimeout(() => {
        console.log("Tarea 3 terminada");
    }, 2000);
}

tarea1(() => {
    tarea2(() => {
        tarea3();
    });
});