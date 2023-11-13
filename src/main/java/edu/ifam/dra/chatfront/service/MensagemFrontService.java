package edu.ifam.dra.chatfront.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.ifam.dra.chatfront.model.Contato;
import edu.ifam.dra.chatfront.model.Mensagem;

@Service
public class MensagemFrontService {
	
	private final String url = "http://localhost:8080/mensagem"; 

	public List<Mensagem> getMensagens(String id){
		String mensagemUrl = url + '/' + id;
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Mensagem[]> response =  restTemplate.getForEntity(
				mensagemUrl , Mensagem[].class);
		return new ArrayList<Mensagem>(Arrays.asList(response.getBody()));
	}
	
}
