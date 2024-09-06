public class UnderPaidState extends State{
    public UnderPaidState(VendingMachine vm) {
        super(vm);
    }

    @Override
    public void getMoney(int money) {
        int arm = vm.getReceivedMoney();
        int pp = vm.getProductPrice();

        if(arm + money == pp){
            vm.decreaseProductAmount();
            vm.setReceivedMoney(0);
            vm.setSuccess(true);
            System.out.println("Purchase Successful");
            vm.changeState(new InitialState(vm));
        }

        else if(arm + money > pp){
            vm.giveBackMoney(money + arm - pp);
            vm.setReceivedMoney(0);
            vm.decreaseProductAmount();
            vm.setSuccess(true);
            System.out.println("Purchase Successful");
            vm.changeState(new InitialState(vm));
        }

        else{
            vm.setReceivedMoney(arm + money);
            vm.shortOnMoney(pp - (money + arm));
        }
    }
}
