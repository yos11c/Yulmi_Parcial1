/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

/**
 *
 * @author Yosmeri C. Cruz
 */
public class LibroModel {
  private String nombre;
  private String tipodpasta;
  private String codigo;
  private String año;
  private String editorial;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipodpasta() {
        return tipodpasta;
    }

    public void setTipodpasta(String tipodpasta) {
        this.tipodpasta = tipodpasta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LibroModel(String nombre, String tipodpasta, String codigo, String año, String editorial) {
        this.nombre = nombre;
        this.tipodpasta = tipodpasta;
        this.codigo = codigo;
        this.año = año;
        this.editorial = editorial;
    }
 
}
