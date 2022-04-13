package com.company;

public class Main {

    public static void main(String[] args) {
        int numeroWhile=0;

        while (numeroWhile <3){
            numeroWhile=numeroWhile+1;
            System.out.println("Este es el While"+numeroWhile);

        };



        do{
            numeroWhile=numeroWhile+1;
            System.out.println("Este es el Do While"+numeroWhile);
        }while (numeroWhile < 3);

        for(int numeroFor=0; numeroFor <=3; numeroFor++){
            System.out.println("Este es el for"+numeroFor);
        };
        var estacion="Otono";
        switch (estacion){
            case "Invierno":
                System.out.println("Estamos en la estación:"+estacion);
                break;
            case "Verano":
                System.out.println("Estamos en la estación:"+estacion);
                break;
            case "Otono":
                System.out.println("Estamos en la estación:"+estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en la estación:"+estacion);
                break;
            default:
                System.out.println("Esta no es una estación:"+estacion);


        }

	// write your code here
    }
}
