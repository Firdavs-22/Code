//@script
import printToDo from './script/todo.js'

//@data
import todos from './data/todos.json' assert {type: 'json'}
import users from './data/users.json' assert {type: 'json'}




printToDo(todos,users,'toDoBlock')


