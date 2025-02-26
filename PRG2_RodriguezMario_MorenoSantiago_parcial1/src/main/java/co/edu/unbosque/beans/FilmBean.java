package co.edu.unbosque.beans;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.unbosque.model.FilmDTO;
import co.edu.unbosque.model.persistence.FilmDAO;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("FilmBean")
@SessionScoped
public class FilmBean {

	private String id;
	private String nombre;
	private String genero;
	private String productora;
	private String año;
	private String urlImagen;
	private ArrayList<FilmDTO> list;
	private FilmDTO selected;
	private FilmDAO fDao;

	public FilmBean() {

		fDao = new FilmDAO();
		list = fDao.getAll();

	}

	public void save() {

		fDao.crear(new FilmDTO(id, nombre, genero, productora, año, urlImagen));

	}

	public void delete(FilmDTO user) {
		Iterator<FilmDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			FilmDTO usuarioActual = iterator.next();
			if (usuarioActual.equals(user)) {
				iterator.remove();
				break;
			}
		}
	}

	public void cleanFields() {

		this.nombre = "";
		this.genero = "";
		this.productora = "";
		this.año = "";
		this.urlImagen = "";

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

	public ArrayList<FilmDTO> getList() {
		return list;
	}

	public void setList(ArrayList<FilmDTO> list) {
		this.list = list;
	}

	public FilmDTO getSelected() {
		return selected;
	}

	public void setSelected(FilmDTO selected) {
		this.selected = selected;
	}

	public FilmDAO getfDao() {
		return fDao;
	}

	public void setfDao(FilmDAO fDao) {
		this.fDao = fDao;
	}

}
