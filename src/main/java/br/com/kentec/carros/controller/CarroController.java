package br.com.kentec.carros.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.kentec.carros.domain.Carro;
import br.com.kentec.carros.service.CarroService;

@RestController
@RequestMapping("api/v1/carros")
public class CarroController {
	
	@Autowired
	private CarroService service;
	
	@GetMapping()
	public Iterable<Carro> get(){
		return service.getCarros();
	}
	
	@GetMapping("/{id}")
	public Optional<Carro> get(@PathVariable("id") Long id){
		return service.getCarroById(id);
	}
}   
