
package Modelo;

//Ruben Dario Durango Gomez

public class Compania {
    
    int idCompania;
    String nombreCompania;
    String direccion;

    public Compania() {
    }

    public Compania(int idCompania, String nombreCompania, String direccion) {
        this.idCompania = idCompania;
        this.nombreCompania = nombreCompania;
        this.direccion = direccion;
    }

    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
