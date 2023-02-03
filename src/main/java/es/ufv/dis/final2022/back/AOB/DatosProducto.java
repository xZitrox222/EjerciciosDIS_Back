package es.ufv.dis.final2022.back.AOB;

public class DatosProducto {
    private String nombre;
    private String categoria;
    private float precio;
    private long EAN13;

    public DatosProducto() {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.EAN13 = EAN13;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public long getEan() {
        return EAN13;
    }

    public void setEan(long EAN13) {
        this.EAN13 = EAN13;
    }

    @Override
    public String toString() {
        return "DatosProducto{" + "nombre=" + nombre + ", categor\u00eda=" + categoria + ", precio=" + precio + ", ean=" + EAN13 + '}';
    }

}
