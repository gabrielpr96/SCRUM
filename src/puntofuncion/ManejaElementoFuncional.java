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
    
    public void getPFNA(int EEs, int EEm, int EEc, int SEs, int SEm, int SEc, int FLIs, int FLIm, int FLIc, int FLEs, int FLEm, int FLEc, int CEs, int CEm, int CEc, int TEE, int TSE, int TFLI, int TFLE, int TCE, int T){
      EEs = 0; EEm = 0; EEc = 0; SEs = 0; SEm = 0; SEc = 0; FLIs = 0; FLIm = 0; FLIc = 0; FLEs = 0; FLEm = 0; FLEc = 0; CEs = 0; CEm = 0; CEc = 0; TEE = 0; TSE = 0;
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
      System.out.println("EEs: " + EEs);
      System.out.println("EEm: " + EEm);
      System.out.println("T: " + EEc);
      System.out.println("SEs: " + SEs);
      System.out.println("SEm: " + SEm);
      System.out.println("TEE: " + TEE);

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
