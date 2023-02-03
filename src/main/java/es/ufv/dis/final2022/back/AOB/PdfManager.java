package es.ufv.dis.final2022.back.AOB;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfManager {
    public void crearPdf(DatosProducto datosProducto) throws IOException, DocumentException {
        //Se crea un documento de pdf
        Document document = new Document();
        //Se crea un fichero pdf
        File fichero = new File("productos" + datosProducto.getNombre() + ".pdf");
        //Se crea un escritor de pdf
        PdfWriter.getInstance(document, new FileOutputStream(fichero));
        //Se abre el documento
        document.open();
        //Se crea un parrafo
        Paragraph paragraph = new Paragraph();
        //Se añade texto al parrafo
        paragraph.add("Nombre: " + datosProducto.getNombre() + " " + datosProducto.getCategoria() + " " + datosProducto.getPrecio() + " " + datosProducto.getEan());
        //Se añade el parrafo al documento
        document.add(paragraph);
        //Se cierra el documento
        document.close();
    }
}





