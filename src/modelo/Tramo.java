/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Tramo {
    
  private String nombreTramo;
  private int distanciaKms;

    public Tramo() {
    }

    public Tramo(String nombreTramo, int distanciaKms) {
        this.nombreTramo = nombreTramo;
        this.distanciaKms = distanciaKms;
    }

    public String getNombreTramo() {
        return nombreTramo;
    }

    public void setNombreTramo(String nombreTramo) {
        this.nombreTramo = nombreTramo;
    }

    public int getDistanciaKms() {
        return distanciaKms;
    }

    public void setDistanciaKms(int distanciaKms) {
        this.distanciaKms = distanciaKms;
    }
  
}
