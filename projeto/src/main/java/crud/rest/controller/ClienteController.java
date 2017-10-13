package crud.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import crud.rest.exception.NegocioException;
import crud.rest.model.Cliente;
import crud.rest.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService service;

	@RequestMapping(value = "/encontrar/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> encontrarClientePorId(@PathVariable Long id) {
		Cliente cliente = null;
		try {
			cliente = service.encontrarPorId(id);
			return new ResponseEntity<Cliente>(cliente, HttpStatus.FOUND);
		} catch (NegocioException e) {
			System.out.println(e.getMensagem());
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}
	}

}
