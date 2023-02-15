package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.MacOSFactory;
import refactoring_guru.abstract_factory.example.factories.WindowsFactory;

import javax.swing.*;

public class Main extends JFrame{


    private JButton macOSButtonButton;
    private JButton windowsButtonButton;

    private JPanel panel1;

    public Main(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        macOSButtonButton.addActionListener(e -> {
            System.out.println("macOSButtonButton");
        });
        windowsButtonButton.addActionListener(e -> {
            System.out.println("windowsButtonButton");
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Main();
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }










}
