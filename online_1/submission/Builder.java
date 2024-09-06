public abstract class Builder {
    protected Milkshake ms = new Milkshake();
    abstract void MsType();
    abstract void ExtraFeature();
    abstract  void setIngredients();
    public void setLactoseFree(String answer) {
        if(answer.equalsIgnoreCase("yes")){
            ms.addPart("almond milk" , "this milkshake contains almond milk costing additional 60 BDT");
            ms.addPrice(60);
        }
        else{
            ms.addPart("milk", "this milkshake contains milk");
        }
    }
    public void AddCookiesOnTop(String answer) {
        if(answer.equalsIgnoreCase("yes")){
            ms.addPart("cookies" , "this milkshake contains cookies on top costing additional 40 BDT");
            ms.addPrice(40);
        }
    }
    public void AddCandyOnTop(String answer) {
        if(answer.equalsIgnoreCase("yes")){
            ms.addPart("candy" , "this milkshake contains candy on top costing additional 50 BDT");
            ms.addPrice(50);
        }
    }
    public Milkshake getPc(){
        return ms;
    }
}