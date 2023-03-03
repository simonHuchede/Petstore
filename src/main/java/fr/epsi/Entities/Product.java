package fr.epsi.bo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "label")
    private String label;
    @Enumerated(EnumType.STRING)
    private ProdType prodType;
    @ManyToMany(mappedBy = "products")
    Set<PetStore> petStores;
}
