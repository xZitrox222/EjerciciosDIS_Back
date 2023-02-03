package es.ufv.dis.final2022.back.AOB;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.itextpdf.text.DocumentException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class LectorJSON {

    ArrayList<DatosProducto> listaProductos;
    public LectorJSON() throws FileNotFoundException {
        this.listaProductos = LectorJSON();
    }

    //Se declara un método que lee el json y lo convierte en un objeto de la clase datosZonasBasicas a través de la librería Gson
    public ArrayList<DatosProducto> LectorJSON() throws FileNotFoundException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        BufferedReader br = new BufferedReader(new FileReader("Productos.json"));
        Type listType = new TypeToken<ArrayList<DatosProducto>>(){}.getType();
        listaProductos = gson.fromJson(br, listType);
        return listaProductos;
    }

    //Método para añadir objeto al json y crear un odf
    public void anadirProducto(DatosProducto datosProducto) throws IOException, DocumentException {
        listaProductos.add(datosProducto);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(listaProductos);
        System.out.println(json);
        //Llamar a PdfManager
        PdfManager pdfManager = new PdfManager();
        pdfManager.crearPdf(datosProducto);
    }
}
