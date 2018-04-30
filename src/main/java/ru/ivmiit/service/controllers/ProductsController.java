package ru.ivmiit.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ivmiit.service.forms.ProductForm;
import ru.ivmiit.service.models.Product;
import ru.ivmiit.service.repositories.ProductsRepository;
import ru.ivmiit.service.services.ProductsService;


@Controller
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping("/products")
    public String getProducsPage(ModelMap model) {
        model.addAttribute("productsFromServer", productsService.findAll());
        return "products";
    }

    @GetMapping("/addProducts")
    public String getAddProducts() {
        return "addProducts";
    }

    @PostMapping("/addProducts")
    public String addProducts(ProductForm productForm) {
        productsService.addProducts(productForm);
        return "redirect:/addProducts";
    }

}
