/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.smart.tv;

/**
 *
 * @author MASSINGUE
 */
public class SistemaSmartTv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? :"+ smartTv.ligada);
        System.out.println("Canal Actual? :"+ smartTv.canal);
        System.out.println("Volume Actual? :"+ smartTv.volume);
    
        
        smartTv.ligar();
        System.out.println("Novo status=> Tv Ligada? "+ smartTv.ligada);
    
        smartTv.desligar();
        System.out.println("Novo status=> Tv Ligada? "+ smartTv.ligada);
   
         smartTv.AumentarVolume();
         smartTv.AumentarVolume();
         smartTv.AumentarVolume();
         smartTv.DiminuirVolume();
         
    System.out.println("Novo status=> volume? "+ smartTv.volume);
    System.out.println("Canal Actual? :"+ smartTv.canal);
      smartTv.mudarCanal(7);
      System.out.println("Canal Actual? :"+ smartTv.canal);
    }
    
}
