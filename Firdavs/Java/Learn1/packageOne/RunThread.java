public class RunThread extends Thread {
    static int amount = 0;
    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        RunThread thread = new RunThread();
        thread.start();
        while (thread.isAlive()){
            function.write("...");
        }
        function.write(amount);
        amount++;
        function.write(amount);
    }
}

/*class First extends Thread{
    public void run() {
        function.write("first");
    }

    public static void main(String[] args) {
        First thread = new First();
        thread.start();
        function.write("out");
    }
}*/

/*class Second implements Runnable{
    public void run() {
        function.write("second");
    }

    public static void main(String[] args) {
        Second obj = new Second();
        Thread thread =
         new Thread(obj);
        thread.start();
        function.write("out");
    }
}*/
