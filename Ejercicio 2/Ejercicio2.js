document.addEventListener('DOMContentLoaded', () => {
    console.log('DOM cargado');
    animacion();
});

function animacion() {
    const tiempo = document.querySelector('.entrada');
    const cont = document.querySelector('.contador');

    const iniciar = document.querySelector('#iniciar');
    const parar = document.querySelector('#parar');

    let si;

    iniciar.addEventListener('click', () => {
        cont.style.color = 'black';
        let t = tiempo.value;
        if (t >= 0 || isNaN(t)) {
            si = setInterval(() => {
                cont.innerHTML = t;
                t--;
                if (t < 0) {
                    cont.style.color = 'red';
                    clearInterval(si);
                }
            }, 1000);
        } else {
            alert('No es un numero');
        }

    })

    parar.addEventListener('click', () => {
        clearInterval(si);
    })
}