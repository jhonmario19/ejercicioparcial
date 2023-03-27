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
public class motorBusqueda {
    
    private ArrayList<Ruta> rutas;

    public motorBusqueda() {
        
        this.rutas = new ArrayList();
        
    }

    public ArrayList<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(ArrayList<Ruta> rutas) {
        this.rutas = rutas;
    }

    
    
    
    
    
    
    public void registrarRuta(Ruta ruta){
        
        this.rutas.add(ruta);
        
    }
    
    public Ruta buscarRutaCorta(String origen, String destino){
        
        Ruta rutaCorta = null;
        
        for(Ruta r: this.rutas){
            
            if(r.getEstado().equalsIgnoreCase("habilitado" )&&r.getCiudadOrigen().equalsIgnoreCase(origen) && r.getCiudadDestino().equalsIgnoreCase(destino)){
                
                if(rutaCorta == null){
                    
                    rutaCorta = r;
                    
                }else{
                    
                    if(r.distanciaTotal()<rutaCorta.distanciaTotal()){
                        
                        rutaCorta = r;
                        
                    }
                }
                
            }
            
        }
        
        return rutaCorta;
    }

    
    
}
