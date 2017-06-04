package com.epam.ration.dao;

import com.epam.ration.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

    public Product findProductByName(String name);

}
