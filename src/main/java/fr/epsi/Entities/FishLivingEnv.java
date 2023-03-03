package fr.epsi.bo;

public enum FishLivingEnv {
    FRESH_WATER("eau douce"),SEA_WATER("eau de mer");
    private String label;
    FishLivingEnv(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
