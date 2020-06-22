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
        
        String contrasenya = "aaAaa22a$aaa";
        
        if (contrasenya.length()<10){
            System.out.println("La cotrasenya es massa curta, mínim 10");
        }
        else{
            int algunaLletraMinuscula = 0;
            int algunaLletraMajuscula = 0;
            int algunNumero = 0;
            int algunSimbol = 0;
            for (int posicio=0;posicio<contrasenya.length();posicio++){
                if (caractersAdmesos.indexOf(contrasenya.charAt(posicio))>=0){
                    algunaLletraMinuscula += 1;
                }else if (caractersAdmesos.toUpperCase().indexOf(contrasenya.charAt(posicio))>=0){
                    algunaLletraMajuscula += 1;
                }else if (numerosAdmesos.indexOf(contrasenya.charAt(posicio))>=0){
                    algunNumero += 1;
                }
                else if (posicio > 0 || posicio < (contrasenya.length()))
                {
                    algunSimbol +=1;
                }
            }
            if (algunaLletraMinuscula == 0){
                System.out.println("La cotrasenya ha de contenir alguna lletra minuscula");
            }
            if (algunaLletraMajuscula == 0){
                System.out.println("La cotrasenya ha de contenir alguna lletra majuscula");
            }
            else if (algunNumero < 2){
                System.out.println("La cotrasenya ha de contenir almenys 2 numeros");
            }else if (algunSimbol == 0) 
            {
                System.out.println("La cotrasenya ha de contenir algun simbol que no estigui al principi ni al final");
            }
            else
            {
                System.out.println("Contrasenya correcta");
            }
        }
    } 
}
