package ru.ivmiit.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ivmiit.service.forms.ProductForm;
import ru.ivmiit.service.models.Product;
import ru.ivmiit.service.repositories.ProductsRepository;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public void addProducts(ProductForm productForm) {
        Product product = Product.builder()
                .name(productForm.getName())
                .price(productForm.getPrice())
                .build();
        productsRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productsRepository.findAll();
    }
}
