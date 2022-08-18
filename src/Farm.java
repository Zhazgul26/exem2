public class Farm {
    private String adress;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[]sheep;

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    private String OwnerName;

    public Farm(String adress,Cow[]cows,Sheep[]sheep,Horse[]horses,String OwnerName){
        this.adress=adress;
        this.cows=cows;
        this.sheep=sheep;
        this.horses=horses;
        this.OwnerName = OwnerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }
}
