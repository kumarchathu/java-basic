package com.example.product_read;

import com.example.product_read.beans.CsvReader;
import com.example.product_read.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductReadApplication {


	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctxt = SpringApplication.run(ProductReadApplication.class, args);
		CsvReader ctxtBean = ctxt.getBean(CsvReader.class);

		List<Product> productList = ctxtBean.fileReadAndFilterProductData();
		productList.forEach(p -> System.out.println(p.getProductId()+ ", " + p.getProductName() + ", " + p.getProductPrice()));

	}

}
