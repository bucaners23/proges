package LUAD;

public class DataUsu {
	int IdUsuario;
	String nombre;
	String contraseña;
	Usuario dc = new Usuario();

	public DataUsu() {
	}

	public DataUsu(int idUsuario, String nombre, String contraseña) {
		super();
		IdUsuario = idUsuario;
		this.nombre = nombre;
		this.contraseña = contraseña;
	}

	public boolean insertar() {
		if (dc.insertar(this)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean login() {
		if (dc.login(this)) {
			return true;
		} else {
			return false;
		}
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
