package dao;

import java.util.List;

import org.hibernate.query.Query;

import models.Producto;
import conexion.HibernateUtils;

public class ProductoDao implements DAO<Producto> {

	private HibernateUtils hu;

	public ProductoDao(HibernateUtils hu) {
		this.hu = hu;
	}

	public List<Producto> getAll() {
		return null;
	}

	public void save(Producto t) {
		// TODO Auto-generated method stub

	}

	public Producto get(int id) {
		return null;
	}

	public void update(Producto t) {
		// TODO Auto-generated method stub
		
	}

}