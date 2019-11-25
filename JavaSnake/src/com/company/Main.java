package com.company;

import com.sun.javaws.util.JfxHelper;

import javax.swing.JFrame;

public class Main {

    public Main() {
        JFrame frame= new JFrame();
        Gamepanel gamepanel = new Gamepanel();

        frame.add(gamepanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AwsomeSnakeGamesInJavaByThuta");

        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
