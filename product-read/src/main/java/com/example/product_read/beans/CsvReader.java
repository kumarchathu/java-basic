package com.example.product_read.beans;

import com.example.product_read.model.Product;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvReader {
    private IDataFilter iDataFilter;

    public CsvReader(IDataFilter iDataFilter) {
        this.iDataFilter = iDataFilter;
    }

    public List<Product> fileReadAndFilterProductData() throws Exception {
        List<Product> productList = new ArrayList<>();
        FileReader fileReader = new FileReader(new File("product.txt"));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lineData = bufferedReader.readLine();

        while(lineData != null){
            String[] splitData = lineData.split(",");
            String prodId = splitData[0];
            String prodName = splitData[1];
            String prodPrice = splitData[2];

            Product product = new Product();
            product.setProductId(Integer.parseInt(prodId));
            product.setProductName(prodName);
            product.setProductPrice(Double.parseDouble(prodPrice));
            productList.add(product);
            lineData = bufferedReader.readLine();
        }
        bufferedReader.close();
    return iDataFilter.filterProduct(productList);
    }
}
