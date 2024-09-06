public class Chocolate_shake extends Builder{
    @Override
    public void MsType() {
        ms.addType("Chocolate_shake", "This is a Chocolate_shake Milkshake");
    }

    @Override
    public void ExtraFeature() {
        ms.addPart("sugar", "This  milkshake contains sugar");
    }

    @Override
    public void setIngredients() {
        ms.addPart("chocolate_syrup", "This  milkshake contains chocolate_syrup");
        ms.addPart("chocolate ice cream", "This  milkshake contains chocolate ice cream");
        ms.addPrice(230);
        ms.addBasePrice(230);
    }
}