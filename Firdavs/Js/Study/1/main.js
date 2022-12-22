//@script
import {log} from './script/logger.js'


//@data
import admin from './data/admin.json' assert {type: 'json'}
import user_id from './data/user_id.json' assert {type: 'json'}

// log(admin)
// log(user_id)


let reload = document.querySelector("button#reload")
if(reload !== null){
    reload.addEventListener("click",()=>{
        let link = document.querySelector("a.link")
    
        if(link !== null){
            link.setAttribute("href","https://www.google.com/")
            link.innerHTML = "Google"
            link.setAttribute("target","_blank")
        }
    });

    let hello = document.createElement("hi")
    hello.innerText = "Hello"
    reload.after(hello)
}


