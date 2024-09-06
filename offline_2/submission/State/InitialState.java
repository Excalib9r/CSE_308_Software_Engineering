public class InitialState extends State{
    public InitialState(VendingMachine vm) {
        super(vm);
        if(vm.getProductAmount() == 0){
            vm.changeState(new ClosedState(vm));
        }
    }

    @Override
    public void getMoney(int money) {
        int pp = vm.getProductPrice();
        if(money == pp){
            vm.decreaseProductAmount();
            vm.setSuccess(true);
            System.out.println("Purchase Successful");
        }
        else if(money > pp){
            vm.giveBackMoney(money - pp);
            vm.decreaseProductAmount();
            vm.setSuccess(true);
            System.out.println("Purchase Successful");
        }
        else{
            vm.setReceivedMoney(money);
            vm.shortOnMoney(pp - money);
            vm.changeState(new UnderPaidState(vm));
        }
        if(vm.getProductAmount() == 0){
            vm.changeState(new ClosedState(vm));
        }
    }
}
