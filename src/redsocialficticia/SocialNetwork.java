/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocialficticia;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author guill
 */
public class SocialNetwork {
     Queue <Persona> Personas = new PriorityQueue<>();
     Queue <Persona> EsperaActivos;
     Stack <Persona> Eliminados;
     
    public SocialNetwork() {
        EsperaActivos = new LinkedList<Persona>();
        Eliminados = new Stack<Persona>();
    }
    //METODOS GENERALES
     public boolean agregarPersona(Persona pe){
        for (Persona p : EsperaActivos){
            if(p.getNombreCompleto().equalsIgnoreCase(pe.getNombreCompleto())){
                return false;
            }
        }
        return true;
    }
    
     public Persona buscar(int id) {
        for (Persona p : EsperaActivos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
     
    public void agregarPredefinidos(){
        EsperaActivos.offer(new Persona(1,"GUILLERMO ALVAREZ",18,90,100));
        EsperaActivos.offer(new Persona(2,"GUILERMO ALVAREZ",18,90,100));
        EsperaActivos.offer(new Persona(3,"GLERMO ALVAREZ",18,90,100));
        EsperaActivos.offer(new Persona(4,"GUMO ALVAREZ",18,90,100));
        EsperaActivos.offer(new Persona(5,"GUILRMO ALVAREZ",18,90,100));
        EsperaActivos.offer(new Persona(6,"GUILO ALVAREZ",18,90,100));
        
        
    }
    
    
    //METODOS PILAS
    public void aniadirPila(Persona pa){
        Eliminados.push(pa);
    }
    //METODOS COLAS
    public void encolar (Persona pa){
       EsperaActivos.offer(pa);
    }
    public Persona desencolar(){
        return EsperaActivos.remove();
    }
    public Persona frente() {
        return EsperaActivos.peek();
    }
    //COLA PRIORIDAD
     public void agregar(Persona pa){
        Personas.offer(pa);
    }
    
    public Persona desencolarPriori() {
        return Personas.remove();
    }
    
    public int size(){
        return Personas.size();
    }

    @Override
    public String toString() {
        return "Personas=" + Personas + ", EsperaActivos=" + EsperaActivos + ", Eliminados=" + Eliminados + '}';
    }
    
    
    
}
