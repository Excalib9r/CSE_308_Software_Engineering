public class Toyota implements Car{
    @Override
    public String giveName() {
        return "Toyota";
    }

    @Override
    public String giveColor() {
        return "red";
    }

    @Override
    public String giveEngine() {
        return "hydrogen fuel cells";
    }

    @Override
    public String giveDriveTrain() {
        return "rear-wheel";
    }
    @Override
    public String ManuCountry(){
        return "Japan";
    }
}
