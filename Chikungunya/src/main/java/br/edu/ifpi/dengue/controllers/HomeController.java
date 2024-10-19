package br.edu.ifpi.dengue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeController {

    private Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/home")
    public String getHomePage(){
        logger.severe("printando mensagem");
        return "homepage";
    }
}
