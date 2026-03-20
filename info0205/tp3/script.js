const debut = document.getElementById('DateDebutInput');
const fin = document.getElementById('DateFinInput');

function formatDate(date){
    const year = date.getFullYear();
    const month = String(date.getMonth() + 1).padStart(2,'0');
    const day = String(date.getDate()).padStart(2,'0');

    return `${year}-${month}-${day}`;
}

function checkFormat(field) {
    const regex = /^\d{4}-\d{2}-\d{2}$/;

    if (!field.value.match(regex)){
        console.log("Format Invalide");
        field.value = "";
    } else {
        const date = new Date(field.value);

        if (date.toString() === "Invalid Date"){
            field.value = "";
            console.log("Erreur format");
        } else {
            field.value = formatDate(date);
            console.log("Ok");
        }
    }
}



debut.addEventListener("change", () => checkFormat(debut));
fin.addEventListener("change", () => checkFormat(fin));
