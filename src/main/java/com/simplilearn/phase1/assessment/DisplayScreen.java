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
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
