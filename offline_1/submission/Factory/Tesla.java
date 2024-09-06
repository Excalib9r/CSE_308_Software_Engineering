public class Tesla implements Car{
    @Override
    public String giveName() {
        return "Tesla";
    }

    @Override
    public String giveColor() {
        return "white";
    }

    @Override
    public String giveEngine() {
        return "electric";
    }

    @Override
    public String giveDriveTrain() {
        return "all wheels";
    }
    @Override
    public String ManuCountry(){
        return "US";
    }
}
