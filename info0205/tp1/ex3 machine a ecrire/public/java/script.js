const contenu = document.getElementById('contenu');
const text = document.getElementById('texte');
const changements = {
  "\n": "<br>",
  ";)": "&#x1F609;",
  "mdr": "<i>mort de rire</i>",
  "jpp": "<i>j'en peux plus</i>",
  "omg": "<i>oh my god</i>"
};
var cpt = 0;
text.focus();


function ajouter () {
    cpt += 1;

    let texte = text.value;

    texte = texte.replace(/\n|;\)|mdr|jpp|omg/g, remplacer);

    if (cpt % 2 === 0) {
        contenu.innerHTML += '<div class="message gauche">' + texte + '</div>';
    } else {
        contenu.innerHTML += '<div class="message droite">' + texte + '</div>';
    }


    contenu.scrollTop = contenu.scrollHeight;


    text.value = '';
    text.focus();
}

function remplacer (chaine){
    return changements[chaine]
}

document.getElementById("ajouterBtn").addEventListener("click", ajouter);



