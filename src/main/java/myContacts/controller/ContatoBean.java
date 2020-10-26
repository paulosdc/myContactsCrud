package myContacts.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import myContacts.dao.ContatoDAO;
import myContacts.models.Contato;

@ManagedBean (name="contatoBean")
@RequestScoped
public class ContatoBean {
	public List<Contato> searchContacts(){
		ContatoDAO contatoDAO = new ContatoDAO();
		return contatoDAO.searchContacts();
	}
	public String edit(int id) {
		ContatoDAO contatoDAO = new ContatoDAO();
		Contato contato = new Contato();
		contato = contatoDAO.search(id);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("contato", contato);
		return "/faces/edit.xhtml";
	}
	public String update(Contato contato) {
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.edit(contato);
		return "/faces/index.xhtml";
	}
	public String delete(int id) {
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.delete(id);
		return "/faces/index.xhtml";
	}
	public String add() {
		Contato contato = new Contato();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("contato", contato);
		return "/faces/add.xhtml";
	}
	public String save(Contato contato) {
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.save(contato);
		return "/faces/index.xhtml";
	}
}
