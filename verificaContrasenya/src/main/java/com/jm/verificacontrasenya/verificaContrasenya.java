/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jm.verificacontrasenya;

/**
 *
 * @author tolsa
 */
public class verificaContrasenya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String caractersAdmesos = "abcdefghijklmnopqrstuvwxyzñç";
        String numerosAdmesos = "1234567890";
        
        String contrasenya = "aaaaa22aa";
        
        if (contrasenya.length()<8){
            System.out.println("La cotrasenya es massa curta");
        }
        else{
            int algunaLletra = 0;
            int algunNumero = 0;
            for (int posicio=0;posicio<contrasenya.length();posicio++){
                if (caractersAdmesos.indexOf(contrasenya.charAt(posicio))>=0){
                    algunaLletra = 1;
                }
                if (numerosAdmesos.indexOf(contrasenya.charAt(posicio))>=0){
                    algunNumero = 1;
                }
            }
            if (algunaLletra == 0){
                System.out.println("La cotrasenya ha de contenir alguna lletra");
            }
            else if (algunNumero == 0){
                System.out.println("La cotrasenya ha de contenir algun numero");
            }else  
            {
                System.out.println("Contrasenya correcta");
            }
        }
    } 
}
