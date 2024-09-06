public class GamingPc extends Builder{
    @Override
    public void PcType() {
        pc.addType("Gaming PC", "This is a gaming PC");
    }

    @Override
    public void ExtraFeature() {

    }

    @Override
    public void setProcessor() {
        pc.addPart("AMD Ryzen 7 5700X", "This PC has Ryzen 7 5700X processor costing extra 28,000 BDT");
        pc.addPrice(28000);
        pc.addBasePrice(28000);
    }
}
