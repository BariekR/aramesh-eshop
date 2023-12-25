package cz.aramesh.aramesheshop.repository;

import cz.aramesh.aramesheshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
