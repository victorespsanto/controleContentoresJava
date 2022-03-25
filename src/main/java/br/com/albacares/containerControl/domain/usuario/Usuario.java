package br.com.albacares.containerControl.domain.usuario;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer id;
	
	@Size(max = 30)
	@NotEmpty
	private String nome;
	
	@Size(min = 4, max = 4)
	@NotEmpty
	private String chave;	
	
	@NotEmpty
	@NotNull
	private String senha;
	
	@NotNull
	@ManyToOne
	private PerfilUsuario perfilUsuario;

}
