package uce.edu.cloud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	//@Autowired
	//private IEstudianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Estudiante e = this.estudianteService.consultarPorCedula("12345690870");
		//System.out.println(e.getNombre()+" "+e.getApellido());
		System.out.println("Ejecucion Correcta");
		
	}

}
