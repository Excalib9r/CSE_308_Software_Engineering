public abstract class Builder {
    protected ProductPc pc = new ProductPc();
    abstract void PcType();
    abstract void ExtraFeature();
    abstract  void setProcessor();
    public void setRAM(String ram) {
        int ramPrice = 0;
        if(ram.equalsIgnoreCase("2666 MHz"))
            ramPrice = 2620;
        else if(ram.equalsIgnoreCase("3200 MHz"))
            ramPrice = 2950;

        pc.addPart("8 GB DDR4 RAM of " + ram , "Contains 8 GB DDR4 RAM of " + ram + " costing extra " + ramPrice + " BDT");
        pc.addPrice(ramPrice);
    }
    public void setGraphicsCard(String gc) {
        int gcPrice = 0;
        if(gc.equalsIgnoreCase("2GB"))
            gcPrice =  6500;
        else if(gc.equalsIgnoreCase("4GB"))
            gcPrice = 7600;

        pc.addPart(gc + " Graphics Card", "This Pc has " + gc + " Graphics card adding extra " + gcPrice + " BDT to the total Price");
        pc.addPrice(gcPrice);
    }
    public ProductPc getPc(){
        return pc;
    }
}
