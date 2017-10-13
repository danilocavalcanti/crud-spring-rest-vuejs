package crud.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.rest.exception.NegocioException;
import crud.rest.model.Cliente;
import crud.rest.repository.ClienteRepository;

@Service
public class ClienteService {

//	@Autowired
//	ClienteRepository repository;

	public Cliente encontrarPorId(Long id) throws NegocioException {

		if (id == null || id < 0) {
			throw new NegocioException("Id inválido!");
		}

		Cliente cliente = new Cliente();

//		cliente = repository.findById(id);
		
//		if (cliente == null) {
//			throw new NegocioException("Cliente não encontrado!");
//		}
//		
		return cliente;
	}
}