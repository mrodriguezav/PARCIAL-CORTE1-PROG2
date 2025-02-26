package co.edu.unbosque.model;

public class Film {

	private String id;
	private String nombre;
	private String genero;
	private String productora;
	private String año;
	private String urlImagen;

	public Film(String id, String nombre, String genero, String productora, String año, String urlImagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.productora = productora;
		this.año = año;
		this.urlImagen = urlImagen;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

}
