import java.util.LinkedList;

public class ProductPc {
    private int price;
    private int basePrice;
    private String type;
    private LinkedList<String> parts;
    private LinkedList<String> modifications;

    public ProductPc(){
        price = 70000;
        basePrice = 70000;
        type = "";
        parts = new LinkedList<String>();
        modifications = new LinkedList<String>();
        modifications.addLast("The PC contains a CPU, motherboard and 1 TB HDD having base price of 70,000 BDT");
    }

    public void addPrice(int price){
        this.price = this.price + price;
    }

    public void addType(String type, String specs){
        this.type = type;
        modifications.addLast(specs);
    }

    public void addBasePrice(int price){
        this.basePrice = this.basePrice + price;
    }

    public void addPart(String part, String specs){
        parts.addLast(part);
        modifications.addLast(specs);
    }

    public void print(){
        System.out.println("The Base Price before modifications is " + basePrice + " BDT");
        for(int i = 0; i < modifications.size(); i++){
            System.out.println(modifications.get(i));
        }
        System.out.println("The Total Price is " + price + " BDT");
    }
}
