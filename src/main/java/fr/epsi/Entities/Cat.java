package fr.epsi.bo;

import javax.persistence.Entity;

@Entity
public class Cat extends AbstractAnimal{
    private String shipId;

    public Cat(String shipId) {
        this.shipId = shipId;
    }

    public Cat() {

    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "shipId='" + shipId + '\'' +
                '}';
    }
}
