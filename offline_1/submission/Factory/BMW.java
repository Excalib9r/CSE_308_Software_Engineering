public class BMW implements Car{
    @Override
    public String giveName() {
        return "BMW";
    }

    @Override
    public String giveColor() {
        return "black";
    }

    @Override
    public String giveEngine() {
        return "electric";
    }

    @Override
    public String giveDriveTrain() {
        return "rear-wheel";
    }
    @Override
    public String ManuCountry(){
        return "Germany";
    }
}
