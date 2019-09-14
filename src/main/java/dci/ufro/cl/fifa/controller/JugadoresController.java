package dci.ufro.cl.fifa.controller;

import dci.ufro.cl.fifa.model.Jugador;
import dci.ufro.cl.fifa.model.Jugadores;
import dci.ufro.cl.fifa.services.ManejoDato;
import dci.ufro.cl.fifa.services.lista.MyLinkedList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//define la clase como un controlador
//direccion que desencadena el controlador
@Controller
@RequestMapping("")
public class JugadoresController {
	private static final String path = "src/main/resources/static/data.csv";

	@RequestMapping("")//direccion que desencadena el metodo
	public String index(Model modelo) {
		ManejoDato md = new ManejoDato();
		Jugadores jg = new Jugadores(md.leerDatos(path));
		modelo.addAttribute("titulo","Ejemplo de index");
		modelo.addAttribute("jugadores",jg.getJugadores());
		modelo.addAttribute("ordenado",true);
		return "jugadores/listado";
		//para lanzar una pagina se agrega la pagina en templates y se escribe la direccion donde enviarla
	}

	@RequestMapping("/listado")
		public String listado(Model modelo){
		if(modelo.containsAttribute("jugadores"))
		{
			return "jugadores/listado";
		}else {
			return "redirect:/";
		}
	}

 /*
	@RequestMapping(value = "/listado", method = RequestMethod.POST)
	public String ordenarRating(Model modelo, @RequestParam("orden") boolean orden){
		ManejoDato md = new ManejoDato();
		Jugadores jg = new Jugadores(md.leerDatos(path));
		if(orden){
			modelo.addAttribute("titulo", "Ejemplo de index");
			modelo.addAttribute("ordenado", false);
			modelo.addAttribute("jugadores", md.ordenarRatingDesc(jg.getJugadores()));
		}else {
			modelo.addAttribute("titulo", "Ejemplo de index");
			modelo.addAttribute("ordenado", true);
			modelo.addAttribute("jugadores", md.ordenarRatingAsce(jg.getJugadores()));

		}
		return listado(modelo);
	}

	/**
	 * 
	 * @param modelo
	 */


	/**
	 * 
	 * @param club
	 * @param modelo
	 */
	@RequestMapping(value= "/club", method = RequestMethod.POST)
	public String listarPorClub(@RequestParam String club, Model modelo) {
		ManejoDato md = new ManejoDato();
		Jugadores jg = new Jugadores(md.leerDatos(path));
		MyLinkedList<Jugador> ml = md.selecClub(jg.getJugadores(),club);
		if(ml.size()>0) {
			System.out.println(md.selecClub(jg.getJugadores(), club).size());
			modelo.addAttribute("jugadores", md.selecClub(jg.getJugadores(), club));
			modelo.addAttribute("ordenado", true);
		}else{
			modelo.addAttribute("ordenado",true);
		}
	    return listado(modelo);
	}
/*
	/**
	 * 
	 * @param potencial
	 * @param modelo
	 */
	@RequestMapping(value = "/potencial", method = RequestMethod.GET)
	public String listarPorPotencial(int potencial, Model modelo) {
		// TODO - implement JugadoresController.listarPorPotencial
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nacionalidad
	 * @param modelo
	 */
	@RequestMapping(value = "/nacionalidad", method = RequestMethod.GET)
	public String listarPorNacionalidad(String nacionalidad, Model modelo) {
		// TODO - implement JugadoresController.listarPorNacionalidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rating
	 * @param modelo
	 */
	@RequestMapping(value = "/rating", method = RequestMethod.GET)
	public String listarPorRating(int rating, Model modelo) {
		// TODO - implement JugadoresController.listarPorRating
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param modelo
	 */
	@RequestMapping(value = "/nombre", method = RequestMethod.GET)
	public void buscarNombre(String nombre, Model modelo) {
		// TODO - implement JugadoresController.buscarNombre
		throw new UnsupportedOperationException();
	}

}