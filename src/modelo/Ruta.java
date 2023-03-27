/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Ruta {
    
      private int id;
    private String nombre;
    private String ciudadOrigen;
    private String CiudadDestino;
    private String estado;
    private ArrayList<Tramo> tramos;

    public Ruta() {
        this.tramos = new ArrayList();
    }

    public Ruta(int id, String nombre, String ciudadOrigen, String CiudadDestino, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
        this.CiudadDestino = CiudadDestino;
        this.estado = estado;
        this.tramos = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Tramo> getTramos() {
        return tramos;
    }

    public void setTramos(ArrayList<Tramo> tramos) {
        this.tramos = tramos;
    }
    
    
    
    
     public void registrarTramo(String nombreTramo,int distanciaKms){
        
        Tramo tramo = new Tramo(nombre, distanciaKms);
        this.tramos.add(tramo);
        
    }
    
    public int numeroTramos(){
        
        return this.tramos.size();
        
    }
    
    public int distanciaTotal(){
        
        int distanciaTotal=0;
        
        for(Tramo t:this.tramos){
            
            distanciaTotal+=t.getDistanciaKms();
            
        }
        
        return distanciaTotal;
        
    }
    
    
    
    
}

    