package info.pablogiraldo.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class MiControlador {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "")
	public String hola(ModelMap mp) {
		mp.put("textoHola", "Hola Mundo");
		log.debug("Desde hola()");
		return "HolaMundo";
	}

	@RequestMapping(value = "adios")
	public String adios(ModelMap mp) {
		mp.put("textoAdios", "Adios Mundo");
		return "AdiosMundo";
	}
}
