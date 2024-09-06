public class ClosedState extends State{
    public ClosedState(VendingMachine vm) {
        super(vm);
        vm.setAlert();
    }

    @Override
    public void getMoney(int money) {

    }
}
