public class oop_3 extends student_abs {
    public static void main(String[] args) {
        oop_3 obj = new oop_3("Firdavs","G'aybullayev",210248);
        obj.info();
    }

    public oop_3(String fname,String lname,int id){
        identify = id;
        first_name = fname;
        last_name = lname;
    }

    public void info() {
        function.write("Student id: "+identify+"\r\nFirst name: "+first_name+"\r\nLast name: "+last_name);
    }
}
