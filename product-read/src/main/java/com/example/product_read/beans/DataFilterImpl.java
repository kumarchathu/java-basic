package com.example.product_read.beans;

import com.example.product_read.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DataFilterImpl implements IDataFilter {

    @Override
    public List<Product> filterProduct(List<Product> productList) {
        return productList.stream().filter(a-> a.getProductPrice() >= 5000).collect(Collectors.toList());
    }
}
