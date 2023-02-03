package es.ufv.dis.final2022.back.AOB;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@RestController
public class Controlador {
    public ArrayList<DatosProducto> productos = new ArrayList<>();

    @GetMapping(path = "/DatosProducto")
    public ResponseEntity datosProducto() throws FileNotFoundException {
        LectorJSON Leer = new LectorJSON();
        productos = Leer.LectorJSON();
        for (int i = 0; i < productos.size(); i++) {
            productos.get(i).setEan(i + 1);
        }
        return new ResponseEntity<>(this.productos, HttpStatus.OK);
    }

    @PostMapping(path = "/DatosProducto",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity nuevoDato(@RequestBody DatosProducto nuevoDato) {
        nuevoDato.setEan(productos.size() + 1);
        productos.add(nuevoDato);
        return new ResponseEntity<>(this.productos, HttpStatus.OK);
    }
}