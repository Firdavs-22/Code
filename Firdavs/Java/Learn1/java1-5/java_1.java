public class java_1 {
    public static void main(String[] args){
        String name = "John",fullInfo;
        final int id = 5;
        double ball = 2.5;
        char ball_letter = 'F';
        boolean is_passed = false;

        fullInfo = "Student Name: "+name
                +"\nStudent id: "+id
                +"\nExam ball: "+ball
                +"\nExam ball in letter: "+ball_letter
                +"\nExam is passed: "+is_passed;

        System.out.print(fullInfo);
    }
}