package br.com.kentec.carros.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.kentec.carros.domain.Carro;

public interface CarroRepository extends CrudRepository<Carro, Long>{

}
