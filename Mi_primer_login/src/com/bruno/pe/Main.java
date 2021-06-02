package com.bruno.pe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese su Usuario:");
        String usuarioIngresado = miScanner.nextLine();
        System.out.println("Ingrese su Password");
        String passwordIngresado = miScanner.nextLine();

        Login miLogin = new Login();

        miLogin.comprobarCredenciales(usuarioIngresado, passwordIngresado);
    }
}
