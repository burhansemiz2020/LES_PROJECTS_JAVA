package ProjectRessourceHuman;

import java.util.Scanner;
/*
Nous allons écrire un programme dans une entreprise informatique où il y a des classes employeur,
développeur, manager et une méthode principale qui les imprime. Au sein du programme :
Faites une augmentation dans la classe admin et disposez de fonctionnalités privées telles
que le nombre d'administrateurs, afin que la sous-classe puisse atteindre la superclasse en même temps.
Dans la classe Developper, formatez, affichez les informations, obtenez le constructeur avec des
informations personnelles. Créez un script qui imprime tout cela dans la méthode principale
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("===> Bienvenue le programme de Ressource Human <===");
        String operations = "Operations ...\n"
                + "1. Operations de developpeur\n"
                + "2. Operations de directeur\n"
                + "Pour Quitter appuyez Q";
        System.out.println("******************************************");
        System.out.println(operations);
        System.out.println("******************************************");

        while (true) {
            System.out.println("Veuillez saisir une opération :");
            String op = scan.nextLine();
            if (op.equals("Q")) {
                System.out.println("Appuyez sur Q pour quitter");
                break;
            } else if (op.equals("1")) {
                Developpeur developpeur = new Developpeur("Burhan", "Semiz", 263010, "0560545556", "Java, JavaScript, Selenium");
                String operationsDeveloppeur = "1. Formattez le\n"
                        + "2. Affichez les informations\n"
                        + "Pour Quitter appuyez Q";
                System.out.println(operationsDeveloppeur);
                while (true) {
                    System.out.println("Choisit l'operation");
                    String x_operation = scan.nextLine();
                    if (x_operation.equals("Q")) {
                        System.out.println("Quitter l'operation");
                        break;
                    } else if (x_operation.equals("1")) {
                        System.out.println("Operating System: ");
                        String operatingSystem = scan.nextLine();
                        developpeur.formatez(operatingSystem);

                    } else if (x_operation.equals("2")) {
                        developpeur.montreLinfos();
                    } else {
                        System.out.println("L'operation invalidee de developpeur");
                    }
                }
            } else if (op.equals("2")) {
                Directeur directeur = new Directeur("Henri", "Pascal", 263010, "0560545556", 10);
                String operationsDirecteur = "Les operation de directeur\n"
                        + "1. Augmentation\n"
                        + "Montrez les infos\n"
                        + "Pour Quitter appuyez Q";
                System.out.println(operationsDirecteur);
                while (true) {
                    System.out.println("Choisit l'operation");
                    String x_operation = scan.nextLine();
                    if (x_operation.equals("Q")) {
                        System.out.println("Quitter l'operation");
                        break;
                    } else if (x_operation.equals("1")) {
                        System.out.println("Vous voulez combien euro d'augmentation a directeur? : ");
                        int augmentation = scan.nextInt();
                        scan.nextLine();
                        directeur.augmenterSalaire(augmentation);
                    } else if (x_operation.equals("2")) {
                        directeur.montreLinfos();
                    } else {
                        System.out.println("L'operation invalidee de directeur");
                    }
                }
            } else {
                System.out.println("L'operation invalidee");
            }
        }
    }
}
