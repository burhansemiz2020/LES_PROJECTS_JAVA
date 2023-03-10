package Grocery_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //price/kg

        Fruit apple = new Fruit("Apple", 2.50);
        Fruit banana = new Fruit("Banana", 1.75);
        Fruit orange = new Fruit("Orange", 3.00);
        Fruit kiwi = new Fruit("Kiwi", 2.00);
        Fruit strawberry = new Fruit("Strawberry", 4.50);

        Vegetable broccoli = new Vegetable("Broccoli", 2.00);
        Vegetable carrot = new Vegetable("Carrot", 1.25);
        Vegetable cucumber = new Vegetable("Cucumber", 1.50);
        Vegetable tomato = new Vegetable("Tomato", 2.75);
        Vegetable onion = new Vegetable("Onion", 1.00);

        System.out.println("Welcome to the grocery store!");

        System.out.println("Please enter the quantity (kg) of fruits you would like to purchase:");
        System.out.print("Apple: ");
        int appleQuantity = scanner.nextInt();
        System.out.print("Banana: ");
        int bananaQuantity = scanner.nextInt();
        System.out.print("Orange: ");
        int orangeQuantity = scanner.nextInt();
        System.out.print("Kiwi: ");
        int kiwiQuantity = scanner.nextInt();
        System.out.print("Strawberry: ");
        int strawberryQuantity = scanner.nextInt();
        System.out.println("Please enter the quantity (kg) of vegetables you would like to purchase:");
        System.out.print("Broccoli: ");
        int broccoliQuantity = scanner.nextInt();
        System.out.print("Carrot: ");
        int carrotQuantity = scanner.nextInt();
        System.out.print("Cucumber: ");
        int cucumberQuantity = scanner.nextInt();
        System.out.print("Tomato: ");
        int tomatoQuantity = scanner.nextInt();
        System.out.print("Onion: ");
        int onionQuantity = scanner.nextInt();

        double totalCost = apple.getPrice() * appleQuantity +
                banana.getPrice() * bananaQuantity +
                orange.getPrice() * orangeQuantity +
                kiwi.getPrice() * kiwiQuantity +
                strawberry.getPrice() * strawberryQuantity +
                broccoli.getPrice() * broccoliQuantity +
                carrot.getPrice() * carrotQuantity +
                cucumber.getPrice() * cucumberQuantity +
                tomato.getPrice() * tomatoQuantity +
                onion.getPrice() * onionQuantity;

        System.out.println("Thank you for shopping with us! Your total cost is $" + totalCost);

    }
    /*
    Welcome to the grocery store!
    Please enter the quantity (kg) of fruits you would like to purchase:
    Apple: 1
    Banana: 1
    Orange: 2
    Kiwi: 1
    Strawberry: 1
    Please enter the quantity (kg) of vegetables you would like to purchase:
    Broccoli: 1
    Carrot: 2
    Cucumber: 2
    Tomato: 2
    Onion: 2
    Thank you for shopping with us! Your total cost is $31.75
     */


}

