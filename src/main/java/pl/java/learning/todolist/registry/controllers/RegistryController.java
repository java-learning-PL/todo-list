package pl.java.learning.todolist.registry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.rmi.registry.Registry;

public class RegistryController {

    @Controller
    public class GreetingController {

        @GetMapping("/registry")
        public String greetingForm(Model model) {
            model.addAttribute("registry", new RegistryController());
            return "register";
        }

        @PostMapping("/registry")
        public String greetingSubmit(@ModelAttribute Registry registry) {
            return "result";
        }

    }
}
