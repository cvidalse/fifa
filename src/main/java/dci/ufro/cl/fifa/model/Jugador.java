package dci.ufro.cl.fifa.model;

public class Jugador {

	private String fotografia;
	private String nombre;
	private String nacionalidad;
	private int rating;
	private int edad;
	private String club;



	public Jugador(){}

	/**
	 * 
	 * @param fotografia
	 * @param nombre
	 * @param nacionalidad
	 * @param rating
	 * @param edad
	 * @param club
	 */
	public Jugador(String nombre, String fotografia, String nacionalidad, int rating, int edad, String club) {
		this.nombre = nombre;
		this.fotografia = fotografia;
		this.nacionalidad = nacionalidad;
		this.rating = rating;
		this.edad = edad;
		this.club = club;

	}

	public String toString() {
		// TODO - implement Jugador.toString
		throw new UnsupportedOperationException();
	}

	public String getFotografia() {
		return this.fotografia;
	}

	/**
	 * 
	 * @param fotografia
	 */
	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getRating() {
		return this.rating;
	}

	/**
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getClub() {
		return this.club;
	}

	/**
	 * 
	 * @param club
	 */
	public void setClub(String club) {
		this.club = club;
	}


}