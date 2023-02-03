package es.ufv.dis.final2022.back.AOB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@SpringBootApplication
public class AobApplication {

	public static void main(String[] args) throws FileNotFoundException {

		LectorJSON lectorJSON = new LectorJSON();
		ArrayList<DatosProducto> datosProductos = lectorJSON.LectorJSON();
		for (DatosProducto datosProducto : datosProductos) {
			System.out.println(datosProducto);
		}
		SpringApplication.run(AobApplication.class, args);
	}

}
