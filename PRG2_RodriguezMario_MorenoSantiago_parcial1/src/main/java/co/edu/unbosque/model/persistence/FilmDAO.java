package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.FilmDTO;

public class FilmDAO implements CRUDOperation<FilmDTO> {

	private ArrayList<FilmDTO> filmList;

	public FilmDAO() {
		filmList = new ArrayList<>();
	}

	@Override
	public void crear(FilmDTO newData) {
		if (find(newData) == null) {
			filmList.add(newData);
		}
	}

	@Override
	public void eliminar(FilmDTO toDelete) {

		FilmDTO found = find(toDelete);
		if (found != null) {
			filmList.remove(found);
		}

	}

	@Override
	public void update(FilmDTO previous, FilmDTO newData) {

		FilmDTO found = find(previous);

		if (previous != null) {

		}

	}

	@Override
	public ArrayList<FilmDTO> getAll() {
		return filmList;
	}

	@Override
	public FilmDTO find(FilmDTO toFind) {

		FilmDTO found = null;

		if (!filmList.isEmpty()) {

			for (FilmDTO f : filmList) {

				if (f.getId().equals(toFind.getId())) {
					found = f;
					return found;
				}

			}

		}

		return null;

	}

}
