package tema3;



import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;

public class EjemploLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = (Logger) LoggerFactory.getLogger(EjemploLog.class);
		
		log.trace("esto es una traza");
		log.debug("Mensaje de depuracion");
		log.info("Mensaje de informacion: ej. usuario logado");
		log.warn("Mensaje de advertencia, ej recursos cerca de limite");
		log.error("Mensaje de error, ha pasado algo grave");
	}

}
