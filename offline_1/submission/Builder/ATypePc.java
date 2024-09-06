public class ATypePc extends Builder{
    @Override
    public void PcType() {
        pc.addType("Type A", "This is a Type A PC");
    }

    @Override
    public void ExtraFeature() {
        pc.addPart("CPU cooler", "This Pc contains a CPU cooler adding extra cost of 36000 BDT");
        pc.addPrice(36000);
        pc.addBasePrice(36000);
    }

    @Override
    public void setProcessor() {
        pc.addPart("Core i5", "This PC has Core i5 processor costing extra 20,000 BDT");
        pc.addPrice(20000);
        pc.addBasePrice(20000);
    }
}
