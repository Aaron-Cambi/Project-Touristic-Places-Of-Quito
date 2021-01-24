/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package touristicplacesofquito;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class TouristicPlacesOfQuito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        boolean mainLoop = true;
        int option;
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("\n");
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "|     Touristic Places Of Quito      |" + "\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "|  Hello, Where are we going today?  |"
                    + "\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| 1. Parks                           |");
            System.out.println("| 2. Churches                        |");
            System.out.println("| 3. Square                          |");
            System.out.println("| 4. Viewpoints                      |");
            System.out.println("| 5. Malls                           |");
            System.out.println("| 6. Exit                            |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "______________________________________");

            System.out.println(name + " Enter yout option  ");
            System.out.print("--> ");
            option = input.nextInt();
            System.out.println("______________________________________");
            switch (option) {
                case 1:
            int optionP;
                    do {
            System.out.println("~~~~~~~~~~~~~~"
                                + "\n" + "| The parks in Quito:" + "\n"
                                + "~~~~~~~~~~~~~~");
            System.out.println("| 1.Quito metopolitan park           |");
            System.out.println("| 2.Itchimbia park                   |");
            System.out.println("| 3.Carolina park                    |");
            System.out.println("| 4. Exit                            |");
            System.out.println("~~~~~~~~~~~~~~" + "\n"
                                + "______________");

            System.out.println(name + " Enter yout option  ");
            System.out.print("--> ");
                        optionP = input.nextInt();
            System.out.println("______________");
                        switch(optionP){
                    case 1:System.out.println("Calle Manrique Lara,Quito");
                    case 2:System.out.println("Calle Itchimbia,Quito");
                    case 3:System.out.println("Av Naciones Unidas y Av De los Shyris ");
                    case 4:
                }
                    } while(optionP != 4);
                    
                    break;
                case 2:
                    int optionC;
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:                    
                    break;
                    case 6:
                    System.out.println("Good bay " + name);
                    System.exit(0);
                    break;
            }

        } while (option
                != 6);

    }

}
