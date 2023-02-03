package es.ufv.dis.final2022.back.AOB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControladorTest {

    //Test que comprueba si se ha creado bien un producto
    @Test
    void testCrearProducto() {
        DatosProducto datosProducto = new DatosProducto();
        datosProducto.setEan(1234);
        datosProducto.setNombre("producto");
        datosProducto.setPrecio(1.0F);
        assertEquals(1234, datosProducto.getEan());
        assertEquals("producto", datosProducto.getNombre());
        assertEquals(1.0F, datosProducto.getPrecio());
    }

    //Test que comprueba que el método post funciona
    @Test
    void testPostProducto() {
        DatosProducto datosProducto = new DatosProducto();
        datosProducto.setEan(1234);
        datosProducto.setNombre("producto");
        datosProducto.setPrecio(1.0F);
        datosProducto.setCategoria("categoria");

        long expectedEan = 1234;
        String expectedNombre = "producto";
        float expectedPrecio = 1.0F;
        String expectedCategoria = "categoria";

        assertEquals(expectedEan, datosProducto.getEan());
        assertEquals(expectedNombre, datosProducto.getNombre());
        assertEquals(expectedPrecio, datosProducto.getPrecio());
        assertEquals(expectedCategoria, datosProducto.getCategoria());

    }
}