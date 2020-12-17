package com.simplilearn.phase1.assessment;

public class DisplayScreen {

    private String welcomeText;

    DisplayScreen(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public void display() {
        clearConsole();
        System.out.println("################################################");
        System.out.println(this.welcomeText);
        System.out.println("################################################");
    }

    public final static void clearConsole() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
