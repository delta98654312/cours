const shifumi = {
    scoreP: 0,
    scoreC: 0,
    player: -1,

    select: function(type){
        if (shifumi.player == -1){
            shifumi.player = type;

            let imagesU = document.querySelectorAll("#player img");

            imagesU.forEach((images, i) => {
                if (i != type){
                    images.style.visibility = "hidden";
                }
                
            }
            );

            let imagesC = document.querySelectorAll("#computer img");

            imagesC.forEach((images, i) => {
                images.style.visibility = "hidden";
            }
            );
        }

        setTimeout(() => { shifumi.computer() }, 1000);
    },

    reset: function(){
        shifumi.player = -1;
        let imagesU = document.querySelectorAll("#player img");

        imagesU.forEach((images, i) => {
            images.style.visibility = "visible";
            
        }
        );
        let imagesC = document.querySelectorAll("#computer img");
        imagesC.forEach((images, i) => {
            images.style.visibility = "visible";
        }
        );

    },


    computer: function(){
        number =Math.floor(Math.random()*3)

        let imagesC = document.querySelectorAll("#computer img");

        imagesC.forEach((images, i) => {
            if (i == number){
                images.style.visibility = "visible";
            }
                
        }
        );

        if (number === this.player) {
            // égalité
        }
        else if (
            (this.player === 0 && number === 2) || 
            (this.player === 1 && number === 0) || 
            (this.player === 2 && number === 1)
        ) {
            this.scoreP++;
        }
        else {
            this.scoreC++;
        }

        document.querySelector("#scoreP").innerHTML = this.scoreP;
        document.querySelector("#scoreC").innerHTML = this.scoreC;


        setTimeout(() => { shifumi.reset() }, 2000);
    }
}




const img = document.querySelectorAll("#player img");
img.forEach((item, index) => {
    item.addEventListener('click', () => shifumi.select(index))
})