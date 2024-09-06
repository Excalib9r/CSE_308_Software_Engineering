public class Zero_shake extends Builder{
    @Override
    public void MsType() {
        ms.addType("Zero_shake", "This is a Zero_shake Milkshake");
    }

    @Override
    public void ExtraFeature() {
    }

    @Override
    public void setIngredients() {
        ms.addPart("chocolate_syrup", "This  milkshake contains chocolate_syrup");
        ms.addPart("chocolate ice cream", "This  milkshake contains chocolate ice cream");
        ms.addPrice(230);
        ms.addBasePrice(230);
    }
}
