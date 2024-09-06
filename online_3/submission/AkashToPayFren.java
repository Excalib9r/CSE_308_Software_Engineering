public class AkashToPayFren extends PayFren{
    Akash akash;

    public AkashToPayFren(Akash akash){
        this.akash = akash;
    }

    @Override
    void send_money(int amount) {
        super.send_money(amount);
    }

    @Override
    void receive_money(int amount) {
        super.receive_money(amount);
    }
}
