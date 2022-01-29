package tema1base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EjemploLog {


	 private static final Logger logger = LogManager.getLogger(EjemploLog.class);
	 
       public static void main(String[] args)       
       { 
    	     // Set up a simple configuration that logs on the console.
    	   System.out.println("hola");
           logger.trace("Entrando.");
           logger.info("Estamos creando a Juan");
           Alumno juan = new Alumno();
           if (juan.nota>5) {
               logger.error("No has aprobado.");
           }
           logger.trace("Exiting application.");

		}

		
	}


