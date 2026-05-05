package model.utils;

import exceptions.InvalidOptionException;
import exceptions.NegativeNumberException;

import java.util.Scanner;

public class Menus {
    public void registerPetMenu(){

        System.out.println("\n=== PET ADOPTION ===");
        System.out.println("____________________");
        System.out.println("1. Register new pet\n" +
                "2. Edit the data of a registered pet\n" +
                "3. Delete pet\n" +
                "4. View all pets\n" +
                "5. Search pets\n" +
                "6. Exit");
        System.out.println("____________________");
    }

    public static int readMenuOption(Scanner scanner){

        while(true){
            try{

                System.out.print("Choose >> ");
                int option = Integer.parseInt(scanner.nextLine());

                if(option <=0){
                   throw new NegativeNumberException("Number can't be 0 or negative numbers.");
                }
                if(option >6){
                    throw new InvalidOptionException("Invalid option.");
                }
                return option;
            } catch(NumberFormatException e){
                System.out.println("\nERROR: type only numbers.");
            } catch (NegativeNumberException | InvalidOptionException e){
                System.out.println("\nERROR: " + e.getMessage());
            }
            return -1;
        }
    }
}
