package touristicplacesofquito;

import java.util.Scanner;

public class TouristicPlacesOfQuito {

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

            System.out.println(name + " Enter your option  ");
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
                        switch (optionP) {
                            case 1:
                                System.out.println("Calle Manrique Lara,Quito");
                            case 2:
                                System.out.println("Calle Itchimbia,Quito");
                            case 3:
                                System.out.println("Av Naciones Unidas y Av De los Shyris ");
                            case 4:
                        }
                    } while (optionP != 4);

                    break;
                case 2:
                    int optionChurches;
                    do {
                        optionChurches = showMenuChurchesinQuito(input);
                        switch (optionChurches) {

                            case 1:
                                int areaB[][] = {{135, 251, 4}, {103, 383, 4}, {100, 406, 4}};
                                showInfBasilica(name);
                                showArea(areaB);
                                 {
                                    int The_Basilica;
                                    do {
                                        The_Basilica = showOptionBasilica(name, input);
                                        switch (The_Basilica) {
                                            case 1:
                                                System.out.println(name + "have a good trip,"
                                                        + " follow the direction given,"
                                                        + " we will be accompanying you");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                System.out.println("we will stay at your original point");
                                                break;
                                        }
                                    } while (The_Basilica != 2);
                                }

                                break;

                            case 2:
                                int matrix[][] = {{203, 341, 4}, {173, 298, 4}, {100, 239, 4}};
                                showInfSantoDomingo(name);                                
                                showAreaSD(matrix);
                                 
                     {
                        System.out.println("Let's go to Churches " + "Church Of Santo Domingo");
                        {
                            int Church_Of_Santo_Domingo;
                            do {
                                Church_Of_Santo_Domingo = showOptionSantoDomingo(name, input);
                                switch (Church_Of_Santo_Domingo) {
                                    case 1:
                                        System.out.println(name + "have a good trip, "
                                                + "follow the direction given"
                                                + " we will be accompanying you");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("we will stay at "
                                                + "your original point");
                                        break;
                                }
                            } while (Church_Of_Santo_Domingo != 2);
                        }
                    }
                    break;

                case 3:
                    int areaS[][] = {{101, 200, 4}, {205, 303, 4}, {161, 272, 4}};
                    showInfElSagrario(name);
                    showArea(areaS);
                     {
                        System.out.println(name + "Let's go to Churches "
                                + "Church Of El Sagrario");
                        {
                            int Church_Of_El_Sagrario;
                            do {
                                Church_Of_El_Sagrario = showOptionElSagrario(name, input);
                                switch (Church_Of_El_Sagrario) {
                                    case 1:
                                        System.out.println(name + "have a good trip, "
                                                + "follow the direction given, "
                                                + "we will be accompanying you");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("we will stay at your original point");
                                        break;
                                }
                            } while (Church_Of_El_Sagrario != 2);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Good bye " + name + "come back soon");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (optionChurches != 4);

        break;

    

case 3:
                    int optionQ = 0;
                    do {
                        System.out.println("~~~~~~~~~~~~~~"
                                + "\n" + "| The parks in Quito:" + "\n"
                                + "~~~~~~~~~~~~~~");
                        System.out.println("| 1.Plaza Grande            |");
                        System.out.println("| 2.Plaza del Teatro                   |");
                        System.out.println("| 3.Plaza las Americas                    |");
                        System.out.println("| 4. Exit                            |");
                        System.out.println("~~~~~~~~~~~~~~" + "\n"
                                + "______________");

                        System.out.println(name + " Enter yout option  ");
                        System.out.print("--> ");
                        optionP = input.nextInt();
                        System.out.println("______________");
                        switch (optionQ) {
                            case 1:
                                System.out.println("and Chile St Venezuela,"
                                        + " García Moreno, Quito 170401");
                            case 2:
                                System.out.println("Calle Guayaquil entre "
                                        + "Manabi y Flores, Quito 170150");
                            case 3:
                                System.out.println("Avenida NNUU Oe4-27 y,"
                                        + "a Av. de la República, Quito ");
                            case 4:
                        }
                    } while (optionP != 4);
                    break;

                case 4:
                    int optionV;
                    do {
                        optionV = showMenuViewpoints(name, input);
                        switch (optionV) {
                            case 1:                              
                                int areaP[][] = {{205, 353, 1}, {145, 458, 1}, {128, 454, 1}};
                                showInfPanecillo();
                                showArea(areaP); 
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "Panecillo");
                                    {
                                        int panecillo;
                                        do {
                                            panecillo = showOptionPanecillo(name, input);
                                            switch (panecillo) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (panecillo != 2);
                                    }
                                }
                                break;
                            case 2:
                                int areaG[][] = {{100, 223, 1}, {145, 358, 1}, {128, 254, 1}};
                                showInfGuapulo();
                                showArea(areaG);
                                 {
                                    {
                                        int guapulo;
                                        do {
                                            guapulo = showOptionGueapulo(name, input);
                                            switch (guapulo) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (guapulo != 2);
                                    }
                                }
                                break;
                            case 3:
                                 int areaC[][] = {{95, 214, 1}, {272, 345, 1}, {108, 234, 1}};
                                showInfCruzLoma();
                                showArea(areaC);
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "CRUZ LOMA");
                                    {
                                        int cruzLoma;
                                        do {
                                            cruzLoma = showOptionCruzLoma(name, input);
                                            switch (cruzLoma) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (cruzLoma != 2);
                                    }
                                }
                                break;
                            case 4:
                        }
                    } while (optionV != 4);
                    break;
                case 5:
                    int optionMalls;
                    do {
                        System.out.println("~~~~~~~~~~~~ Malls in Quito ~~~~~~~~~~~~");
                        System.out.println(" I will give you several options, the most common: ");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("|1.Quicentro_North        |");
                        System.out.println("|2.CCI                    |");
                        System.out.println("|3.Mall_El_Jardin         |");
                        System.out.println("|4. Exit                  |");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        optionMalls = input.nextInt();
                        switch (optionMalls) {

                            case 1:

                                System.out.println(name + "Let's go to Quicentro_North");
                                System.out.println("The Ubication" + " Of The Quicentro_North Is:");
                                System.out.println("Direction: Avenida Naciones Unidas "
                                        + "between Avenida 6 de Diciembre and, "
                                        + "Av. de los Shyris. Quito");
                                 {
                                    int Quicentro_North;
                                    do {
                                        System.out.println(name + "you know how to get " + "there?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        Quicentro_North = input.nextInt();
                                        switch (Quicentro_North) {
                                            case 1:
                                                System.out.println(name + "have a good trip,"
                                                        + " follow the direction given,"
                                                        + " we will be accompanying you");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                System.out.println("we will stay at your original point");
                                                break;
                                        }
                                    } while (Quicentro_North != 2);
                                }

                                break;

                            case 2:
                                System.out.println(name + "Let's go to CCI");
                                System.out.println("The Ubication" + " Of The CCI Is:");
                                System.out.println("Diretion: Av. Amazonas N36-152 "
                                        + "y Naciones Unidas. Quito 170102");
                                 {
                                    System.out.println("Let's go to Viewpoint " + "CCI");
                                    {
                                        int CCI;
                                        do {
                                            System.out.println(name + " you know how to get "
                                                    + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            CCI = input.nextInt();
                                            switch (CCI) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given"
                                                            + " we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at "
                                                            + "your original point");
                                                    break;
                                            }
                                        } while (CCI != 2);
                                    }
                                }
                                break;

                            case 3:
                                System.out.println(name + "Let's go to Mall_El_Jardin");
                                System.out.println("The Ubication" + " Of The Mall_El_Jardin Is:");
                                System.out.println("Direction: Av.Amazonas, Av. de la República N16-114 "
                                        + "y, Quito 170518");
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "Mall_El_Jardin");
                                    {
                                        int Mall_El_Jardin;
                                        do {
                                            System.out.println(name + " you know how to get " + "there?");
                                            System.out.println("1. Yes");
                                            System.out.println("2. No");
                                            Mall_El_Jardin = input.nextInt();
                                            switch (Mall_El_Jardin) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (Mall_El_Jardin != 2);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Good bye " + name + "come back soon");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (optionMalls != 4);

                    break;
                case 6:
                    System.out.println("Good bay " + name);
                    System.exit(0);
                    break;
            }

        } while (option
                != 6);

    }

    public static void showAreaSD(int[][] matrix) {
        int det;
        int area;
        det = (matrix[0][0] * matrix[1][1] * matrix[2][2])
                + (matrix[0][1] * matrix[1][2] * matrix[2][0])
                + (matrix[1][0] * matrix[2][1] * matrix[0][2])
                - (matrix[0][2] * matrix[1][1] * matrix[2][0])
                - (matrix[1][0] * matrix[0][1] * matrix[2][2])
                - (matrix[1][2] * matrix[2][1] * matrix[0][0]);
        area = det / 2;
        System.out.println("this area is -> " + area + " m^2");
    }

    private static int showOptionElSagrario(String name, Scanner input) {
        int Church_Of_El_Sagrario;
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Church_Of_El_Sagrario = input.nextInt();
        return Church_Of_El_Sagrario;
    }

    private static void showInfElSagrario(String name) {
        System.out.println(name + "Let's go to Church Of El Sagrario");
        System.out.println("The Ubication" + " Of Church Of El Sagrario Is:");
        System.out.println("Direction: Quito's Historic center "
                + "García Moreno y Espejo");
    }

    private static int showOptionSantoDomingo(String name, Scanner input) {
        int Church_Of_Santo_Domingo;
        System.out.println(name + " you know how to get "
                + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Church_Of_Santo_Domingo = input.nextInt();
        return Church_Of_Santo_Domingo;
    }

    private static void showInfSantoDomingo(String name) {
        System.out.println(name + "Let's go to Church Of Santo Domingo");
        System.out.println("The Ubication" + " Of Church Of Santo Domingo Is:");
        System.out.println("Diretion: Quito's Historic center "
                + "Calle Flores y Pereira");
    }

    private static int showOptionBasilica(String name, Scanner input) {
        int The_Basilica;
        System.out.println(name + "you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        The_Basilica = input.nextInt();
        return The_Basilica;
    }

    private static void showInfBasilica(String name) {
        System.out.println(name + "Let's go to The Basilica");
        System.out.println("The Ubication" + " Of The Basilica Is:");
        System.out.println("Direction: Quito's Historic center "
                + "between the streets, "
                + "Carchi N122 y Venezuela");
    }

    private static int showMenuChurchesinQuito(Scanner input) {
        int optionChurches;
        System.out.println("~~~~~~~~~~~~ Churches in Quito ~~~~~~~~~~~~");
        System.out.println(" I will give you several options, the most common: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|1. The Basilica                 |");
        System.out.println("|2. Church Of Santo Domingo      |");
        System.out.println("|3. Church Of El Sagrario        |");
        System.out.println("|4. Exit                         |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        optionChurches = input.nextInt();
        return optionChurches;
    }

    private static int showOptionCruzLoma(String name, Scanner input) {
        int cruzLoma;
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        cruzLoma = input.nextInt();
        return cruzLoma;
    }

    private static void showInfCruzLoma() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n" + "| The Viewpoints cruz loma:" + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Ubication" + " Lloa Parish");
    }

    private static int showOptionGueapulo(String name, Scanner input) {
        int guapulo;
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        guapulo = input.nextInt();
        return guapulo;
    }

    private static void showInfGuapulo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n" + "| The Viewpoints Guapulo" + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Ubication" + " Sector Guapulo");
        System.out.println("Direction: the intersection "
                + "of Av. Rafael León and Stubel.");
    }

    private static int showOptionPanecillo(String name, Scanner input) {
        int panecillo;
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        panecillo = input.nextInt();
        return panecillo;
    }

    private static void showInfPanecillo() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n" + "| The Viewpoints Panecillo:" + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Ubication" + "sector historical Center");
        System.out.println("Direction: Cumbre del Panecillo, "
                + "Gral Melchor Aymerich");
    }

    private static int showMenuViewpoints(String name, Scanner input) {
        int optionV;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n" + "| The Viewpoints In Quito:" + "\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| 1.Panecillo                        |");
        System.out.println("| 2.Viewpoint the Guapulo            |");
        System.out.println("| 3.Viewpoint the Cruz Loma          |");
        System.out.println("| 4. Exit                            |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\n" + "______________________________________");
        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
        optionV = input.nextInt();
        System.out.println("______________________________________");
        return optionV;
    }

    public static void showArea(int[][] matrix) {
        int det;
        int area;
        det =  (matrix[0][0] * matrix[1][1] * matrix[2][2])
                + (matrix[0][1] * matrix[1][2] * matrix[2][0])
                + (matrix[1][0] * matrix[2][1] * matrix[0][2])
                - (matrix[0][2] * matrix[1][1] * matrix[2][0]) 
                - (matrix[1][0] * matrix[0][1] * matrix[2][2])
                - (matrix[1][2] * matrix[2][1] * matrix[0][0]);
        area = det / 2;
        System.out.println("this area is -> " + area + " m^2");
    }
}
