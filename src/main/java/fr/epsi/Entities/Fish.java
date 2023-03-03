package fr.epsi.bo;

import javax.persistence.Entity;

@Entity
public class Fish extends AbstractAnimal{
private FishLivingEnv fishLivingEnv;

    public Fish() {
    }

    public Fish(FishLivingEnv fishLivingEnv) {
        this.fishLivingEnv = fishLivingEnv;
    }

    public FishLivingEnv getFishLivingEnv() {
        return fishLivingEnv;
    }

    public void setFishLivingEnv(FishLivingEnv fishLivingEnv) {
        this.fishLivingEnv = fishLivingEnv;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fishLivingEnv=" + fishLivingEnv +
                '}';
    }
}
