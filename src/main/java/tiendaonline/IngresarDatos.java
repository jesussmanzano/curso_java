package tiendaonline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tngtech.archunit.core.domain.properties.CanBeAnnotated.Utils;

public class IngresarDatos {
	
	public static void main(String[] args) {
		
		Departamento departamento1 = new Departamento();
		departamento1.setId(1);
		departamento1.setNombreDepartamento("Abarrotes");
		
		Departamento departamento2 = new Departamento();
		departamento2.setId(2);
		departamento2.setNombreDepartamento("Lacteos");
		
		Departamento departamento3 = new Departamento();
		departamento3.setId(3);
		departamento3.setNombreDepartamento("Articulos de limpieza");
		
		Departamento departamento4 = new Departamento();
		departamento4.setId(4);
		departamento4.setNombreDepartamento("Embutidos");
		
		Departamento departamento5 = new Departamento();
		departamento5.setId(5);
		departamento5.setNombreDepartamento("Linea Blanca");
		
		List<Departamento> departamento = new ArrayList();
		departamento.add(departamento1);
		departamento.add(departamento2);
		departamento.add(departamento3);
		departamento.add(departamento4);
		departamento.add(departamento5);
		
		
		
		
		
		
		
		Producto producto1 = new Producto();
		producto1.setIdProducto(1);
		producto1.setNombreProducto("Stila");
		producto1.setCantidadExistencia(13);
		producto1.setMarca("Quaker");
		producto1.setPrecio(15);
		producto1.setDescripcion("Barritas de avena");
		producto1.setDepartamento(departamento1);
		
		Producto producto2 = new Producto();
		producto2.setIdProducto(2);
		producto2.setNombreProducto("Salvo");
		producto2.setCantidadExistencia(15);
		producto2.setMarca("Salvo");
		producto2.setPrecio(30);
		producto2.setDescripcion("Lava platos");
		producto2.setDepartamento(departamento3);
		
		Producto producto3 = new Producto();
		producto3.setIdProducto(3);
		producto3.setNombreProducto("Salch");
		producto3.setCantidadExistencia(14);
		producto3.setMarca("Nutri");
		producto3.setPrecio(25);
		producto3.setDescripcion("Enbutidos");
		producto3.setDepartamento(departamento4);
		
		Producto producto4 = new Producto();
		producto4.setIdProducto(4);
		producto4.setNombreProducto("Papel");
		producto4.setCantidadExistencia(20);
		producto4.setMarca("Petalo");
		producto4.setPrecio(30);
		producto4.setDescripcion("papel higienico");
		producto4.setDepartamento(departamento1);
		
		
		List<Producto> inventarioProductos = new ArrayList<>();
		inventarioProductos.add(producto1); //0
		inventarioProductos.add(producto2); //1
		inventarioProductos.add(producto3); //2
		inventarioProductos.add(producto4); //3
		
		
		
		
		
		
		
		Rol administrador = new Rol();
		administrador.setIdRol(1);
		administrador.setNombreRol("Administrador");
		
		
		Rol repartidor = new Rol();
		repartidor.setIdRol(2);
		repartidor.setNombreRol("Repartidor");
		
		Rol cliente = new Rol();
		cliente.setIdRol(3);
		cliente.setNombreRol("Cliente");
		
		List<Rol> rol = new ArrayList<>();
		rol.add(administrador);
		rol.add(repartidor);
		rol.add(cliente);
		
		
		
		
		
		
		Empleado empleado1 = new Empleado();
		empleado1.setIdEmleado(1);
		empleado1.setNombre("Cristal");
		empleado1.setApellidoPaterno("Zavala");
		empleado1.setApellidoMaterno("Lorenzo");
		empleado1.setEdad(30);
		empleado1.setDireccion("Avenida abasolo #18");
		empleado1.setTelefono("951290814");
		empleado1.setIne("MNS34F4DW3D3");
		empleado1.setNumeroEmpleado(2020);
		empleado1.setRol(administrador);
		empleado1.setDiaDescanso(7);
		empleado1.setContrasenia("Cristal123");
		
		Empleado empleado2 = new Empleado();
		empleado2.setIdEmleado(2);
		empleado2.setNombre("Cristina");
		empleado2.setApellidoPaterno("Aquino");
		empleado2.setApellidoMaterno("Arce");
		empleado2.setEdad(29);
		empleado2.setDireccion("Avenida Juarez #23");
		empleado2.setTelefono("984762632");
		empleado2.setIne("MSU44KDJ3");
		empleado2.setNumeroEmpleado(3092);
		empleado2.setRol(repartidor);
		empleado2.setDiaDescanso(7);
		empleado2.setContrasenia("Cristina123");
		
		Empleado empleado3 = new Empleado();
		empleado3.setIdEmleado(3);
		empleado3.setNombre("Mariana");
		empleado3.setApellidoPaterno("Perez");
		empleado3.setApellidoMaterno("Arce");
		empleado3.setEdad(29);
		empleado3.setDireccion("Avenida Hidalgo #23");
		empleado3.setTelefono("23124334");
		empleado3.setIne("MARIANA3");
		empleado3.setNumeroEmpleado(5342);
		empleado3.setRol(repartidor);
		empleado3.setDiaDescanso(7);
		empleado3.setContrasenia("Cristina123");
		
		
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		
		
		Usuario cliente1 = new Usuario();
		cliente1.setIdUsuario(1);
		cliente1.setNombre("Paola");
		cliente1.setApellidoPaterno("Juarez");
		cliente1.setApellidoMaterno("Hernandez");
		cliente1.setEdad(25);
		cliente1.setDireccion("Avenida Insurgentes");
		cliente1.setTelefono("98374622");
		cliente1.setIne("JDH439DH4HW");
		
		Usuario cliente2 = new Usuario();
		cliente2.setIdUsuario(2);
		cliente2.setNombre("Adair");
		cliente2.setApellidoPaterno("Juarez");
		cliente2.setApellidoMaterno("Martinez");
		cliente2.setEdad(24);
		cliente2.setDireccion("Avenida Martir");
		cliente2.setTelefono("927368234");
		cliente2.setIne("NSJW283HDJ3");
		
		
		List<Usuario> usuario = new ArrayList<>();
		usuario.add(cliente1);
		usuario.add(cliente2);
		
	    List<Producto> carrito = new ArrayList<>();
	    
	    List<Integer> listInteger = new ArrayList<Integer>();
	    listInteger.add(10);
	    listInteger.add(20);
	    listInteger.add(30);
	    listInteger.add(40);
	    listInteger.add(50);
	    listInteger.add(60);
	    
	    Integer value = 10;
	    
	    listInteger.remove(value);
	    
	 
		String user, contrasenia ;
		int seleccionado;
		int idSeleccionado = 0 ;
		int opcion = 0;
		boolean loginExitoso = false;
		
		
		Scanner myScanner = new Scanner(System.in);
		do {
			System.out.println("Ingrese la opcion deseada:");
			System.out.println("1)Agregar productos al carrito");
			System.out.println("2)Login");
			if(!carrito.isEmpty()) {
				System.out.println("3)Eliminar");				
			}
			System.out.println("4)Informacion de producto");
			
			
			
			opcion = myScanner.nextInt();
			
		
			
			switch(opcion) {
			case 1:
				
				System.out.println("Opcion\tProducto\tPrecio\t\tInventario");
				for(Producto p: inventarioProductos) {
					System.out.println(p.getIdProducto() + ")\t" + p.getNombreProducto()  + "\t\t"+ p.getPrecio() + "\t\t"+ p.getCantidadExistencia());
				}
				
				
				Producto producto = new Producto();
				
				System.out.println("Seleccione un producto");
				idSeleccionado = myScanner.nextInt();
				
				for(Producto p: inventarioProductos) {
					if(p.getIdProducto() == idSeleccionado) {
						producto = p;
						producto.setCantidadExistencia(0);
						carrito.add(producto);	
						
					}	
				}
				 
				System.out.println("Ingrese la cantidad deseada");
				int cantidad = myScanner.nextInt();
				
				for(Producto p: carrito) {
					if(p.getIdProducto() == idSeleccionado) {
						System.out.println("Cantidad actual:" + p.getCantidadExistencia());
						p.setCantidadExistencia(cantidad);
					}
				}
				
				
				System.out.println("Estos son los productos seleccionados en el carrito");
				System.out.println("Codigo\tProducto\tPrecio\tCantidad");
				for(Producto p: carrito) {
					System.out.println(p.getIdProducto() + "\t" + p.getNombreProducto() +"\t" + p.getPrecio() + "\t"+ p.getCantidadExistencia());
					
				}
				
				
				break;
			case 2:
				System.out.println("Ingresa el nombre de usuario:");
				user = myScanner.next();
				System.out.println("Ingrese la contraseña");
				contrasenia = myScanner.next();
				for(Empleado e: empleados) {
					if(user.equals(e.getTelefono()) && contrasenia.equals(e.getContrasenia())) {
						loginExitoso = true;
					}
					
				}
				
				if(loginExitoso) {
					System.out.println("Bienvenido: " + user);
				}
				else {
					System.out.println("Favor de validar las credenciales");
				}
				
				
				break;
				
			case 3:
				System.out.println("Eliminar");
				for(Producto p: carrito) {	
				}
				System.out.println("Estos son los productos que actualmente se encuentran en el carrito");
				System.out.println("ID\tProducto\t\tMarca\t\tPrecio\tDepartamento\t\tDetalles");
				for(Producto p: carrito) {
					System.out.println(p.getIdProducto() + ")\t"+ p.getNombreProducto() + "\t\t" + p.getMarca()  +"\t\t" + p.getPrecio() + "\t"+ p.getDepartamento().getNombreDepartamento() + "\t\t" + p.getDescripcion());
					
				}
				
				System.out.println("Seleccione el producto que decee eliminar");
				idSeleccionado = myScanner.nextInt();
				/*
				for(int i = 0; i<carrito.size();i++) {
					if(carrito.get(i).getIdProducto() == idSeleccionado) {
						carrito.remove(carrito.get(i));
					}
				}
				*/

				Producto test = new Producto();	
			
				for(Producto p: carrito) {
					if(p.getIdProducto() == idSeleccionado) {
						test = p;
					}
				}
				carrito.remove(test);
				
				
				
				break;
				
			case 4:
				
				Producto productoImpresionDetalles = null;
				
				System.out.println("Opcion\tProducto\tPrecio\t\tInventario");
				for(Producto p: inventarioProductos) {
					System.out.println(p.getIdProducto() + ")\t" + p.getNombreProducto()  + "\t\t"+ p.getPrecio() + "\t\t"+ p.getCantidadExistencia());
				}
				
				System.out.println("Seleccione el producto del que decee maa informacion");
				idSeleccionado = myScanner.nextInt();
				System.out.println("Opcion\tProducto\tPrecio\t\tInventario\t\tMarca\t\tDepartamento\t\tDescripcion");
				for(Producto p: inventarioProductos) {
					if(p.getIdProducto() == idSeleccionado) {
						productoImpresionDetalles = p;
					}	
				}
				
				
				System.out.println(productoImpresionDetalles.getIdProducto() + ")\t" + productoImpresionDetalles.getNombreProducto()
				+ "\t\t"+ productoImpresionDetalles.getPrecio() + "\t\t"+ productoImpresionDetalles.getCantidadExistencia() 
				+ "\t\t"+ productoImpresionDetalles.getMarca() + "\t\t"+ productoImpresionDetalles.getDepartamento().getNombreDepartamento() 
				+ "\t\t"+ productoImpresionDetalles.getDescripcion());	
					
				
				
			    break;
			
			}
			
		
				
			
		}while (opcion != 20);
		
		
	}//Termina la funcion main
	
	public static void imprimirProductos(List<Producto> productos){
		System.out.println("Opcion\tProducto\t\tMarca\t\tPrecio\tDepartamento\t\tDetalles");
		for(Producto p: productos) {
			System.out.println(p.getIdProducto() + ")\t" + p.getNombreProducto() + "\t\t" + p.getMarca()  +"\t\t" + p.getPrecio() + "\t"+ p.getDepartamento().getNombreDepartamento() + "\t\t" + p.getDescripcion());
		}
		
	}
}//Termina la clase