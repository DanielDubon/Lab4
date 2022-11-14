package UI;

import Model.CarA;
import Model.CarC;
import Model.CarRadio;
import Model.Song;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        ArrayList<Float> radios = new ArrayList<>();
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<String> contactos = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        int opcion = 12;
        boolean isON = false;
        boolean RadiOn = false;

        try {
            while (!salir) {
                System.out.println("-----Mercedes-Benz Co.-----");
                System.out.println("-----MENU-----");
                System.out.println("1. Encender/apagar radio");
                System.out.println("2. Cambiar Volumen");
                System.out.println("3. Modo de Radio");
                System.out.println("4. Modo de Reproducción");
                System.out.println("5. Modo del Teléfono");

                System.out.println("Elija una opcion a realizar...");
                opcion = in.nextInt();
                in.nextLine();
                switch (opcion) {
                    case 1:
                        if (isON==true){
                            System.out.println("La radio está encendida");
                        }else{
                        System.out.println("La radio está apagada ");
                        }
                        break;
                    case 2:
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
                                if (RadiOn == true){
                                    System.out.println("La radio está en FM");
                                }else{
                                    System.out.println("La radio está en AM");
                                }
                                break;
                            case 2:
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Elija el modo de reproducción que desea...");
                        System.out.println("1. Seleccionar lista de reproducción");
                        System.out.println("2. Cambiar canción");
                        System.out.println("3. Escuchar canción");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Elija el modo de teléfono que desea...");
                        System.out.println("1. Conectar/Desconectar teléfono");
                        System.out.println("2. Mostrar contactos");
                        System.out.println("3. Llamar a contacto");
                        System.out.println("4. Finalizar llamada");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
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