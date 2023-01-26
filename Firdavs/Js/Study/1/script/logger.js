export let yoz = text => {
    let line = true
    if(typeof text == 'object'){
        for (let key in text) {
            if (typeof text[key] == 'object'){
                line = false
                yoz(text[key])
            } else{
                write(key+': '+text[key]);
            }
        } 

    } else {
        write(text); 
    }
    
    if (line)
        document.getElementById("log").innerHTML += '<hr/>';
}


let write = text => {
    document.getElementById("log").innerHTML += '<p>'+text+'</p>';
}