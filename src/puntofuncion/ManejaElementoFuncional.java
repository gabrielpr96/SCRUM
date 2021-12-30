/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntofuncion;

import java.util.ArrayList;

/**
 *
 * @author gabir
 */
public class ManejaElementoFuncional {
    private final ArrayList<ElementoFuncional> elemento;
    
    public ManejaElementoFuncional(){
        elemento = new ArrayList<>();
    }
    
    public ArrayList elementos(){
        return elemento;
    }
    
    public void anadeElemento(ElementoFuncional e){
        elemento.add(e);
    }
    
    public String getComplejidadElemento(int e){
        String eSeleccionado = elemento.get(e).getElemento();
        String sol = null;
        if(eSeleccionado.equals("FLI")){
            int nFLI = 0;
            int datos = elemento.get(e).getNDat();
            for(int i = 0; i < elemento.size(); i++){
                if(elemento.get(i).getElemento().equals("FLI")){
                    nFLI++;
                }
            }
            if(nFLI == 1 && (datos >= 1 && datos <= 19)){
                sol = "S";
            }
            if(nFLI == 1 && (datos >= 20 && datos <= 50)){
                sol = "S";
            }
            if(nFLI == 1 && datos > 50){
                sol = "M";
            }
            if((nFLI >= 2 && nFLI <= 5) && (datos >= 1 && datos <= 19)){
                sol = "S";
            }
            if((nFLI >= 2 && nFLI <= 5) && (datos >= 20 && datos <= 50)){
                sol = "M";
            }
            if((nFLI >= 2 && nFLI <= 5) && (datos > 50)){
                sol = "C";
            }
            if(nFLI > 5 && (datos >= 1 && datos <= 19)){
                sol = "M";
            }
            if(nFLI > 5 && (datos >= 20 && datos <= 50)){
                sol = "C";
            }
            if(nFLI > 5 && (datos > 50)){
                sol = "C";
            } 
        }
        if(eSeleccionado.equals("FLE")){
            int nFLE = 0;
            int datos = elemento.get(e).getNDat();
            for(int i = 0; i < elemento.size(); i++){
                if(elemento.get(i).getElemento().equals("FLE")){
                    nFLE++;
                }
            }
            if(nFLE == 1 && (datos >= 1 && datos <= 19)){
                sol = "S";
            }
            if(nFLE == 1 && (datos >= 20 && datos <= 50)){
                sol = "S";
            }
            if(nFLE == 1 && datos > 50){
                sol = "M";
            }
            if((nFLE >= 2 && nFLE <= 5) && (datos >= 1 && datos <= 19)){
                sol = "S";
            }
            if((nFLE >= 2 && nFLE <= 5) && (datos >= 20 && datos <= 50)){
                sol = "M";
            }
            if((nFLE >= 2 && nFLE <= 5) && (datos > 50)){
                sol = "C";
            }
            if(nFLE > 5 && (datos >= 1 && datos <= 19)){
                sol = "M";
            }
            if(nFLE > 5 && (datos >= 20 && datos <= 50)){
                sol = "C";
            }
            if(nFLE > 5 && (datos > 50)){
                sol = "C";
            } 
        }
        if(eSeleccionado.equals("EE")){
            int datos = elemento.get(e).getNDat();
            int ficheros = elemento.get(e).getNFich();
            
            if((ficheros == 0 || ficheros == 1) && (datos >= 1 && datos <= 4)){
                sol = "S";
            }
            if((ficheros == 0 || ficheros == 1) && (datos >= 5 && datos <= 15)){
                sol = "S";
            }
            if((ficheros == 0 || ficheros == 1) && (datos > 15)){
                sol = "M";
            }
            if((ficheros == 2) && (datos >= 1 && datos <= 4)){
                sol = "S";
            }
            if((ficheros == 2) && (datos >= 5 && datos <= 15)){
                sol = "M";
            }
            if((ficheros == 2) && (datos > 15)){
                sol = "C";
            }
            if((ficheros >= 3) && (datos >= 1 && datos <= 4)){
                sol = "M";
            }
            if((ficheros >= 3) && (datos >= 5 && datos <= 15)){
                sol = "C";
            }
            if((ficheros >= 3) && (datos > 15)){
                sol = "C";
            }
        }
        if(eSeleccionado.equals("SE")){
            int datos = elemento.get(e).getNDat();
            int ficheros = elemento.get(e).getNFich();
            
            if((ficheros == 0 || ficheros == 1) && (datos >= 1 && datos <= 5)){
                sol = "S";
            }
            if((ficheros == 0 || ficheros == 1) && (datos >= 6 && datos <= 19)){
                sol = "S";
            }
            if((ficheros == 0 || ficheros == 1) && (datos > 19)){
                sol = "M";
            }
            if((ficheros == 2 || ficheros == 3) && (datos >= 1 && datos <= 5)){
                sol = "S";
            }
            if((ficheros == 2 || ficheros == 3) && (datos >= 6 && datos <= 19)){
                sol = "M";
            }
            if((ficheros == 2 || ficheros == 3) && (datos > 19)){
                sol = "C";
            }
            if((ficheros >= 4) && (datos >= 1 && datos <= 5)){
                sol = "M";
            }
            if((ficheros >= 4) && (datos >= 6 && datos <= 19)){
                sol = "C";
            }
            if((ficheros >= 4) && (datos > 19)){
                sol = "C";
            }
        }
        if(eSeleccionado.equals("CE")){
            
        }
        return sol;
    }
}
