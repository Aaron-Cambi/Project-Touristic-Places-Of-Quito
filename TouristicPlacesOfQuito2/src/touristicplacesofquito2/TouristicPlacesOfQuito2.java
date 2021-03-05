package touristicplacesofquito2;

import java.util.Scanner;

public class TouristicPlacesOfQuito2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        boolean mainLoop = true;
        int option;
        System.out.println("=========================================");
        System.out.println("\t" + "Welcome User \n" + "To start, please tell me your name");
        name = input.nextLine();
        System.out.println("\t" + "Welcome " + name);
        System.out.println("=========================================");
        do {
            bannerGeneral(name);
            option = input.nextInt();
            System.out.println("______");
            switch (option) {
                case 1:
                    int optionP;
                    do {
                        bannerparks(name);
                        optionP = input.nextInt();
                        System.out.println("__");
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
                        bannerChurches();
                        optionChurches = input.nextInt();
                        switch (optionChurches) {
                            case 1:
                                int matrixB[][] = {{200, 341, 3}, {103, 483, 3}, {120, 406, 3}};
                                showInfChurchTheBasilica(name);
                                showAreaB(matrixB);
                                 {
                                    int The_Basilica;
                                    do {
                                        showOption(name);
                                        The_Basilica = input.nextInt();
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
                                int matrixSD[][] = {{103, 241, 3}, {173, 398, 3}, {100, 239, 3}};
                                showInfChurchOfSantoDomingo(name);
                                showArea(matrixSD);
                                 {
                                    System.out.println("Let's go to Churches " + "Church Of Santo Domingo");
                                    {
                                        int Church_Of_Santo_Domingo;
                                        do {
                                            showOption(name);
                                            Church_Of_Santo_Domingo = input.nextInt();
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
                                int matrixS[][] = {{101, 220, 3}, {205, 303, 3}, {161, 272, 3}};
                                showInfChurchOfElSagrario(name);
                                showArea(matrixS);
                                 {
                                    System.out.println(name + "Let's go to Churches "
                                            + "Church Of El Sagrario");
                                    {
                                        int Church_Of_El_Sagrario;
                                        do {
                                            showOption(name);
                                            Church_Of_El_Sagrario = input.nextInt();
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
                    int optionS = 0;
                    do {
                        System.out.println("~~"
                                + "\n" + "| The Square in Quito:" + "\n"
                                + "~~");
                        System.out.println("| 1.Plaza Grande            |");
                        System.out.println("| 2.Plaza del Teatro        |");
                        System.out.println("| 3.Plaza las Americas      |");
                        System.out.println("| 4. Exit                   |");
                        System.out.println("~~" + "\n"
                                + "__");

                        System.out.println(name + " Enter yout option  ");
                        System.out.print("--> ");
                        optionP = input.nextInt();
                        System.out.println("__");
                        switch (optionS) {
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
                    } while (optionS != 4);

                    break;

                case 4:
                    int optionV;
                    do {
                        showBannerViewpoint(name);
                        optionV = input.nextInt();
                        System.out.println("______");
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
                                            showOption(name);
                                            panecillo = input.nextInt();
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
                                ShowInfGuapulo();
                                showArea(areaG);
                                 {
                                    {
                                        int optionG;
                                        do {
                                            showOption(name);
                                            optionG = input.nextInt();
                                            switch (optionG) {
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
                                        } while (optionG != 2);
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
                                            showOption(name);
                                            cruzLoma = input.nextInt();
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
                        System.out.println("~~ Malls in Quito ~~");
                        System.out.println(" I will give you several options, the most common: ");
                        System.out.println("~~~");
                        System.out.println("|1.Quicentro_North        |");
                        System.out.println("|2.CCI                    |");
                        System.out.println("|3.Mall_El_Jardin         |");
                        System.out.println("|4. Exit                  |");
                        System.out.println("~~~");
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
                                            showOption(name);
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
                                            showOption(name);
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

    private static void showAreaB(int[][] matrixB) {
        int det;
        int area;
        det = (matrixB[0][0] * matrixB[1][1] * matrixB[2][2])
                + (matrixB[0][1] * matrixB[1][2] * matrixB[2][0])
                + (matrixB[1][0] * matrixB[2][1] * matrixB[0][2])
                - (matrixB[0][2] * matrixB[1][1] * matrixB[2][0])
                - (matrixB[1][0] * matrixB[0][1] * matrixB[2][2])
                - (matrixB[1][2] * matrixB[2][1] * matrixB[0][0]);
        area = det / 2;
        System.out.println("this area is -> " + area + " m^2");
    }

    private static void showInfChurchOfElSagrario(String name) {
        System.out.println(name + "Let's go to Church Of El Sagrario");
        System.out.println("The Ubication" + " Of Church Of El Sagrario Is:");
        System.out.println("Direction: Quito's Historic center "
                + "García Moreno y Espejo");
    }

    private static void showInfChurchTheBasilica(String name) {
        System.out.println(name + "Let's go to The Basilica");
        System.out.println("The Ubication" + " Of The Basilica Is:");
        System.out.println("Direction: Quito's Historic center "
                + "between the streets, "
                + "Carchi N122 y Venezuela");
    }

    private static void showInfChurchOfSantoDomingo(String name) {
        System.out.println(name + "Let's go to Church Of Santo Domingo");
        System.out.println("The Ubication" + " Of Church Of Santo Domingo Is:");
        System.out.println("Diretion: Quito's Historic center "
                + "Calle Flores y Pereira");
    }

    private static void showInfCruzLoma() {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints cruz loma:" + "\n"
                + "~~~~~~");
        System.out.println("The Ubication" + " Lloa Parish");
    }

    private static void ShowInfGuapulo() {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints Guapulo" + "\n"
                + "~~~~~~");
        System.out.println("The Ubication" + " Sector Guapulo");
        System.out.println("Direction: the intersection "
                + "of Av. Rafael León and Stubel.");
    }

    private static void showOption(String name) {
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }

    private static void showInfPanecillo() {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints Panecillo:" + "\n"
                + "~~~~~~");
        System.out.println("The Ubication" + "sector historical Center");
        System.out.println("Direction: Cumbre del Panecillo, "
                + "Gral Melchor Aymerich");
    }

    private static void showBannerViewpoint(String name) {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints In Quito:" + "\n"
                + "~~~~~~");
        System.out.println("| 1.Panecillo                        |");
        System.out.println("| 2.Viewpoint the Guapulo            |");
        System.out.println("| 3.Viewpoint the Cruz Loma          |");
        System.out.println("| 4. Exit                            |");
        System.out.println("~~~~~~"
                + "\n" + "______");
        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
    }

    public static void bannerGeneral(String name) {
        System.out.println("~~~~~~" + "\n"
                + "|     Touristic Places Of Quito      |" + "\n"
                + "~~~~~~");
        System.out.println("~~~~~~" + "\n"
                + "|  Hello, Where are we going today?  |"
                + "\n"
                + "~~~~~~");
        System.out.println("| 1. Parks                           |");
        System.out.println("| 2. Churches                        |");
        System.out.println("| 3. Square                          |");
        System.out.println("| 4. Viewpoints                      |");
        System.out.println("| 5. Malls                           |");
        System.out.println("| 6. Exit                            |");
        System.out.println("~~~~~~" + "\n"
                + "______");
        System.out.println(name + " Enter your option  ");
        System.out.print("--> ");
    }

    public static void bannerChurches() {
        System.out.println("~~ Churches in Quito ~~");
        System.out.println(" I will give you several options, the most common: ");
        System.out.println("~~~~");
        System.out.println("|1. The Basilica                 |");
        System.out.println("|2. Church Of Santo Domingo      |");
        System.out.println("|3. Church Of El Sagrario        |");
        System.out.println("|4. Exit                         |");
        System.out.println("~~~~");
    }

    public static void bannerparks(String name) {
        System.out.println("~~"
                + "\n" + "| The parks in Quito:" + "\n"
                + "~~");
        System.out.println("| 1.Quito metopolitan park           |");
        System.out.println("| 2.Itchimbia park                   |");
        System.out.println("| 3.Carolina park                    |");
        System.out.println("| 4. Exit                            |");
        System.out.println("~~" + "\n"
                + "__");
        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
    }

    public static void showArea(int[][] matrix) {
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
}
