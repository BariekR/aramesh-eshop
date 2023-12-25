package cz.aramesh.aramesheshop.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(columnDefinition = "nvarchar")
    private String description;
    private BigDecimal price;
    @ManyToMany
    private List<Category> categories;

    public Product() {
        categories = new ArrayList<>();
    }
    public Product(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void addCategory(Category category) {
        categories.add(category);
    }
}
