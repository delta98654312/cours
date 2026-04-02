const shifumi = { 
    scoreP: 0,
    scoreC: 0,
    player: -1,

    select: function(type){
        if (shifumi.player == -1){
            shifumi.player = type
            let imagej = document.querySelectorAll("#player img")
            imagej.forEach((element,i) => {if (i!=type){element.style.visibility = 'hidden'}})

            let imageb = document.querySelectorAll("#computer img")
            imageb.forEach((element,i) => {element.style.visibility = 'hidden'})   
        }

        setTimeout(() => { shifumi.computer() }, 1000);
    },

    computer: function(){
        number =Math.floor(Math.random()*3)
        let imagesC = document.querySelectorAll("#computer img")
        imagesC.forEach((images, i) => {if (i == number){images.style.visibility = "visible"}});
        
    }
}


const img = document.querySelectorAll("#player img");
img.forEach((item, index) => {
    item.addEventListener('click', () => shifumi.select(index))
})

