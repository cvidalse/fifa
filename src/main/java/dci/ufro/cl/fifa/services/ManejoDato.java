package dci.ufro.cl.fifa.services;


import dci.ufro.cl.fifa.model.Jugador;
import dci.ufro.cl.fifa.services.lista.MyLinkedList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ManejoDato {

	/**
	 * 
	 * @param path
	 */
	public MyLinkedList<Jugador> leerDatos(String path) {
		MyLinkedList<Jugador> jugadores= new MyLinkedList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			int i = 0;
			while ((line = br.readLine()) != null && i<100) {
				if (i > 1) {
					String[] values = line.split(",");
					System.out.println(values.length);
					jugadores.add(new Jugador(values[2],values[4],values[5],Integer.parseInt(values[7]),Integer.parseInt(values[3]),values[9]));
				}
				i++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jugadores;
	}
		/**
	 * 
	 * @param jugadores
	 * @param nacionalidad
	 */
	public List<Jugador> selecNacionalidad(List<Jugador> jugadores, String nacionalidad) {
		// TODO - implement ManejoDato.selecNacionalidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param edad
	 */
	public List<Jugador> selecEdad(List<Jugador> jugadores, int edad) {
		// TODO - implement ManejoDato.selecEdad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param club
	 */
	public MyLinkedList<Jugador> selecClub(MyLinkedList<Jugador> jugadores, String club) {
		MyLinkedList<Jugador> jugadoresclub = new MyLinkedList();
		for(int i = 0;i<jugadores.size();i++){
			System.out.println(jugadores.get(i).getNombre());
			if(club.equals(jugadores.get(i).getClub())){
				jugadoresclub.add(jugadores.get(i));
			}
		}
		return jugadoresclub;
	}

	/**
	 * 
	 * @param jugadores
	 * @param ranting
	 */
	public List<Jugador> selecRating(List<Jugador> jugadores, int ranting) {
		// TODO - implement ManejoDato.selecRating
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param potencial
	 */
	public List<Jugador> selecPotencial(List<Jugador> jugadores, int potencial) {
		// TODO - implement ManejoDato.selecPotencial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jugadores
	 * @param nombre
	 */
	public Jugador selecNombre(MyLinkedList<Jugador> jugadores, String nombre) {
		Jugador jug = new Jugador();
		for(int i = 0;i<jugadores.size();i++){
			if(nombre.equals(jugadores.get(i).getNombre())){
				jug = jugadores.get(i);
			}
		}
		return jug;
	}
/*
	public List<Jugador> ordenarRatingDesc(List<Jugador> jugadores){
			int n = jugadores.size();

			// One by one move boundary of unsorted subarray
			for (int i = 0; i < n-1; i++) {
				// Find the minimum element in unsorted array
				int min_idx = i;
				for (int j = i + 1; j < n; j++)
					if (jugadores.get(j).getRating() > jugadores.get(min_idx).getRating())
						min_idx = j;

				// Swap the found minimum element with the first
				// element
				Jugador temp = jugadores.get(min_idx);
				jugadores.set(min_idx, jugadores.get(i));
				jugadores.set(i, temp);
			}
			return jugadores;
	}

	public List<Jugador> ordenarRatingAsce(List<Jugador> jugadores){
		int n = jugadores.size();

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (jugadores.get(j).getRating() < jugadores.get(min_idx).getRating())
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			Jugador temp = jugadores.get(min_idx);
			jugadores.set(min_idx, jugadores.get(i));
			jugadores.set(i, temp);
		}
		return jugadores;
	}
*/
}