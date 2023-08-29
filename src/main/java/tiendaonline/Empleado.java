package tiendaonline;

public class Empleado extends Usuario{

	private int idEmleado;
	private int numeroEmpleado;
	private int diaDescanso;
	private Rol rol;
	private String contrasenia;
	
	
	public Rol getRol() {
		return rol;
	}
	
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	/**
	 * @return the numeroEmpleado
	 */
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	/**
	 * @param numeroEmpleado the numeroEmpleado to set
	 */
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	/**
	 * @return the diaDescanso
	 */
	public int getDiaDescanso() {
		return diaDescanso;
	}
	/**
	 * @param diaDescanso the diaDescanso to set
	 */
	public void setDiaDescanso(int diaDescanso) {
		this.diaDescanso = diaDescanso;
	}

	/**
	 * @return the idEmleado
	 */
	public int getIdEmleado() {
		return idEmleado;
	}

	/**
	 * @param idEmleado the idEmleado to set
	 */
	public void setIdEmleado(int idEmleado) {
		this.idEmleado = idEmleado;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
	
}
