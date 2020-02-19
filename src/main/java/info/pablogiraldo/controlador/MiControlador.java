package info.pablogiraldo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class MiControlador {

	@RequestMapping(value = "")
	public String hola(ModelMap mp) {
		mp.put("textoHola", "Hola Mundo");
		return "HolaMundo";
	}

	@RequestMapping(value = "adios")
	public String adios(ModelMap mp) {
		mp.put("textoAdios", "Adios Mundo");
		return "AdiosMundo";
	}
}
