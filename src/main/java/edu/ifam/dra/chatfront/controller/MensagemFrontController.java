package edu.ifam.dra.chatfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.ifam.dra.chatfront.service.MensagemFrontService;

@Controller
public class MensagemFrontController {
	
	@Autowired
	MensagemFrontService mensagemFrontService;

    
    @GetMapping("/mostrarMensagens/{id}")
	public String mostrarMensagens(Model model, @PathVariable String id) {
		
		model.addAttribute("mensagens", mensagemFrontService.getMensagens(id));
		return "listaMensagens";
		
	}
}
