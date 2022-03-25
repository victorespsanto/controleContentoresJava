package br.com.albacares.containerControl.domain.tanque;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
@Table(name = "tanque_volume")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CapacidadeTanque implements Serializable {
	
	@EqualsAndHashCode.Include  // inclui como atributo que terá os métodos hashCode e equals
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull	
	private Integer volume;

	public CapacidadeTanque(@NotNull Integer volume) {		
		this.volume = volume;
	}
	
	
	
	

}
