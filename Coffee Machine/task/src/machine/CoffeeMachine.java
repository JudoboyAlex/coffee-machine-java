package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        do {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            input = scanner.nextLine();
            switch(input) {
                case "buy" :
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String buyChoice = scanner.nextLine();
                    switch(buyChoice) {
                        //Exepresso
                        case "1" :
                            if(water/250 >= 1 && beans / 16 >= 1 && cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 250;
                                milk = milk - 0;
                                beans = beans - 16;
                                money= money + 4;
                                cups = cups - 1;
                                continue;
                            } else if(water / 250 < 1) {
                                System.out.println("Sorry, not enough water!");
                                continue;
                            } else if(beans / 16 < 1) {
                                System.out.println("Sorry, not enough beans!");
                                continue;
                            } else if(cups < 1) {
                                System.out.println("Sorry, not enough cups");
                            }
                            //latte
                        case "2" :
                            if(water/350 >= 1 && milk / 75 >= 1  && beans / 20 >= 1 && cups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 350;
                                milk = milk - 75;
                                beans = beans - 20;
                                money = money + 7;
                                cups = cups - 1;

                                continue;
                            } else if(water / 350 < 1) {
                                System.out.println("Sorry, not enough water!");
                                continue;
                            } else if(milk / 75 < 1) {
                                System.out.println("Sorry, not enough milk!");
                                continue;
                            }
                            else if(beans / 20 < 1) {
                                System.out.println("Sorry, not enough beans!");
                                continue;
                            } else if(cups < 1) {
                                System.out.println("Sorry, not enough cups");
                                continue;
                            }
                            //cappuccino
                        case "3" :
                            if(water/200 >= 1 && milk / 100 >= 1  && beans / 12 >= 1 && cups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water = water - 200;
                                milk = milk - 100;
                                beans = beans - 12;
                                money = money + 6;
                                cups = cups - 1;

                                continue;
                            } else if(water / 200 < 1) {
                                System.out.println("Sorry, not enough water!");
                                continue;
                            } else if(milk / 100 < 1) {
                                System.out.println("Sorry, not enough milk!");
                                continue;
                            }
                            else if(beans / 12 < 1) {
                                System.out.println("Sorry, not enough beans!");
                                continue;
                            } else if(cups < 1) {
                                System.out.println("Sorry, not enough cups");
                                continue;
                            }
                        case "back" :
                            break;
                    }
                    continue;

                case "fill" :
                    System.out.println("Write how many ml of water do you want to add: ");
                    int addWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int addMilk = scanner.nextInt();
                    System.out.println("Write how many ml of coffee beans do you want to add: ");
                    int addBeans = scanner.nextInt();
                    System.out.println("Write how many ml of cups of coffee do you want to add: ");
                    int addCups = scanner.nextInt();
                    water += addWater;
                    milk += addMilk;
                    beans += addBeans;
                    cups += addCups;
                    continue;
                case "take" :
                    System.out.println("i gave you $" + money);
                    money = 0;
                    continue;
                case "remaining" :
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    continue;
                case "exit" :
                    System.exit(0);

            } } while(input != "exit");
    }
}