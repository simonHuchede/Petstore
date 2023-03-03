package fr.epsi.bo;




public enum ProdType {
FOOD("nourriture"),ACCESSORT("accessoire"),CLEANING("nettoyage");
    private String label;
ProdType(String label){
    this.label = label;
}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
