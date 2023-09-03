package com.toolBox.Model;

import java.util.List;

public class Box {
	
	int id;
	String titulo;
	List<Pagina> paginas;
	
	
	public Box(int id, String titulo, List<Pagina> paginas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.paginas = paginas;
	}


	@Override
	public String toString() {
		return "Box [id=" + id + ", titulo=" + titulo + ", paginas=" + paginas + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public List<Pagina> getPaginas() {
		return paginas;
	}


	public void setPaginas(List<Pagina> paginas) {
		this.paginas = paginas;
	}
	
}
