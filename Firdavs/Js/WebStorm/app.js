class App {
    date;
    username;

    // todo: This is todo
    // this is not to do
    constructor(date, name) {
        this.date = date;
        this.username = name;
    }


}

const app = new App(Date.now(), 'John');

app.username = 'Doe';