package com.example.product_read.beans;

import com.example.product_read.model.Product;

import java.util.List;

public interface IDataFilter {
    List <Product> filterProduct(List<Product> productList);
}
