package tiendaonline;

import java.util.Objects;

public class Producto{
	
	private int idProducto;
	private String nombreProducto;
	private String marca;
	private int cantidadExistencia;
	private String descripcion;
	private int precio;
	private Departamento departamento;
	
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca =marca;
	}
	
	
	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}
	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	/**
	 * @return the cantidadExistencia
	 */
	public int getCantidadExistencia() {
		return cantidadExistencia;
	}
	/**
	 * @param cantidadExistencia the cantidadExistencia to set
	 */
	public void setCantidadExistencia(int cantidadExistencia) {
		this.cantidadExistencia = cantidadExistencia;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", marca=" + marca
				+ ", cantidadExistencia=" + cantidadExistencia + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", departamento=" + departamento + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidadExistencia, departamento, descripcion, idProducto, marca, nombreProducto, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cantidadExistencia == other.cantidadExistencia && Objects.equals(departamento, other.departamento)
				&& Objects.equals(descripcion, other.descripcion) && idProducto == other.idProducto
				&& Objects.equals(marca, other.marca) && Objects.equals(nombreProducto, other.nombreProducto)
				&& precio == other.precio;
	}
	
	
	
	


	

}
