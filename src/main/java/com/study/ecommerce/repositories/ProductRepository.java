package com.study.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.study.ecommerce.entities.Product;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
