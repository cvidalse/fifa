package dci.ufro.cl.fifa.controller;

import dci.ufro.cl.fifa.model.Jugadores;
import dci.ufro.cl.fifa.services.ManejoDato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/{nombre}/estadisticas")
public class JugadorController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String mostrarJugador(@PathVariable String nombre, Model modelo) {
		ManejoDato md = new ManejoDato();
		Jugadores jg = new Jugadores(md.leerDatos("C:\\Users\\criz_\\Desktop\\Estructura\\fifa\\src\\main\\resources\\static\\data.csv"));
		modelo.addAttribute("jugador", md.selecNombre(jg.getJugadores(),nombre));
		return "jugador/jugador";
	}



}