package br.edu.ifpi.dengue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class NotificarController {

    private Logger logger = Logger.getLogger(NotificarController.class.getName());

    @GetMapping("/notificar")
    public String getHomePage(){
        logger.severe("printando mensagem");
        return "notificar";
    }
}
