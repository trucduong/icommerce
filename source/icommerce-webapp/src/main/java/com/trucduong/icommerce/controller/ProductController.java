package com.trucduong.icommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public String listProducts(@RequestParam(name="q", required=false, defaultValue="") String query, Model model) {

        return "product-list";
    }

}
