package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

public interface CRUDOperation<D> {

	public void crear(D newData);

	public void eliminar(D toDelete);

	public void update(D previous, D newData);

	public ArrayList<D> getAll();

	public D find(D toFind);

}
