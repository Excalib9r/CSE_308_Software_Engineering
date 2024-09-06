import java.util.Scanner;

public class CoffeeShop {
    private int price;
    boolean orderPlaced;
    Scanner scn;
    public CoffeeShop(){
        scn = new Scanner(System.in);
        price = 0;
        orderPlaced = false;
    }
    public void placeOrder(){
        System.out.println("We Offer 4 Types Of Coffee:");
        System.out.println("1. Americano");
        System.out.println("2. Espresso");
        System.out.println("3. Cappuccino");
        System.out.println("4. Mocha");
        String order;
        while(true){
            System.out.println("Do You want place an order? Answer with YES or NO.");
            order = scn.next();
            if(!order.equalsIgnoreCase("YES"))
                break;
            else{
                orderPlaced = true;
                System.out.println("Which type of coffee do you want to order?");
                order = scn.next();
                if(order.equalsIgnoreCase("1") || order.equalsIgnoreCase("Americano")){
                    Coffee coffee = new Americano(new BlackCoffee(new JustCoffee()));
                    price = price + coffee.getPrice() + 100;
                    System.out.println("Here is Your Coffee: Americano");
                    System.out.println(coffee.getDescriptions());
                    System.out.println("The Price for this Coffee is " + (coffee.getPrice() + 100));
                }
                if(order.equalsIgnoreCase("2") || order.equalsIgnoreCase("Espresso")){
                    Coffee coffee = new Espresso(new BlackCoffee(new JustCoffee()));
                    price = price + coffee.getPrice() + 100;
                    System.out.println("Here is Your Coffee: Espresso");
                    System.out.println(coffee.getDescriptions());
                    System.out.println("The Price for this Coffee is " + (coffee.getPrice() + 100));
                }
                if(order.equalsIgnoreCase("3") || order.equalsIgnoreCase("Cappuccino")){
                    Coffee coffee = new Cappuccino(new MilkCoffee(new JustCoffee()));
                    price = price + coffee.getPrice() + 100;
                    System.out.println("Here is Your Coffee: Cappuccino");
                    System.out.println(coffee.getDescriptions());
                    System.out.println("The Price for this Coffee is " + (coffee.getPrice() + 100));
                }
                if(order.equalsIgnoreCase("4") || order.equalsIgnoreCase("Mocha")){
                    Coffee coffee = new Mocha(new MilkCoffee(new JustCoffee()));
                    price = price + coffee.getPrice() + 100;
                    System.out.println("Here is Your Coffee: Cappuccino");
                    System.out.println(coffee.getDescriptions());
                    System.out.println("The Price for this Coffee is " + (coffee.getPrice() + 100));
                }
            }
        }
        if(orderPlaced){
            System.out.println("The Total price for your Order is " + price);
        }
    }
}
