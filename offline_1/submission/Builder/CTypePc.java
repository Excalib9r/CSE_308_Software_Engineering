public class CTypePc extends Builder{
    @Override
    public void PcType() {
        pc.addType("Type C", "This is a Type C PC");
    }

    @Override
    public void ExtraFeature() {
        pc.addPart("DVD drive", "This Pc contains a DVD drive adding extra cost of 6000 BDT");
        pc.addPrice(6000);
        pc.addBasePrice(6000);
    }

    @Override
    public void setProcessor() {pc.addPart("Core i9", "This PC has Core i5 processor costing extra 65,000 BDT");
        pc.addPrice(65000);
        pc.addBasePrice(65000);
    }
}
