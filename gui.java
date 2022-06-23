/*
use gridbag
 */
import javax.swing.*;
class gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Press");
        JButton button2 = new JButton("Press2");
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);// Adds Button to content pane of frame
        frame.setVisible(true);
    }
}