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
