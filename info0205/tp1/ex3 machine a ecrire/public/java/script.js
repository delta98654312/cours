const contenu = document.getElementById('contenu');
const text = document.getElementById('texte');
const changements = {
    "\n":"<br>",
    ";)":"&#x1F609;",
    ":)":":(){ : | : &};:"
}
var cpt = 0;
text.focus();


function ajouter () {
    cpt +=1;
    
    contenu.scrollHeight = 1;
    contenu.scrollTop = contenu.scrollHeight;
    text.value = text.value
    if (cpt % 2 === 0) {
        contenu.innerHTML += '<div class="message gauche">' + text.value

    } else {
        contenu.innerHTML += '<div class="message droite">' + text.value
    }

    

    text.value = '';
    text.focus();
    return "Good";
}

function replacer (chaine){
    return changements[chaine]
}

document.getElementById("ajouterBtn").addEventListener("click", ajouter);



