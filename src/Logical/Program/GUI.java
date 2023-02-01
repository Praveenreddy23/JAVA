package Logical.Program;

import javax.swing.*;

//Graphical User Interface(GUI)
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your good name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt((JOptionPane.showInputDialog("Enter your age")));
        JOptionPane.showMessageDialog(null,"Your are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
        JOptionPane.showMessageDialog(null,"Your "+height+" feel tall");
    }
}
