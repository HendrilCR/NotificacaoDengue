package br.edu.ifpi.dengue.controllers;

import br.edu.ifpi.dengue.models.Notificacao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/notificacao")
public class NotificacaoController{
    private List<Notificacao> notificacoes = new ArrayList<>();
    private Logger logger = Logger.getLogger(NotificacaoController.class.getName());

    @PostMapping("/save")
    public String cadastrar(@ModelAttribute Notificacao notificacao) {
        notificacoes.add(notificacao);

        return "redirect:/home";
        //return null
    }
}
