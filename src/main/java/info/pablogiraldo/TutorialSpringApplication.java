package info.pablogiraldo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TutorialSpringApplication {

	public static void main(String[] args) {
//		private static final Logger logger = LoggerFactory.getLogger(TutorialSpringApplication.class);
		final Logger log = LoggerFactory.getLogger(TutorialSpringApplication.class);

		log.info("prueba info");
		log.warn("prueba warn");
		log.error("prueba error");
		log.debug("prueba debug");

		SpringApplication.run(TutorialSpringApplication.class, args);

	}

}
