package cz.aramesh.aramesheshop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(columnDefinition = "nvarchar")
    private String description;
    @ManyToMany(mappedBy = "categories")
    private List<Product> products;

    public Category() {
        products = new ArrayList<>();
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
