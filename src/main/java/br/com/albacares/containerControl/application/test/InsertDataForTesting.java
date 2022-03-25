package br.com.albacares.containerControl.application.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.albacares.containerControl.domain.produtoQuimico.StatusProduto;
import br.com.albacares.containerControl.domain.produtoQuimico.StatusProdutoRepository;
import br.com.albacares.containerControl.domain.tanque.CapacidadeTanque;
import br.com.albacares.containerControl.domain.tanque.CapacidadeTanqueRepository;
import br.com.albacares.containerControl.domain.tanque.SituacaoTanque;
import br.com.albacares.containerControl.domain.tanque.SituacaoTanqueRepository;
import br.com.albacares.containerControl.domain.usuario.PerfilUsuario;
import br.com.albacares.containerControl.domain.usuario.PerfilUsuarioRepository;


@Component
public class InsertDataForTesting {
	
	@Autowired
	private CapacidadeTanqueRepository capacidadeTanqueRepository;	
	
	@Autowired
	private PerfilUsuarioRepository perfilUsuarioRepository;
	
	@Autowired
	private SituacaoTanqueRepository situacaoTanqueRepository;
	
	@Autowired
	private StatusProdutoRepository statusProdutoRepository;
	
	@EventListener
	public void onApplicationEvent(ContextRefreshedEvent event) {		
		
		CapacidadeTanque vt = new CapacidadeTanque(1000);		
		capacidadeTanqueRepository.save(vt);		
		vt = new CapacidadeTanque(1500);
		capacidadeTanqueRepository.save(vt);		
		vt = new CapacidadeTanque(2000);
		capacidadeTanqueRepository.save(vt);		
		vt = new CapacidadeTanque(5000);
		capacidadeTanqueRepository.save(vt);
		
		PerfilUsuario pu = new PerfilUsuario("Administrador");
		perfilUsuarioRepository.save(pu);		
		pu = new PerfilUsuario("Usuário");
		perfilUsuarioRepository.save(pu);
		
		SituacaoTanque st = new SituacaoTanque("cheio");
		situacaoTanqueRepository.save(st);
		st = new SituacaoTanque("vazio");
		situacaoTanqueRepository.save(st);
		st = new SituacaoTanque("transbordo");
		situacaoTanqueRepository.save(st);
		st = new SituacaoTanque("devolvido");
		situacaoTanqueRepository.save(st);
		
		StatusProduto sp = new StatusProduto("ativo");
		statusProdutoRepository.save(sp);
		sp = new StatusProduto("inativo");
		statusProdutoRepository.save(sp);
	}
	

}
