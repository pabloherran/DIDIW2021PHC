document.addEventListener('DOMContentLoaded', ()=>{
    console.log('->o Dom cargado');
    app();
});

function app(){
    const elemento = document.querySelector('.elemento');
    const fadein = document.querySelector('.buttonFadeIn');
    const fadeout = document.querySelector('.buttonFadeOut');

    fadein.addEventListener('click', function(){
       fadeIn(elemento, 2000); 
    });


    fadeout.addEventListener('click', function(){
        fadeOut(elemento, 2000); 
     });
}

function fadeIn(elemento, duracion){
    elemento.style.transition = `${duracion/1000}s`;
    elemento.style.opacity = 1;
    console.log('fadein');
}

function fadeOut(elemento, duracion){
    elemento.style.transition = `${duracion/1000}s`;
    elemento.style.opacity = 0;
    console.log('fadeout');
}