package touristicplacesofquito;

import java.util.Scanner;

public class TouristicPlacesOfQuito {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
<<<<<<< HEAD
  
   Scanner input = new Scanner(System.in);
=======

        Scanner input = new Scanner(System.in);
>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb
        String name;
        boolean mainLoop = true;
        int option;
        System.out.println("=========================================");
        System.out.println("\t" + "Welcome User \n" + "To start, please tell me your name");
        name = input.nextLine();
        System.out.println("\t" + "Welcome " + name);
        System.out.println("=========================================");
        do {
            option = printBanner(name, input);
            switch (option) {
                case 1:
                    int optionParks;
                    do {
                        optionParks = printBannerParks(name, input);
                        switch (optionParks) {
                            case 1:
                                int areaC[][] = {{270, 285, 71}, {90, 125, 700}, {511, 580, 237}};

                                printCarolinaParkLocation(name);
                                showAreaParks(areaC);
                                 {
                                    int Carolina_Park;
                                    do {
                                        Carolina_Park = showOptionCarolinaPark(name, input);
                                        switch (Carolina_Park) {
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
                                    } while (Carolina_Park != 2);
                                }

                                break;

                            case 2:
                                int areaI[][] = {{365, 220, 46}, {565, 452, 46}, {676, 350, 46}};
                                showAreaParks(areaI);
                                printItchimbiaParkLocation(name);
                                 {
                                    System.out.println("Let's go to Park " + " Itchimbia ");
                                    {
                                        int Itchimbia_Park;
                                        do {
                                            Itchimbia_Park = showOptionItchimbiaPark(name, input);
                                            switch (Itchimbia_Park) {
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
                                        } while (Itchimbia_Park != 2);
                                    }
                                }
                                break;

                            case 3:
                                int areaM[][] = {{890, 563, 63}, {980, 45, 62}, {230, 125, 560}};
                                showAreaParks(areaM);

                                printMetropolitanParkLocation(name);
                                 {
                                    System.out.println(name + "Let's go to Park" + " Metropolitan ");
                                    {
                                        int Metropolitan_Park;
                                        do {
                                            Metropolitan_Park = showOptionMetropolitanPark(name, input);
                                            switch (Metropolitan_Park) {
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
                                        } while (Metropolitan_Park != 2);
                                    }
                                }
                                break;
<<<<<<< HEAD
                                case 4:
                    System.out.println("Good bye " + name + "come back soon");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                        }
                    } while (optionParks != 4);

                    break;
                case 2:
                    int optionChurches;
                    do {
                        optionChurches = showMenuChurchesinQuito(input);
                        switch (optionChurches) {
=======
                            case 4:
                                System.out.println("Good bye " + name + "come back soon");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (optionParks != 4);
>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb

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
                            int optionP = 0;
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
<<<<<<< HEAD
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
                        optionQ = input.nextInt();
=======
                            } while (optionChurches != 4);

                            break;
                        case 3:

                            int optionQ = 0;
                            do {
                                System.out.println("~~~~~~~~~~~~~~"
                                        + "\n" + "| The places in Quito:" + "\n"
                                        + "~~~~~~~~~~~~~~");
                                System.out.println("| 1.Plaza Grande            |");
                                System.out.println("| 2.Plaza del Teatro                   |");
                                System.out.println("| 3.Plaza las Americas                    |");
                                System.out.println("| 4. Exit                            |");
                                System.out.println("~~~~~~~~~~~~~~" + "\n"
                                        + "______________");

                                System.out.println(name + " Enter yout option  ");
                                System.out.print("--> ");
<<<<<<< HEAD
                                optionQ = input.nextInt();

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
>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb
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
                    } while (optionQ != 4);
<<<<<<< HEAD
                    break;
=======
                    } while (optionP != 4);
                            break;
>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb

                        case 4:
                            int optionV;
                            do {
                                optionV = showMenuViewpoints(name, input);
                                switch (optionV) {
=======
                                optionP = input.nextInt();
                                System.out.println("______________");
                                switch (optionQ) {
>>>>>>> 2614271e5150fdac8cda62b3f2209e430baf960b
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
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
=======
                            } while (optionQ != 4);
                    }
                    break;
>>>>>>> 2614271e5150fdac8cda62b3f2209e430baf960b

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

<<<<<<< HEAD
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
>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb
=======
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
>>>>>>> 2614271e5150fdac8cda62b3f2209e430baf960b

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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 2614271e5150fdac8cda62b3f2209e430baf960b
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
<<<<<<< HEAD

                    break;
                case 6:
                    System.out.println("Good bay " + name);
                    System.exit(0);
                    break;
=======
                            } while (optionMalls != 4);

                            break;
                        case 6:
                            System.out.println("Good bay " + name);
                            System.exit(0);
                            break;
                    }

>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb
=======

                    break;
               
>>>>>>> 2614271e5150fdac8cda62b3f2209e430baf960b
            }

        }while(option !=5);
        System.out.println("exit");
    }

    public static int showOptionMetropolitanPark(String name, Scanner input) {
        int Metropolitan_Park;
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Metropolitan_Park = input.nextInt();
        return Metropolitan_Park;
    }

    public static void printMetropolitanParkLocation(String name) {
        System.out.println(name + "Let's go to Metropolitan Park");
        System.out.println("The Ubication" + " Of The Matropolitan Park Is:");
        System.out.println("Quito Metropolitan Park Guanguiltagüa is located at: \n Manrique Lara Street, Quito (El Batán Neighborhood - Quito North)");
    }

    public static int showOptionItchimbiaPark(String name, Scanner input) {
        int Itchimbia_Park;
        System.out.println(name + " you know how to get "
                + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Itchimbia_Park = input.nextInt();
        return Itchimbia_Park;
    }

    public static void printItchimbiaParkLocation(String name) {
        System.out.println(name + "Let's go to Itchimbia Park ");
        System.out.println("The Ubication" + " Of The Itchimbia Park Is:");
        System.out.println("\"Itchimbia Park is located at: \\n Itchimbia Street, Quito (El Dorado Neighborhood - Quito Center)\"");
    }

    public static int showOptionCarolinaPark(String name, Scanner input) {
        int Carolina_Park;
        System.out.println(name + "you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Carolina_Park = input.nextInt();
        return Carolina_Park;
    }

    public static void showAreaParks(int[][] matrix) {
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

    public static void printCarolinaParkLocation(String name) {
        System.out.println(name + "Let's go to Carolina Park ");
        System.out.println("The Ubication" + " Of the Carolina Park Is:");
        System.out.println("\"Carolina Park is located at: \\n Naciones Unidas Avenue y De los Shyris Avenue (Iñaquito Neighborhood -Quito Downtown)\"");
    }

    public static int printBannerParks(String name, Scanner input) {
        int optionP;
        System.out.println("~~~~~~~~~~~~~~"
                + "\n" + "| The parks in Quito:" + "\n"
                + "~~~~~~~~~~~~~~");
        System.out.println("| 1.Carolina Park          |");
        System.out.println("| 2.Itchimbia Park         |");
        System.out.println("| 3.Metropolitan Park      |");
        System.out.println("| 4. Exit                  |");
        System.out.println("~~~~~~~~~~~~~~" + "\n"
                + "______________");
        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
        optionP = input.nextInt();
        System.out.println("______________");
        return optionP;
    }

    public static int printBanner(String name, Scanner input) {
        int option;
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
        return option;
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
        det = (matrix[0][0] * matrix[1][1] * matrix[2][2])
                + (matrix[0][1] * matrix[1][2] * matrix[2][0])
                + (matrix[1][0] * matrix[2][1] * matrix[0][2])
                - (matrix[0][2] * matrix[1][1] * matrix[2][0])
                - (matrix[1][0] * matrix[0][1] * matrix[2][2])
                - (matrix[1][2] * matrix[2][1] * matrix[0][0]);
        area = det / 2;
        System.out.println("this area is -> " + area + " m^2");
    }

    private static void showOptionPlazalasAmericas(String name) {
        System.out.println(name + "Let's go to Plaza las Americas ");
        System.out.println("The Ubication" + " Of Plaza las Americas Is:");
        System.out.println("Direction: Plaza las Americas");
    }

    private static int showOptionPlazadelteatro(String name, Scanner input) {
        int Church_Of_Santo_Domingo;
        System.out.println(name + " you know how to get "
                + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Church_Of_Santo_Domingo = input.nextInt();
        return Church_Of_Santo_Domingo;
    }

    private static void showInfPlazadelTeatro(String name) {
        System.out.println(name + "Let's go to plaza del teatro");
        System.out.println("The Ubication" + " Of plaza del teatro Is:");
        System.out.println("Diretion: Calle Guayaquil N-875 y Esmeraldas. "
                + "Ubicación: Ecuador, PICHINCHA, Quito");
    }

    private static int showOptionPlazaGrande(String name, Scanner input) {
        int The_Basilica;
        System.out.println(name + "you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        The_Basilica = input.nextInt();
        return The_Basilica;
    }

    private static void showInfPlazaGrande(String name) {
        System.out.println(name + "Let's go to The Plaza Grande");
        System.out.println("The Ubication" + " Of The Plaza Grande Is:");
        System.out.println("Direction: and Chile St Venezuela, García Moreno, Quito 170401");
    }

<<<<<<< HEAD

=======
    private static int showMenuParcksinQuito(Scanner input) {
        int optionChurches;
        System.out.println("~~~~~~~~~~~~ Parks in Quito ~~~~~~~~~~~~");
        System.out.println(" I will give you several options, the most common: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|1. Plaza Grande                 |");
        System.out.println("|2. Plaza del Teatro             |");
        System.out.println("|3. Plaza las Americas           |");
        System.out.println("|4. Exit                         |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        optionChurches = input.nextInt();
        return optionChurches;
    }

    public static void showAreaSb(int[][] matrix) {
        int det;
        int area;
        det = (matrix[0][0] * matrix[1][1] * matrix[2][2])
                + (matrix[1][1] * matrix[1][2] * matrix[2][0])
                + (matrix[1][2] * matrix[2][1] * matrix[0][2])
                - (matrix[1][2] * matrix[1][1] * matrix[2][0])
                - (matrix[1][0] * matrix[0][1] * matrix[2][2])
                - (matrix[1][2] * matrix[2][1] * matrix[2][0]);
        area = det / 2;
        System.out.println("this area is -> " + area + " m^2");
    }
}
>>>>>>> 85cfa55332b46466cfc35310d097ba2577c3e7cb
