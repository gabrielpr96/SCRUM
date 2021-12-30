/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntofuncion;

/**
 *
 * @author gabir
 */
public class ElementoFuncional {
    private String elemento;
    private String nombre;
    private int nFicheros;
    private int nDatos;
    
    public ElementoFuncional(String e, String n, int f, int d){
        this.nDatos = d;
        this.elemento = e;
        this.nombre = n;
        this.nFicheros = f;
    }
    
    public String getElemento(){
        return this.elemento;
    }
    
    public void setElemento(String e){
        this.elemento = e;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public int getNFich(){
        return this.nFicheros;
    }
    
    public void setNFich(int f){
        this.nFicheros = f;
    }
    
    public int getNDat(){
        return this.nDatos;
    }
    
    public void setNDat(int d){
        this.nDatos = d;
    }
}
