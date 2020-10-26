package myContacts.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import myContacts.models.Contato;
import myContacts.util.ConexaoBD;

public class ContatoDAO {
	EntityManager entity = ConexaoBD.getEntityManagerFactory().createEntityManager();
	public void save(Contato contato) {
		entity.getTransaction().begin();
		entity.persist(contato);
		entity.getTransaction().commit();
	}
	public void edit(Contato contato) {
		entity.getTransaction().begin();
		entity.merge(contato);
		entity.getTransaction().commit();
	}
	public Contato search(int idContato) {
		Contato contato = new Contato();
		contato = entity.find(Contato.class, idContato);
		return contato;
	}
	public void delete (int idContato){
		Contato contato = new Contato();
		contato = entity.find(Contato.class, idContato);
		entity.getTransaction().begin();
		entity.remove(contato);
		entity.getTransaction().commit();
	}
	public List<Contato> searchContacts(){
		List<Contato> listaContatos = new ArrayList<Contato>();
		Query q = entity.createQuery("SELECT contato FROM Contato contato");
		listaContatos = q.getResultList();
		return listaContatos;
	}
	
}
