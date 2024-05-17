package edu.mx.tecnm.tec2.httpjson;

public class Cultivo {

    int idgraminea;

    String nombreComun,nombreCientifico,descripcion,imagen;

    public Cultivo() {
    }

    public Cultivo(int idgraminea, String nombreComun, String nombreCientifico, String descripcion, String imagen) {
        this.idgraminea = idgraminea;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public int getIdgraminea() {
        return idgraminea;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setIdgraminea(int idgraminea) {
        this.idgraminea = idgraminea;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
