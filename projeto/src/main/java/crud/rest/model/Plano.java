package crud.rest.model;

import java.io.Serializable;

/**
 * @author danilocavalcanti
 *
 */
//@Entity
public class Plano implements Serializable {

	private static final long serialVersionUID = 7160058287105541964L;

//	@Id
//	@GeneratedValue
	private Long id;

//	@Column
	private String nome;

//	@ManyToOne
//	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

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
