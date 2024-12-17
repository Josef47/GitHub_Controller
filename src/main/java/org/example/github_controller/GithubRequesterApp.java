package org.example.github_controller;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

public class GithubRequesterApp {
    public static void main(String[] args) {
        System.out.println("Hello!");
        boolean running = true;
        Properties prop = new Properties();
        String fileName = "config.properties";
        String token = "";
        try (FileInputStream fileInputStream = new FileInputStream(fileName)){
            prop.load(fileInputStream);
            token = prop.getProperty("github.token");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Scanner inputScanner = new Scanner(System.in);
        while(running){
            MenuTools.printMenu();
            String input = inputScanner.nextLine();
            try{
                int choice = Integer.parseInt(input);
                switch (choice){
                    case 1:
                        break;
                    case 2:
                        System.out.println("Your token is: " + token);
                        break;
                    case 0:
                        running = false;
                        MenuTools.printExitMsg();
                    break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
            catch (NumberFormatException nfe){
                System.out.println("Please enter a valid option!");
            }
        }
    }
}
