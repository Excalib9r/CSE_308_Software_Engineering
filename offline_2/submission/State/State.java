public abstract class State {
    protected VendingMachine vm;

    public State(VendingMachine vm){
        this.vm = vm;
    }

    public abstract void getMoney(int money);
}
