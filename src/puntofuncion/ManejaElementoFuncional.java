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
    
    public void eliminarElemento(int index){
        if(elemento.get(index).getElemento().equals("CE")){
            elemento.remove(index);
            elemento.remove(index);
        }
        else{
            elemento.remove(index);
        }
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
            else if(nFLI == 1 && (datos >= 20 && datos <= 50)){
                sol = "S";
            }
            else if(nFLI == 1 && datos > 50){
                sol = "M";
            }
            else if((nFLI >= 2 && nFLI <= 5) && (datos >= 1 && datos <= 19)){
                sol = "S";
            }
            else if((nFLI >= 2 && nFLI <= 5) && (datos >= 20 && datos <= 50)){
                sol = "M";
            }
            else if((nFLI >= 2 && nFLI <= 5) && (datos > 50)){
                sol = "C";
            }
            else if(nFLI > 5 && (datos >= 1 && datos <= 19)){
                sol = "M";
            }
            else if(nFLI > 5 && (datos >= 20 && datos <= 50)){
                sol = "C";
            }
            else if(nFLI > 5 && (datos > 50)){
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
            else if(nFLE == 1 && (datos >= 20 && datos <= 50)){
                sol = "S";
            }
            else if(nFLE == 1 && datos > 50){
                sol = "M";
            }
            else if((nFLE >= 2 && nFLE <= 5) && (datos >= 1 && datos <= 19)){
                sol = "S";
            }
            else if((nFLE >= 2 && nFLE <= 5) && (datos >= 20 && datos <= 50)){
                sol = "M";
            }
            else if((nFLE >= 2 && nFLE <= 5) && (datos > 50)){
                sol = "C";
            }
            else if(nFLE > 5 && (datos >= 1 && datos <= 19)){
                sol = "M";
            }
            else if(nFLE > 5 && (datos >= 20 && datos <= 50)){
                sol = "C";
            }
            else if(nFLE > 5 && (datos > 50)){
                sol = "C";
            } 
        }
        if(eSeleccionado.equals("EE")){
            sol = this.esEE(e);
        }
        if(eSeleccionado.equals("SE")){
            sol = this.esSE(e);
        }
        if(eSeleccionado.equals("CE")){
            String temp1, temp2;
            temp1 = this.esEE(e);
            temp2 = this.esSE(e+1);
            
            if(!temp1.equals(temp2)){
                if(temp1.equals("S") && temp2.equals("M")){
                    sol = temp2;
                }
                else if(temp1.equals("S") && temp2.equals("C")){
                    sol = temp2;
                }
                else if(temp1.equals("M") && temp2.equals("S")){
                    sol = temp1;
                }
                else if(temp1.equals("C") && temp2.equals("S")){
                    sol = temp1;
                }
                if(temp1.equals("M") && temp2.equals("C")){
                    sol = temp2;
                }
                if(temp1.equals("C") && temp2.equals("M")){
                    sol = temp1;
                }
            }
            else{
                sol = temp1;
            }
        }
        return sol;
    }
    
    public int[] getPFNA(){
      int[] PFNA = new int[21];
      int EEs = 0; int EEm = 0; int EEc = 0; int SEs = 0; int SEm = 0; int SEc = 0; int FLIs = 0; int FLIm = 0; int FLIc = 0; int FLEs = 0; int FLEm = 0; int FLEc = 0; int CEs = 0; int TFLE = 0; int CEm = 0; int CEc = 0; int TEE = 0; int TFLI = 0; int TSE = 0; int T = 0; int TCE = 0;
      String complejidad;
      for(int i = 0; i < elemento.size(); i++){
          complejidad = this.getComplejidadElemento(i);
            if(elemento.get(i).getElemento().equals("EE")){
                if(complejidad.equals("S")){
                    EEs++;
                }
                else if(complejidad.equals("M")){
                    EEm++;
                }
                else if(complejidad.equals("C")){
                    EEc++;
                }
            }
          else if(elemento.get(i).getElemento().equals("SE")){
                if(complejidad.equals("S")){
                    SEs++;
                }
                else if(complejidad.equals("M")){
                    SEm++;
                }
                else if(complejidad.equals("C")){
                    SEc++;
                }
            }
          else if(elemento.get(i).getElemento().equals("FLI")){
                if(complejidad.equals("S")){
                    FLIs++;
                }
                else if(complejidad.equals("M")){
                    FLIm++;
                }
                else if(complejidad.equals("C")){
                    FLIc++;
                }
            }
          else if(elemento.get(i).getElemento().equals("FLE")){
                if(complejidad.equals("S")){
                    FLEs++;
                }
                else if(complejidad.equals("M")){
                    FLEm++;
                }
                else if(complejidad.equals("C")){
                    FLEc++;
                }
            }
          else if(elemento.get(i).getElemento().equals("CE")){
                if(complejidad.equals("S")){
                    CEs++;
                }
                else if(complejidad.equals("M")){
                    CEm++;
                }
                else if(complejidad.equals("C")){
                    CEc++;
                }
                i++;
            }
        }
      
      EEs = EEs*3;
      EEm = EEm*4;
      EEc = EEc*6;
      
      SEs = SEs*4;
      SEm = SEm*5;
      SEc = SEc*7;
      
      FLIs = FLIs*7;
      FLIm = FLIm*10;
      FLIc = FLIc*15;
      
      FLEs = FLEs*5;
      FLEm = FLEm*7;
      FLEc = FLEc*10;
      
      CEs = CEs*3;
      CEm = CEm*4;
      CEc = CEc*6;
      
      TEE = EEs + EEc + EEm;
      TSE = SEs + SEc + SEm;
      TFLI = FLIs + FLIc + FLIm;
      TFLE = FLEs + FLEc + FLEm;
      TCE = CEs + CEc + CEm;
      T = TEE + TSE + TFLI + TFLE + TCE;
      
      PFNA[0] = EEs;
      PFNA[1] = EEm;
      PFNA[2] = EEc;
      PFNA[3] = TEE;
      PFNA[4] = SEs;
      PFNA[5] = SEm;
      PFNA[6] = SEc;
      PFNA[7] = TSE;
      PFNA[8] = FLIs;
      PFNA[9] = FLIm;
      PFNA[10] = FLIc;
      PFNA[11] = TFLI;
      PFNA[12] = FLEs;
      PFNA[13] = FLEm;
      PFNA[14] = FLEc;
      PFNA[15] = TFLE;
      PFNA[16] = CEs;
      PFNA[17] = CEm;
      PFNA[18] = CEc;
      PFNA[19] = TCE;
      PFNA[20] = T;
      
      return PFNA;
    }
    
    public float[] tablaEsfuerzo(String nombre){
        float valores[] = new float[2];
        if(nombre.equals("MF")){
            valores[0] = (float) 49.02;
            valores[1] = (float) 0.736;
        }
        else if(nombre.equals("MR")){
            valores[0] = (float) 78.88;
            valores[1] = (float) 0.646;
        }
        else if(nombre.equals("PC")){
            valores[0] = (float) 48.90;
            valores[1] = (float) 0.661;
        }
        else if(nombre.equals("Multi")){
            valores[0] = (float) 16.01;
            valores[1] = (float) 0.865;
        }
        else if(nombre.equals("3GL")){
            valores[0] = (float) 54.65;
            valores[1] = (float) 0.717;
        }
        else if(nombre.equals("4GL")){
            valores[0] = (float) 29.50;
            valores[1] = (float) 0.758;
        }
        else if(nombre.equals("GenAp")){
            valores[0] = (float) 68.11;
            valores[1] = (float) 0.660;
        }
        else if(nombre.equals("Mantenimiento")){
            valores[0] = (float) 52.58;
            valores[1] = (float) 0.683;
        }
        else if(nombre.equals("Nuevo")){
            valores[0] = (float) 39.05;
            valores[1] = (float) 0.731;
        }
        else if(nombre.equals("MF-3GL")){
            valores[0] = (float) 65.37;
            valores[1] = (float) 0.705;
        }
        else if(nombre.equals("MF-4GL")){
            valores[0] = (float) 52.09;
            valores[1] = (float) 0.640;
        }
        else if(nombre.equals("MF-GenAp")){
            valores[0] = (float) 65.68;
            valores[1] = (float) 0.692;
        }
        else if(nombre.equals("MR-3GL")){
            valores[0] = (float) 126.3;
            valores[1] = (float) 0.565;
        }
        else if(nombre.equals("MR-4GL")){
            valores[0] = (float) 62.35;
            valores[1] = (float) 0.694;
        }
        else if(nombre.equals("PC-3GL")){
            valores[0] = (float) 60.46;
            valores[1] = (float) 0.648;
        }
        else if(nombre.equals("PC-4GL")){
            valores[0] = (float) 36.48;
            valores[1] = (float) 0.694;
        }
        else if(nombre.equals("Multi-3GL")){
            valores[0] = (float) 19.82;
            valores[1] = (float) 0.666;
        }
        else if(nombre.equals("Multi-4GL")){
            valores[0] = (float) 6.49;
            valores[1] = (float) 0.983;
        }
        else if(nombre.equals("MF-3GL-Mantenimiento")){
            valores[0] = (float) 83.27;
            valores[1] = (float) 0.650;
        }
        
        return valores;
    }
    
    public float[] tablaDuracion(String nombre){
        float valores[] = new float[2];
        if(nombre.equals("PC")){
            valores[0] = (float) 0.503;
            valores[1] = (float) 0.409;
        }
        else if(nombre.equals("Multi")){
            valores[0] = (float) 0.679;
            valores[1] = (float) 0.341;
        }
        else if(nombre.equals("4GL")){
            valores[0] = (float) 0.578;
            valores[1] = (float) 0.393;
        }
        else if(nombre.equals("Nuevo")){
            valores[0] = (float) 0.739;
            valores[1] = (float) 0.359;
        }
        else if(nombre.equals("PC-4GL")){
            valores[0] = (float) 0.348;
            valores[1] = (float) 0.471;
        }
        else if(nombre.equals("Multi-4GL")){
            valores[0] = (float) 0.366;
            valores[1] = (float) 0.451;
        }
        else if(nombre.equals("PC-4GL-Nuevo")){
            valores[0] = (float) 0.250;
            valores[1] = (float) 0.515;
        }
        else if(nombre.equals("Multi-4GL-Nuevo")){
            valores[0] = (float) 0.240;
            valores[1] = (float) 0.518;
        }
        
        return valores;
    }

    
    private String esEE(int e){
        String sol = null;
        int datos = elemento.get(e).getNDat();
        int ficheros = elemento.get(e).getNFich();

        if((ficheros == 0 || ficheros == 1) && (datos >= 1 && datos <= 4)){
            sol = "S";
        }
        else if((ficheros == 0 || ficheros == 1) && (datos >= 5 && datos <= 15)){
            sol = "S";
        }
        else if((ficheros == 0 || ficheros == 1) && (datos > 15)){
            sol = "M";
        }
        else if((ficheros == 2) && (datos >= 1 && datos <= 4)){
            sol = "S";
        }
        else if((ficheros == 2) && (datos >= 5 && datos <= 15)){
            sol = "M";
        }
        else if((ficheros == 2) && (datos > 15)){
            sol = "C";
        }
        else if((ficheros >= 3) && (datos >= 1 && datos <= 4)){
            sol = "M";
        }
        else if((ficheros >= 3) && (datos >= 5 && datos <= 15)){
            sol = "C";
        }
        else if((ficheros >= 3) && (datos > 15)){
            sol = "C";
        }
        return sol;
    }
    
    private String esSE(int e){
        String sol = null;
        int datos = elemento.get(e).getNDat();
        int ficheros = elemento.get(e).getNFich();

        if((ficheros == 0 || ficheros == 1) && (datos >= 1 && datos <= 5)){
            sol = "S";
        }
        else if((ficheros == 0 || ficheros == 1) && (datos >= 6 && datos <= 19)){
            sol = "S";
        }
        else if((ficheros == 0 || ficheros == 1) && (datos > 19)){
            sol = "M";
        }
        else if((ficheros == 2 || ficheros == 3) && (datos >= 1 && datos <= 5)){
            sol = "S";
        }
        else if((ficheros == 2 || ficheros == 3) && (datos >= 6 && datos <= 19)){
            sol = "M";
        }
        else if((ficheros == 2 || ficheros == 3) && (datos > 19)){
            sol = "C";
        }
        else if((ficheros >= 4) && (datos >= 1 && datos <= 5)){
            sol = "M";
        }
        else if((ficheros >= 4) && (datos >= 6 && datos <= 19)){
            sol = "C";
        }
        else if((ficheros >= 4) && (datos > 19)){
            sol = "C";
        }
        return sol;
    }
}
