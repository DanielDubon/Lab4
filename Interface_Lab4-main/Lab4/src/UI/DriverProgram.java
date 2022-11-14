package UI;

import Model.CarA;
import Model.CarB;
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
        int volume = 0;
        CarC radio = new CarC();

        try {
            while (!salir) {
                System.out.println("-----Mercedes-Benz Co.-----");
                System.out.println("-----MENU-----");
                System.out.println("1. Encender/apagar radio");
                System.out.println("2. Cambiar Volumen");
                System.out.println("3. Modo de Radio");
                System.out.println("4. Modo de Reproducción");
                System.out.println("5. Modo del Teléfono");
                System.out.println("6. Modo Productividad");
                System.out.println("7. Salir");

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

                            case 3:
                                radio.SaveStation();
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
                                CarRadio.getReproductionType();
                                break;
                            case 2:
                                CarC.NextSong(radio);
                                break;
                            case 3:
                                System.out.println("Se esta reproduciendo la canción");
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
                                radio.Connect_DisconnectPhone();
                                break;
                            case 2:
                                radio.getListofContacts();
                                break;
                            case 3:
                                if (getCallStatus() == 1) {
                                    String PlaceCallOnHold();
                                }else{
                                    radio.makeCall();
                                }
                                break;
                            case 4:
                                radio.endCall();
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Elija el modo de productividad que desea...");
                        System.out.println("1. Planificar viajes");
                        System.out.println("2. Ver tarjetas de presentación");
                        System.out.println("3. Ver pronóstico del tiempo");
                        opcion = in.nextInt();
                        switch(opcion){
                            case 1:
                                TripPlanification();
                                break;
                            case 2:
                                getPresentationCards();
                                break;
                            case 3:
                                getWeatherForCast();
                                break;;
                        }
                        break;
                    case 7:
                        salir = true;
                        System.out.println("Gracias por visitarnos!...");
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