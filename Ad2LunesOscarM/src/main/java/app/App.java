package app;

import java.util.Scanner;

import conexion.HibernateUtils;

import dao.ClienteDao;
import dao.ProductoDao;
import models.Cliente;
import models.Producto;

public class App {

	private static Scanner sc = new Scanner(System.in);
	private static HibernateUtils hu = HibernateUtils.setUp();
	private static ClienteDao cd = new ClienteDao(hu);
	private static ProductoDao pd = new ProductoDao(hu);

	public static void main(String[] args) {
		
			System.out.println("1.Agregar cliente");
			System.out.println("2.Mostrar clientes");
			System.out.println("3.Mostrar cliente");
			System.out.println("4.Editar cliente");
			
			
			System.out.println("Añadiendo cliente");
			addClient();
				
			System.out.println("Viendo clientes");
            showClients();
			
            System.out.println("Viendo Cliente");
		    showClient();
			
		    System.out.println("Editando Cliente");
		    editClient();
				
			
		
	}

	private static void addClient() {
		sc.nextLine();

		System.out.println("Codigo cliente");
		int codigo_cliente = sc.nextInt();
		sc.nextLine();

		System.out.println("Introduzca el nombre del cliente, por favor");
		String nombre = sc.nextLine();
		System.out.println("Introduce el nombre de contacto, por favor");
		String nombreContacto = sc.nextLine();
		System.out.println("Introduce el apellido del contacto, por favor");
		String apellidoContacto = sc.nextLine();
		System.out.println("Introduce el telefono, porfavor");
		String telefono = sc.nextLine();
		System.out.println("Introduce el fax, por favor");
		String fax = sc.nextLine();
		System.out.println("Introduce la direccion principal , por favor");
		String direccion1 = sc.nextLine();
		System.out.println("Introduce la direccion secundario, porfavor ");
		String direccion2 = sc.nextLine();
		System.out.println("Introduce la ciudad, por favor");
		String ciudad = sc.nextLine();
		System.out.println("Introduce el pais, por favor");
		String pais = sc.nextLine();
		System.out.println("Introduce la region, por favor");
		String region = sc.nextLine();
		System.out.println("Intrduce el codigo postal , por favor");
		String codPostal = sc.nextLine();
		System.out.println("Introduce el codigo del empleado, por favor");
		int codEmple = sc.nextInt();
		System.out.println("Introduce un limite de credito, por favor");
		float limite = sc.nextInt();

		cd.save(new Cliente(codigo_cliente, nombre, nombreContacto, apellidoContacto, telefono, fax, direccion1,
				direccion2, ciudad, pais, region, codPostal, codEmple, limite));
	}

	private static void showClients() {
		for (Cliente c : cd.getAll()) {
			System.out.println(c.toString());
		}
	}

	private static void showClient() {
		System.out.println("Codigo cliente");
		System.out.println(cd.get(sc.nextInt()).toString());
	}

	private static void editClient() {
		System.out.println("Codigo cliente a editar");
		Cliente c = cd.get(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Introduzca el nombre del cliente, por favor");
		c.setNombre_cliente(sc.nextLine());
		System.out.println("Introduce el nombre de contacto, por favor");
		c.setNombre_contacto(sc.nextLine());
		System.out.println("Introduce el apellido del contacto, por favor");
		c.setApellido_contacto(sc.nextLine());
		System.out.println("Introduce el telefono, porfavor");
		c.setTelefono(sc.nextLine());
		System.out.println("Introduce el fax, por favor");
		c.setFax(sc.nextLine());
		System.out.println("Introduce la direccion principal , por favor");
		c.setLinea_direccion1(sc.nextLine());
		System.out.println("Introduce la direccion secundario, porfavor ");
		c.setLinea_direccion2(sc.nextLine());
		System.out.println("Introduce la ciudad, por favor");
		c.setCiudad(sc.nextLine());
		System.out.println("Introduce el pais, por favor");
		c.setPais(sc.nextLine());
		System.out.println("Introduce la region, por favor");
		c.setRegion(sc.nextLine());
		System.out.println("Intrduce el codigo postal , por favor");
		c.setCodigo_postal(sc.nextLine());
		System.out.println("Introduce el codigo del empleado, por favor");
		c.setCodigo_empleado_rep_ventas(sc.nextInt());
		System.out.println("Introduce un limite de credito, por favor");
		c.setLimite_credito(sc.nextInt());
		
		cd.update(c);
		
		
	}
}
