package info.pablogiraldo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import info.pablogiraldo.servicio.BebidaServicio;
import info.pablogiraldo.servicio.BebidaServicioImpl;
import info.pablogiraldo.modelo.Bebida;

@Controller
@RequestMapping("/bar")
public class BebidasControlador {

	@Autowired
	BebidaServicio bs;

	@RequestMapping("/lista")
	public String lista(ModelMap mp) {
		mp.put("lista", bs.getLista());
		return "bar/lista";
	}

	@RequestMapping(value = "/bebida/{i}", method = RequestMethod.GET)
	public String bebida(@PathVariable("i") int i, ModelMap mp) {
		mp.put("bebida", bs.getBebida(i));
		return "bar/bebida";
	}

	@RequestMapping("/listajson")
	@ResponseBody
	public List<Bebida> listaJson(ModelMap mp) {
		return bs.getLista();
	}

	@RequestMapping("/ListaJson")
	public String listaJsonHtml(ModelMap mp) {
		return "bar/ListaJson";
	}

//	@RequestMapping("/json")
//	public String jsonHtml(ModelMap mp) {
//		return "bar/json";
//	}
}
