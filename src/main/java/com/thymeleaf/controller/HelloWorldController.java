package com.thymeleaf.controller;

import com.thymeleaf.model.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/helloform")
    public String showForm(Model model) {
        return "hello-form"; // This will resolve to hello-form.html in the templates directory
    }

    @GetMapping("/processForm")
    public String processForm(String name, Model model) {
        System.out.println("Name: " + name);
        return "hello-world"; // This will resolve to hello-world.html in the templates directory
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request,Model model) {
        System.out.println("Name: " + model);
        String name ="Yo! " + request.getParameter("studentName").toUpperCase();
        model.addAttribute("name", name);
        return "hello-world";
    }

  @RequestMapping("/processFromJava")
    public String processFromJavaObject(Model model) {
        model.addAttribute("employee", new Employee());
        return "student_form";
    }

    @PostMapping("/processFromJavaObject")
    public String processFromJavaObject2(@ModelAttribute("employee") Employee employee,Model model) {
        System.out.println(login(employee.getFirsName(), employee.getLastName())+ employee.getConuntry());
        System.out.println(employee.toString());
        model.addAttribute("status", login(employee.getFirsName(), employee.getLastName()));
        return "studentConfimation";
    }

    private Boolean login(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
