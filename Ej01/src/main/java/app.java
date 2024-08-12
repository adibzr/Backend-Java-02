import herencia.ClaseA;
import herencia.ClaseB;
import herencia.ClaseC;
import polimorfismo.Auto;
import polimorfismo.Barco;
import polimorfismo.Helicoptero;
import polimorfismo.Vehiculo;
import encapsulamiento.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        System.out.println("HW01 - Intro POO");

        /*
        try {
            throw new Exception("se rompio todo");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         */
/*
        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        cuentaBancaria.saldo = 45F;
        System.out.println("El saldo de la cuenta es " + cuentaBancaria.saldo);

        System.out.println("Saldo de la cuenta:" + cuentaBancaria.saldo);

        System.out.println(Math.PI);
        System.out.println(Math.pow(2,3));

        ClaseA obj1 = new ClaseA();

        obj1.metodo1();
        obj1.metodo2();

        ClaseB obj2 = new ClaseB();

        obj2.metodo1();
        obj2.metodo2();

        ClaseC obj3 = new ClaseC();

        obj3.metodo1();
        obj3.metodo2();
*/

        Auto auto1 = new Auto("VW", "Gol", 30);
        Auto auto2 = new Auto("Ferrari", "F40", 55);
        Auto auto3 = new Auto("Renault", "Logan", 25);

//        List<Auto> flota = new ArrayList<>();

//        flota.add(auto1);
//        flota.add(auto2);
//        flota.add(auto3);

//        for (Auto auto : flota)   {
//            auto.desplazarse(20);
//        }

        Barco barco1 = new Barco("Marca Barco", "Bote", 300);
        Helicoptero heli1 = new Helicoptero("Heli1", "Heli 2", 500);

        //  flota.add(barco1);
      //    flota.add(heli1);


        Vehiculo auto4 = new Auto("VW", "Gol", 30);
        Vehiculo auto5 = new Auto("Ferrari", "F40", 55);
        Vehiculo auto6 = new Auto("Renault", "Logan", 25);

        //Vehiculo barco1 = new Barco("Marca Barco", "Bote", 300);
        // Vehiculo heli1 = new Helicoptero("Heli1", "Heli 2", 500);

        List<Vehiculo> flota2 = new ArrayList<>();
        flota2.add(auto1);
        flota2.add(auto2);
        flota2.add(auto3);
        flota2.add(barco1);
        flota2.add(heli1);

        for (Vehiculo vehiculo : flota2)   {
            vehiculo.desplazarse(20);
        }
    }
}
