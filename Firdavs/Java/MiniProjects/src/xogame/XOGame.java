package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class XOGame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel info_panel = new JPanel();
    JPanel panel_button = new JPanel();
    Random random = new Random();
    JLabel text = new JLabel();
    JButton [] buttons = new JButton[9];
    boolean first_player;

    public XOGame(){
        //Frame settings
        frame.setSize(800,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(70,70,70));
        frame.setLayout(new BorderLayout());

        //Text Label settings
        text.setBackground(new Color(30,30,30));
        text.setForeground(new Color(30,200,100));
        text.setFont(new Font("Ink Free",Font.BOLD,50));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setText("X - O GAME");
        text.setOpaque(true);

        //Info Panel settings
        info_panel.setLayout(new BorderLayout());
        info_panel.setBounds(0,0,800,200);


        //Button Panel settings
        panel_button.setLayout(new GridLayout(3,3));
        panel_button.setBackground(new Color(200,200,200));

        //Creating Buttons and Adding in Panel
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("MVBoli",Font.BOLD,100));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
            panel_button.add(buttons[i]);
        }

        //Relations
        frame.add(info_panel,BorderLayout.NORTH);
        frame.add(panel_button);
        info_panel.add(text);

        frame.setVisible(true);
        setFirst_player();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]){
                if (first_player){
                    if (buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(200,110,0));
                        buttons[i].setText("X");
                        first_player = false;
                        text.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(0,0,200));
                        buttons[i].setText("O");
                        first_player = true;
                        text.setText("X turn");
                        check();
                    }
                }
            }
        }
    }

    public void check(){
        //X win combination
        if ((buttons[0].getText() == "X") && (buttons[1].getText() == "X") && (buttons[2].getText() == "X")){
            xWins(0,1,2);
        }

        //O win combination
        if ((buttons[0].getText() == "O") && (buttons[1].getText() == "O") && (buttons[2].getText() == "O")){
            oWins(0,1,2);
        }
    }

    public void xWins(int a,int b,int c){
        buttons[a].setBackground(Color.CYAN);
        buttons[b].setBackground(Color.CYAN);
        buttons[c].setBackground(Color.CYAN);
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        text.setText("Wins X");
    }

    public void oWins(int a,int b,int c){
        buttons[a].setBackground(Color.CYAN);
        buttons[b].setBackground(Color.CYAN);
        buttons[c].setBackground(Color.CYAN);
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        text.setText("Wins O");
    }

    public void setFirst_player(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if (random.nextInt(2) == 0){
            first_player = true;
            text.setText("X move");
        } else {
            first_player = false;
            text.setText("O move");
        }
    }
}
