package Model;

import java.util.ArrayList;

public class CarB extends CarRadio implements ICarB, ICarC{

    private String lastContact;

    public CarB(boolean isON, int volume, boolean radioMode, ArrayList<Float> radios, ArrayList<ISong> songsCD, ArrayList<ISong> songsMP3, ArrayList<ISong> Spotify, int ReproductionType, ArrayList<String> contactos, int actualIndex, boolean inaCall) {
        super(isON, volume, radioMode, radios, songsCD, songsMP3, Spotify, ReproductionType, contactos, actualIndex, inaCall);
    }


    @Override
    public String getLastContact() {
        return lastContact;
    }

    @Override
    public void setLastContact(String LastCalledContact) {
        this.lastContact = lastContact;
    }

    @Override
    public String getPresentationCards() {
        return "CARTA DE PRESENTACION";
    }

    @Override
    public boolean SwitchRadioONOFF(boolean actual_state) {
        if (actual_state){
            setON(false);
            return false;
        }else {
            setON(true);
            return true;
        }
    }

    @Override
    public boolean getRadioStatus() {
        return isRadioMode();
    }

    @Override
    public int getVolume() {
        return getVolume();
    }

    @Override
    public void setVolume(int Volume) {
        setVolumeA(Volume);
    }

    @Override
    public boolean SwitchFrequency(boolean frequency) {
        if (frequency){
            setRadioMode(false);
            return false;
        }else {
            setRadioMode(true);
            return true;
        }
    }

    @Override
    public void setStation(float Volume) {

    }

    @Override
    public float getStation() {
        return 0 ;
    }

    @Override
    public void SaveStation(float _station) {
        getRadios().add(_station);
    }

    @Override
    public float SelectSpecificStation(int _StationIndex) {
        return getRadios().get(_StationIndex-1);
    }

    @Override
    public int getAudioRepType() {
        return getReproductionType();
    }

    @Override
    public void setAudioRepType() {
        if (!(getReproductionType() == 3)){
            setReproductionType(getReproductionType()+1);
        }else{
            setReproductionType(1);
        }
    }


    @Override
    public ArrayList<ISong> getAListOfSongs(int TypeOfAudioReproduction) {
        if (TypeOfAudioReproduction == 1){
            return getSongsCD();
        }else if (TypeOfAudioReproduction == 2){
            return getSongsMP3();
        }else{
            return getSpotify();
        }

    }

    @Override
    public void NextSong(int CurrentIndex, int TypeOfAudioReproduction) {
        if (TypeOfAudioReproduction == 1){
            if (!(getActualIndex() == getSongsCD().size() - 1)){
                setActualIndex(getActualIndex()+1);
            }else {
                setActualIndex(0);
            }

        }else if (TypeOfAudioReproduction == 2){

            if (!(getActualIndex() == getSongsMP3().size() - 1)){
                setActualIndex(getActualIndex()+1);
            }else {
                setActualIndex(0);
            }

        }else{
            if (!(getActualIndex() == getSpotify().size() - 1)){
                setActualIndex(getActualIndex()+1);
            }else {
                setActualIndex(0);
            }
        }
    }

    @Override
    public void PrevSong(int CurrentIndex, int TypeOfAudioReproduction) {
        if (TypeOfAudioReproduction == 1){
            if (!(getActualIndex() == 0)){
                setActualIndex(getSongsCD().size()-1);
            }else {
                setActualIndex(getActualIndex()-1);

            }

        }else if (TypeOfAudioReproduction == 2){

            if (!(getActualIndex() == 0)){
                setActualIndex(getSongsMP3().size()-1);
            }else {
                if (!(getActualIndex() == 0)){
                    setActualIndex(getSpotify().size()-1);
                }else {
                    setActualIndex(getActualIndex()-1);
                }
            }

        }else{
            if (!(getActualIndex() == getSpotify().size() - 1)){
                setActualIndex(getActualIndex()+1);
            }else {
                setActualIndex(0);
            }
        }
    }

    @Override
    public String PlaySong(int TypeOfAudioReproduction) {
        if (TypeOfAudioReproduction == 1){
            return "Cancion reproduciendo del CD: "+getSongsCD().get(getActualIndex()).getTitle();
        }else if (TypeOfAudioReproduction == 2){
            return "Cancion reproduciendo del MP3: "+getSongsMP3().get(getActualIndex()).getTitle();
        }else {
            return "Cancion reproduciendo del Spotify: "+getSongsMP3().get(getActualIndex()).getTitle();
        }

    }

    @Override
    public boolean Connect_DisconnectPhone(boolean CallStatus) {
        if (CallStatus){
            setInaCall(false);
            return false;
        }else {
            setInaCall(true);
            return true;
        }
    }

    @Override
    public boolean getPhoneConnectionStatus() {
        return isInaCall();
    }

    @Override
    public ArrayList<String> getListofContacts() {
        return getContactos();
    }

    @Override
    public int getCallStatus() {
        if (isInaCall()){
            return 1;

        }else{
            return 2;
        }
    }

    @Override
    public String makeCall(String NameforCall) {
        return NameforCall;
    }

    @Override
    public String PlaceCallOnHold() {
        return "Persona en espera";

    }

    @Override
    public String endCall() {
        setInaCall(false);
        return "Llamada terminada";
    }

    @Override
    public String getWeatherForCast() {

        return "Lluvioso";
    }
}
