package refactoring_guru.abstract_factory.example;

import javax.swing.*;

public class Main {


    private JButton macOSButtonButton;
    private JButton windowsButtonButton;

    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("main");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
