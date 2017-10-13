package crud.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import crud.rest.model.Cliente;

//@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
	Cliente findById(Long id);

}
