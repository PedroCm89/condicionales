package com.company;

public class Main {

    public static void main(String[] args) {

        int num1=-1;
        int num2=0;
        String estacion="invierno";

        //Condicional if.
        if(num1>=0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
        System.out.println("-----------");
        //Bucle wild.
        while (num2 < 3) {
            System.out.println(num2);
            num2++;
        }
        System.out.println("-----------");
        //Buecle do wild.
        do{
           System.out.println(num2);
           num2++;
        }while(num2<3);
        System.out.println("-----------");
        //Bucle for.
        for( int i =0; i<=3;i++){
            System.out.println(i);
        }
        System.out.println("-----------");
        //Switch.
        switch(estacion){
            case"primavera":
                System.out.println("Es Primavera");
                break;
            case"verano":
                System.out.println("Es verano");
                break;
            case"otoño":
                System.out.println("Es otoño");
                break;
            case"invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("estacion incorrecta");


        }
    }
}
