public class oop_4 {
    public static void main(String[] args) {
        oop_4 obj = new oop_4();
        obj.setName("1");
        function.write(obj.getName());
    }
    private String name = "Unknown";


    public void setName(String newName) {
        if (newName != "") {
            this.name = newName;
        }
    }

    public String getName() {
        return name;
    }
}
