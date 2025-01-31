package com.mav.productPage.service;

import com.mav.productPage.pojo.Details;
import com.mav.productPage.pojo.Product;
import com.mav.productPage.pojo.Reviews;
import com.mav.productPage.service.client.DetailsFeignClient;
import com.mav.productPage.service.client.ReviewFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    DetailsFeignClient dfc;

    @Autowired
    ReviewFeignClient rfc;

    public Product getProductDetails() {
        Product product = new Product();
        product.setBooks("The Futuristic");
        Details details = dfc.getDetails();
        Reviews reviews = rfc.getReviews("V3");
        product.setDetails(details);
        product.setReviews(reviews);


        return product;
    }
}


