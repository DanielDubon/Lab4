package UI;

import Model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        ArrayList<Float> radios = new ArrayList<>();
        ArrayList<ISong> songs = new ArrayList<>();
        ArrayList<String> contactos = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        int opcion = 12;
        boolean isON = false;

        try {
            while (!salir) {
                CarC car = new CarC(true,0,true,radios,songs,songs,songs,1,contactos,1,false);
                System.out.println("-----Mercedes-Benz Co.-----");
                System.out.println("-----MENU-----");
                System.out.println("1. Encender/apagar radio");
                System.out.println("2. Cambiar Volumen");
                System.out.println("3. Modo Radio");
                System.out.println("Elija una opcion a realizar...");
                opcion = in.nextInt();
                in.nextLine();
                switch (opcion) {
                    case 1:
                        car.SwitchRadioONOFF(car.isON());
                        break;
                    case 2:
                        car.setVolume(car.getVolume()+1);
                        break;
                    case 3:
                        System.out.println("Elija el modo de radio a realizar...");
                        System.out.println("1. Cambiar de FM a AM");
                        System.out.println("2. Cambiar emisoras");
                        System.out.println("3. Guardar emisoras");
                        System.out.println("4. Cargar emisora");
                        opcion = in.nextInt();
                        switch(opcion){

                            case 1:

                        }

                        break;
                    case 4:

                        break;
                    case 5:
                        break;
                    case 6:

                        break;

                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                    case 10:

                        break;
                    case 11:

                        break;

                    default:
                        System.out.println("Elija una opción válida...");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Elije un número");
            in.next();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


