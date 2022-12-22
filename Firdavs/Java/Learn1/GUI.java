import javax.swing.JOptionPane;

class GUI {
    public static void main(String[] args) {
        begin();
    }

    static void begin(){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age?") );
        JOptionPane.showMessageDialog(null,age+" old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
        JOptionPane.showMessageDialog(null,"Height "+height);
    }
}
