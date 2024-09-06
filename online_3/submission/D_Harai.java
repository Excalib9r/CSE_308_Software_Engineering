public class D_Harai {
    int initial_deposit;
    int kojin_bango;
    int total_deposit;

    public D_Harai(){
        this.initial_deposit = 1500;
    }

    public D_Harai(int amount, int kojin_bango){
        this.initial_deposit = amount;
        this.kojin_bango = kojin_bango;
        total_deposit = amount;
    }

    void send_money(int amount, int kb){
        if(total_deposit - amount > 0){
            total_deposit = total_deposit - amount;
            System.out.println("NID" + this.kojin_bango + ": Sending " + amount + " yen to d-harai account (NID" + kb + ")...current balance is " + total_deposit + " yen");
        }
    }

    void receive_money(int amount, int kb){
        total_deposit = total_deposit + amount;
        System.out.println("NID" + this.kojin_bango + ": Received " + amount + " yen from d-harai account (NID" + kb + ")...current balance is " + total_deposit + " yen");
    }
}
