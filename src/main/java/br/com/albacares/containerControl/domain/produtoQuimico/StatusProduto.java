package br.com.albacares.containerControl.domain.produtoQuimico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "status_produto")
public class StatusProduto {
	
	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "situacao")
	@NotEmpty
	@Length(max = 15)
	private String situacaoContrato;

	public StatusProduto(@NotEmpty @Length(max = 15) String situacaoContrato) {
		this.situacaoContrato = situacaoContrato;
	}
	
	
}
