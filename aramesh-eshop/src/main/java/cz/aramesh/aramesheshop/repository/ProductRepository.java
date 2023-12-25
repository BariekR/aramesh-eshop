package cz.aramesh.aramesheshop.repository;

import cz.aramesh.aramesheshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
