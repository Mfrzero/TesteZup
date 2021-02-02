package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DadosController implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/inserir.html");
	}

	@Autowired
	private DadosRepository repository;

	@PostMapping("/dados")
	@ResponseStatus(value = HttpStatus.CREATED)
	public DadosTable criar(@RequestBody DadosTable objetoManutencao) {
		repository.save(objetoManutencao);
		return objetoManutencao;
	}
	
}
