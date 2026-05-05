package app;

import model.utils.Menus;
import services.ReadFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        //readFile.readForm();
        Menus menu = new Menus();
        int option;
        Scanner scanner = new Scanner(System.in);

        do{
            menu.registerPetMenu();
            option = Menus.readMenuOption(scanner);
            if(option == -1){
                System.out.println("Try again.");
            }

        }while(option != 6);

    }
}
