package models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo_producto")
	private int codigo_producto;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "gama")
	private String gama;
	@Column(name = "dimensiones")
	private String dimensiones;
	@Column(name = "proveedor")
	private String proveedor;
	@Column(name = "descripcion")
	private String descripcion;
	@Column(name = "precio_venta")
	private double precio_venta;
	@Column(name = "precio_proveedor")
	private double precio_proveedor;
	@Column(name = "cantidad_en_stock")
	private int cantidad_en_stock;

	public Producto() {
	}

	public Producto(int codigo, String nombre, String gama, String dimensiones, String proveedor, String descripcion,
			double precioV, double precioP, int cantidad_en_stock) {
		super();
		this.codigo_producto = codigo;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.precio_venta = precioV;
		this.precio_proveedor = precioP;
		this.cantidad_en_stock = cantidad_en_stock;
	}

	public int getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

	public double getPrecio_proveedor() {
		return precio_proveedor;
	}

	public void setPrecio_proveedor(float precio_proveedor) {
		this.precio_proveedor = precio_proveedor;
	}

	public float getCantidad_en_stock() {
		return cantidad_en_stock;
	}

	public void setCantidad_en_stock(int cantidad_en_stock) {
		this.cantidad_en_stock = cantidad_en_stock;
	}

	@Override
	public String toString() {
		return "Producto=" + codigo_producto + ", nombre=" + nombre + ", gama=" + gama + ", dimensiones=" + dimensiones
				+ ", proveedor=" + proveedor + ", descripcion=" + descripcion + ", precio_venta=" + precio_venta
				+ ", precio_proveedor=" + precio_proveedor + ", cantidad_en_stock=" + cantidad_en_stock;
	}

}