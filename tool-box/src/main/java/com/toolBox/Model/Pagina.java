package com.toolBox.Model;

public class Pagina {
	
	int id;
	String titulo;
	String url;
	
	
	public Pagina(int id, String titulo, String url) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.url = url;
	}


	@Override
	public String toString() {
		return "Pagina [id=" + id + ", titulo=" + titulo + ", url=" + url + "]";
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


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
}
