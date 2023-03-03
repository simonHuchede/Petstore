package fr.epsi.bo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "manager_name")
    private String managerName;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "StoreProduct",
            joinColumns = @JoinColumn(name = "prod_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "store_id",referencedColumnName = "id"))
    private Set<Product> products;
    @OneToOne
    private Address address;
    @OneToMany(mappedBy = "petStore")
    private Set<AbstractAnimal> abstractAnimals;

    public PetStore() {
    }

    public PetStore(String name) {
        this.name = name;
    }

    public PetStore(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }

    public PetStore(String name, String managerName, Address address) {
        this.name = name;
        this.managerName = managerName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<AbstractAnimal> getAbstractAnimals() {
        return abstractAnimals;
    }

    public void setAbstractAnimals(Set<AbstractAnimal> abstractAnimals) {
        this.abstractAnimals = abstractAnimals;
    }

    @Override
    public String toString() {
        return "PetStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", managerName='" + managerName + '\'' +
                ", products=" + products +
                ", address=" + address +
                ", abstractAnimals=" + abstractAnimals +
                '}';
    }
}
