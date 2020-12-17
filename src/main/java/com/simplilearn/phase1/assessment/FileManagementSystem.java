package com.simplilearn.phase1.assessment;

import java.util.ArrayList;
import java.util.Scanner;

public class FileManagementSystem {

    private ArrayList<Document> inventory = new ArrayList<Document>();

    static String optionText = " DOCUMENT MANAGAMENT SYSYTEM " +
            "SUB MENU OPTIONS : \n" +
            "1: ADD A FILE \n" +
            "2: DELETE A FILE \n" +
            "3. SEARCH A FILE \n" +
            "4. EXIT TO MAIN MENU \n" +
            "INPUT :";


    public void displayAllFiles() {
        if (inventory.size() == 0) {
            System.out.println(" \n  No Files To Display \n");
            return;
        }

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("File - " + (i + 1) + "- " + inventory.get(0).getId() + " - " + inventory.get(0).getName() + "\n");
        }

    }

    public void displayOptions() {
        DisplayScreen displayScreen = new DisplayScreen(optionText);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayScreen.display();
            if (scanner.hasNext()) {
                String input = scanner.nextLine().trim();
                Byte inputOption = -1;
                try {
                    inputOption = Byte.parseByte(input);
                } catch (Exception ex) {
                    System.out.println(" WRONG INPUT PLEASE TRY AGAIN \n" +
                            "VALID OPTIONS ARE 1,2,3,4 \n");
                    continue;
                }

                switch (inputOption) {
                    case 1: {
                        System.out.println("ENTER FILE TO ADD ");
                        createDocument(scanner.nextLine().trim());
                        System.out.println("ADDED FILE SUCCESSFULLY ");
                        press();
                        break;
                    }
                    case 2: {
                        displayAllFiles();
                        System.out.println("ENTER A FILE NUMBER TO DELETE:");
                        deleteDocument(scanner.nextLine().trim());
                        press();
                        break;
                    }

                    case 3: {
                        searchDocument(scanner.nextLine().trim());
                        press();
                        break;
                    }

                    // Break from inside options
                    case 4: {
                        press();
                        return;
                    }

                }
            }
        }
    }

    private void searchDocument(String fileName) {
        boolean found = false;
        for (Document doc :
                inventory) {
            if (doc.getName().equalsIgnoreCase(fileName.trim())) {
                found = true;
                System.out.println("FOUND FILE :\n");
                System.out.println("File -" + inventory.get(0).getId() + " - " + inventory.get(0).getName() + "\n");
            }
        }

        if (!found) {
            System.out.println("FILE NOT FOUND TRY AGAIN. :\n");
        }
    }

    private void deleteDocument(String fileStr) {

        if (inventory.size() == 0) {
            System.out.println(" NO FILES TO DELETE \n");
            return;
        }

        String input = fileStr;
        Byte inputOption = -1;
        try {
            inputOption = Byte.parseByte(input);
            if (inputOption > 0)
                inventory.remove(inputOption - 1);
            else
                System.out.println(" WRONG INPUT PLEASE TRY AGAIN \n");

        } catch (Exception ex) {
            System.out.println(" WRONG INPUT PLEASE TRY AGAIN \n");
        }
    }

    private void createDocument(String name) {
        Document document = new Document(name);
        inventory.add(document);
    }

    private static void press() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n PRESS ANY KEY TO CONTINUE........\n");
        String line = scanner.nextLine();
    }
}
