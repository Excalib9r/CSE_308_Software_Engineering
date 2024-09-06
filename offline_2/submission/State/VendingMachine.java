public class VendingMachine {
    private State state;
    private boolean success;
    private boolean outOfProduct;
    private int productAmount;
    private int productPrice;
    private int receivedMoney;

    public VendingMachine(){
        this.state = new InitialState(this);
        this.productPrice = 50;
        this.productAmount = 4;
        this.success = true;
        this.outOfProduct = false;
    }

    public void getMoney(int money){
        state.getMoney(money);
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public boolean isPurchaseSuccessful(){
        return this.success;
    }

    public boolean isOutOfProduct(){
        return this.outOfProduct;
    }

    public void changeState(State state){
        this.state = state;
    }

    public void decreaseProductAmount() {
        this.productAmount--;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public int getProductPrice(){
        return this.productPrice;
    }

    public void setReceivedMoney(int receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void shortOnMoney(int money){
        System.out.println("You are Short On Money " + money + "$. Please pay the exact amount to receive product.");
        this.success = false;
    }

    public void giveBackMoney(int money){
        System.out.println("The Vending machine is giving back " + money + "$");
    }

    public void setAlert(){
        System.out.println("Sorry we are out of product. No service is available right now");
        this.outOfProduct = true;
    }
}
