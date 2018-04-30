package ru.ivmiit.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivmiit.service.models.Product;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {
    List<Product> getProductByName(String name);

}
