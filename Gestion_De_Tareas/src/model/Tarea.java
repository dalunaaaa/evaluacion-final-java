package model;

public class Tarea {
    private String titulo;
    private String Descripcion;
    private String FechaLimite;
    private String UnEstado;

    public Tarea(String titulo, String Descripcion, String FechaLimite, String UnEstado) {
        this.titulo= titulo;
        this.Descripcion= Descripcion;
        this.FechaLimite = FechaLimite;
        this.UnEstado = UnEstado;
    }

    //getters y setters

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String Titulo) {
        this.titulo= titulo;
    }

    public String getDescripcion() {
        return getDescripcion();
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion= Descripcion;
    }

    public int getFechaLimite() {
        return getFechaLimite();
    }
    public void setFechaLimite( String FechaLimite) {
        this.FechaLimite= FechaLimite;
    }
    public String getUnEstado() {
        return getUnEstado();
    }
    public void setUnEstado(String UnEstado) {
        this.UnEstado= UnEstado;
    }





}
