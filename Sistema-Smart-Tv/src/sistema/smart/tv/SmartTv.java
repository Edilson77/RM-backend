/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.smart.tv;

/**
 *
 * @author MASSINGUE
 */
public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    
    public void ligar(){
    ligada=true;
    }
    public void desligar(){
    ligada=false;
    }
    
    public void AumentarVolume(){
    volume++;
    System.out.println("Aumentando volume para"+ volume);
    }
    public void DiminuirVolume(){
    volume--;
        System.out.println("Diminuindo volume para"+ volume);
    }
    
    public void mudarCanal(int novoCanal){
    canal=novoCanal;
    }
    
    public void aumentarCanal(){
      canal++;
    }
    
    public void diminuirCanal(){
    canal--;
    }
}
