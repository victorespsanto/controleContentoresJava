package br.com.albacares.containerControl.domain.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "perfil_usuario")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PerfilUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer id;
	
	@NotEmpty
	private String perfil;

	public PerfilUsuario(@NotEmpty String perfil) {		
		this.perfil = perfil;
	}
	
	
}
