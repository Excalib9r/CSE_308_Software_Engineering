public class Akash {
    int initial_deposit;
    int total_deposit;
    int nid;

    public Akash(){
        initial_deposit = 1000;
    }

    public Akash(int amount, int nid){
        this.initial_deposit = amount;
        this.nid = nid;
        total_deposit = amount;
    }

    void send_money(int amount, int nid){
        if(total_deposit - amount > 0){
            total_deposit = total_deposit - amount;
            System.out.println("NID" + this.nid + ": Sending " + amount + " taka to akash account (NID" + nid + ")...current balance is " + total_deposit + " taka");
        }
    }

    void receive_money(int amount, int nid){
        total_deposit = total_deposit + amount;
        System.out.println("NID" + this.nid + ": Received " + amount + " taka from akash account (NID" + nid + ")...current balance is " + total_deposit + " taka");
    }
}
