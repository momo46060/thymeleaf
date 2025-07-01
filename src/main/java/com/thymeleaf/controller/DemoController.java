package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

     @GetMapping("/hello")
     public String demoPage(Model model) {
         model.addAttribute( "TheDate",new java.util.Date());
         return "index"; // This will resolve to src/main/resources/templates/demo.html
     }
}
