public class abstraction {
    public static void main(String[] args) {
        Car laceti = new Car(120);
        function.write(laceti.getMoveSpeed());
        laceti.move(1.5);
        function.write(laceti.getPosition());
        laceti.Stop();
        function.write(laceti.getPosition());
        laceti.signal();
    }
}

abstract class Move {
    abstract void move(int second);
    abstract void move(double second);
    abstract int getMoveSpeed();
    abstract void Stop();
    abstract String getPosition();
}

class Car extends Move{
    int speed;
    int position;
    public Car(int speed){
        this.speed = speed;
        this.position = 0;
    }
    void move(int second) {
        this.position +=(second * speed);
    }
    void move(double second) {
        this.position += (int) (second * speed);
    }

    void Stop() {
        this.position = 0;
    }

    int getMoveSpeed() {
        return speed;
    }

    String getPosition() {
        return position+"m";
    }

    void signal(){
        System.out.println("beep-beep");
    }
}
