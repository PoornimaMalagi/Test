package com.mav.details.controller;

import com.mav.details.dto.Details;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DetailsController {

    @GetMapping("details")
    public Details getDetails(){
       Details details = new Details();
       details.setAuthor("Narayan Murthy");
       details.setISBN("123456789");
       details.setPageCount("200");
       return details;
    }
}
