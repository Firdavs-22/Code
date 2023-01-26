let getUserById = (collection,id) => {
    let len = collection.length
    for (let i = 0; i < len; i++) {
        if(collection[i].id == id)
            return collection[i]
    }
    return false
}

let toDoBlock = (user,text,checked = false) => {
    let check = checked ? 'checked' : ''
    return `<div class="toDo"><div class="toDoBody"><div class="user">${user}</div><div class="toDoAction">${text}</div></div><div class="toDocheckboxBlock"><input type="checkbox" class="toDocheckbox" ${check}></div></div>`
}

let printToDo = (collection,user,where) => {
    let len = collection.length
    let elem = document.getElementById(where)
    for (let i = 0; i < len; i++) {
        elem.innerHTML += toDoBlock(getUserById(user,collection[i].userId).username,collection[i].title,collection[i].completed)
    }
}

export default printToDo