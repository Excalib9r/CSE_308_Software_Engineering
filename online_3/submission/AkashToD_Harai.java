import java.awt.*;

public class AkashToD_Harai extends D_Harai{
    Akash akash;
    public AkashToD_Harai(Akash akash){
        this.akash = akash;
    }

    @Override
    void send_money(int amount, int kb) {
        if(akash.total_deposit - amount > 0){
            akash.total_deposit = akash.total_deposit - amount;
            System.out.println("NID" + akash.nid + ": Sending " + amount + " yen to d-harai account (NID" + kb + ")...current balance is " + akash.total_deposit + " yen");
        }
    }

    @Override
    void receive_money(int amount, int kb) {
            akash.total_deposit = akash.total_deposit + 2*amount;
            System.out.println("NID" + akash.nid + ": Received " + amount + " taka from d-harai account (NID" + kb + ")...current balance is " + akash.total_deposit + " taka");
    }
}
