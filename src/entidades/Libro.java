package entidades;

public class Libro {

    private int dniLector;
    private String nombreLector;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(){

    }

    public Libro(int dniLector, String nombreLector, String titulo, String autor, boolean disponible) {

        this.dniLector = dniLector;
        this.nombreLector = nombreLector;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public int getDniLector() {
        return dniLector;
    }

    public void setDniLector(int dniLector) {
        this.dniLector = dniLector;
    }

    public String getNombreLector() {
        return nombreLector;
    }

    public void setNombreLector(String nombreLector) {
        this.nombreLector = nombreLector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" + "\ndniLector=" + dniLector + ",\nnombreLector=" + nombreLector + ",\ntitulo=" + titulo + ",\nautor=" + autor + ",\ndisponible=" + disponible + '}';
    }
    
}
