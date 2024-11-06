package br.edu.ifpi.dengue.controllers;

import br.edu.ifpi.dengue.models.Notificacao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HomeController {

    private Logger logger = Logger.getLogger(HomeController.class.getName());

    @GetMapping("/home")
    public String getHomePage(){
        return "homepage";
    }

    @GetMapping("/ajax")
    public String getAjaxPage(){
        return "ajax";
    }

    @GetMapping("/adicionar")
    public String adicionarNotificacao(Model model){
        model.addAttribute("notificacao", new Notificacao());
        return "notificacao-adicionar";
    }
}
