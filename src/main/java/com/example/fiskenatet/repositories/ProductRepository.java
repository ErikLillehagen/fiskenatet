package com.example.fiskenatet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fiskenatet.models.ProductModel;

/**
 * Created by nordi_000 on 2016-04-20.
 */
public interface ProductRepository extends JpaRepository<ProductModel, Long> {



}
