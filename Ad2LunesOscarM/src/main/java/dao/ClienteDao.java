package dao;

import java.util.List;

import org.hibernate.query.Query;

import conexion.HibernateUtils;
import models.Cliente;

public class ClienteDao implements DAO<Cliente> {

	private HibernateUtils hu;

	public ClienteDao(HibernateUtils hu) {
		this.hu = hu;
	}

	public List<Cliente> getAll() {
		Query<Cliente> query = hu.getSession().createQuery("SELECT c from Cliente c", Cliente.class);
		List<Cliente> clientes = query.getResultList();
		return clientes;
	}

	public void save(Cliente c) {
		hu.getSession().save(c);
	}

	public Cliente get(int id) {
		Cliente cliente = hu.getSession().get(Cliente.class, id);
		return cliente;
	}

	public void update(Cliente t) {
		hu.getSession().update(t);	
	}
}