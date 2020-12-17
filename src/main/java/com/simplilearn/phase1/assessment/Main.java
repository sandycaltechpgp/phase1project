package com.simplilearn.phase1.assessment;

import java.util.Scanner;

public class Main {

    static String welcomeText = " DOCUMENTS MANAGEMENT SYSTEM \n" +
            "MAIN MENU \n" +
            "OPTION 1: DISPLAY ALL FILE \n" +
            "OPTION 2: DISPLAY OPTIONS \n" +
            "OPTION 3: EXIT MAIN MENU \n" +
            "INPUT : ";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DisplayScreen displayScreen = new DisplayScreen(welcomeText);
        FileManagementSystem fileManagementSystem = new FileManagementSystem();


        while (true) {
            displayScreen.display();

            if (scanner.hasNext()) {
                String input = scanner.nextLine().trim();
                Byte inputOption = -1;
                try {
                    inputOption = Byte.parseByte(input);
                } catch (Exception ex) {
                    System.out.println(" WRONG INPUT PLEASE TRY AGAIN \n" +
                            "VALID OPTIONS ARE 1,2  or 3 \n");
                    continue;
                }

                switch (inputOption) {
                    case 1: {
                        fileManagementSystem.displayAllFiles();
                        press();
                        break;
                    }
                    case 2: {
                        fileManagementSystem.displayOptions();
                        break;
                    }
                    case 3: {
                        return;
                    }
                }

            }
        }
    }

    private static void press(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n PRESS ENTER KEY TO CONTINUE........\n");
        String line = scanner.nextLine();
    }


}