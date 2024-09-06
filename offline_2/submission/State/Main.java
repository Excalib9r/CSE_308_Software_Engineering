import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        Scanner scn = new Scanner(System.in);

        while(true){
            if(vm.isOutOfProduct()){
                break;
            }
            System.out.println("If you want to continue purchase type \"yes\" else \"exit\" ");
            String str = scn.next();
            if(str.equalsIgnoreCase("exit")){
                break;
            }
            if(str.equalsIgnoreCase("yes")){
                System.out.println("The product price is " + vm.getProductPrice() + "$. Pay the exact amount to get product");
                while(true){
                    int money = scn.nextInt();
                    vm.getMoney(money);
                    boolean bool = vm.isPurchaseSuccessful();
                    if(bool){
                        break;
                    }
                }
            }
        }
        System.out.println("Thank you for the purchase");
    }
}