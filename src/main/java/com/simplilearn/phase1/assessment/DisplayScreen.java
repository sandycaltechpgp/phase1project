package com.simplilearn.phase1.assessment;

public class DisplayScreen {

    private String welcomeText;

    DisplayScreen(String welcomeText){
        this.welcomeText = welcomeText;
    }

    public void display(){
        System.out.println("################################################");
        System.out.println(this.welcomeText);
        System.out.println("################################################");
    }

}
