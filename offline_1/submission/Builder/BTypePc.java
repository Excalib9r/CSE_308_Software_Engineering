public class BTypePc extends Builder{
    @Override
    public void PcType() {
        pc.addType("Type B", "This is a Type B PC");
    }

    @Override
    public void ExtraFeature() {
        pc.addPart("liquid cooler", "This Pc contains a liquid cooler adding extra cost of 17000 BDT");
        pc.addPrice(17000);
        pc.addBasePrice(17000);
    }

    @Override
    public void setProcessor() {
        pc.addPart("Core i5", "This PC has Core i5 processor costing extra 37000 BDT");
        pc.addPrice(37000);
        pc.addBasePrice(37000);
    }
}
