public class PayFren {
    int initial_deposit;
    int total_deposit;
    int ssn;

    public PayFren(){
        this.initial_deposit = 10;
    }
    public PayFren(int amount, int ssn){
        this.initial_deposit = amount;
        total_deposit = amount;
        this.ssn = ssn;
    }

    void send_money(int amount, int ssn){
        if(total_deposit - amount > 0){
            total_deposit = total_deposit - amount;
            System.out.println("NID" + this.ssn + ": Sending " + amount + " dollars to payFren account (NID" + ssn + ")...current balance is " + total_deposit + " dollars");
        }
    }

    void receive_money(int amount, int ssn){
        total_deposit = total_deposit + amount;
        System.out.println("NID" + this.ssn + ": Received " + amount + " dollars from payFren account (NID" + ssn + ")...current balance is " + total_deposit + " dollars");
    }
}
