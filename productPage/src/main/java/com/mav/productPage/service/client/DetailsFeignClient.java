package com.mav.productPage.service.client;

import com.mav.productPage.pojo.Details;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("details")
public interface DetailsFeignClient {

    @GetMapping("details")
    public Details getDetails();
}


