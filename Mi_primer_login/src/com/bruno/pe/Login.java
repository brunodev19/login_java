package com.bruno.pe;

public class Login {
    public static String USUARIO = "BRUNO";
    public static String PASSWORD = "1234"; 
    
    public void comprobarCredenciales(String usuario, String password){
        /*
        si usuario es igual a USUARIO entonces 
            si password es igual a PASSWORD entonces
                escribir Login exitoso
            sino escribir login fallido 
        sino escribir login fallido
        */
        if ( usuario.equalsIgnoreCase(USUARIO)  ){
            if (password.equals(PASSWORD) ){
                System.out.println("Login Exitoso");
            }else{
                System.out.println("Login Fallido");
            }
        }else{
            System.out.println("Login Fallido");
        }
        
    }
}
