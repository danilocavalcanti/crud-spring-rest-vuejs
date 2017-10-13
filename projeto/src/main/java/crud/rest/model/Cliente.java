package crud.rest.model;

import java.io.Serializable;

/**
 * @author danilocavalcanti
 *
 */
//@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 569472607854061825L;

//	@Id
//	@GeneratedValue
	private Long id;
	
//	@Column
	private String nome;
	
	public Cliente(){
		this.id = 0L;
		this.nome = "Teste";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
