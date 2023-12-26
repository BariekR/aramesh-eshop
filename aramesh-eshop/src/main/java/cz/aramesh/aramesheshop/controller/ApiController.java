package cz.aramesh.aramesheshop.controller;

import cz.aramesh.aramesheshop.dto.ProductDto;
import cz.aramesh.aramesheshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@CrossOrigin("http://localhost:3000")
public class ApiController {
    private ProductRepository productRepository;

    @GetMapping("/api/products")
    public ResponseEntity<?> getProducts() {
        List<ProductDto> products = productRepository.findAll().stream().map(p -> new ProductDto(p.getName())).collect(Collectors.toList());
        return ResponseEntity.ok(products);
    }
}
