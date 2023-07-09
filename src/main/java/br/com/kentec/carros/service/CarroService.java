package br.com.kentec.carros.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.kentec.carros.domain.Carro;
import br.com.kentec.carros.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository rep;
	
	public Iterable<Carro> getCarros(){
		return rep.findAll();
	}
	
	public Optional<Carro> getCarroById(Long id){
		return rep.findById(id);
	}
}
