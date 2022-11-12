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
        return false;
    }

    @Override
    public boolean getRadioStatus() {
        return false;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int Volume) {

    }

    @Override
    public boolean SwitchFrequency(boolean frequency) {
        return true;
    }

    @Override
    public void setStation(float Volume) {

    }

    @Override
    public float getStation() {
        return 0;
    }

    @Override
    public void SaveStation(float _station) {

    }

    @Override
    public float SelectSpecificStation(int _StationIndex) {
        return 0;
    }

    @Override
    public int getAudioRepType() {
        return 0;
    }

    @Override
    public void setAudioRepType() {

    }

    @Override
    public ArrayList<ISong> getAListOfSongs(int TypeOfAudioReproduction) {
        return null;
    }

    @Override
    public void NextSong(int CurrentIndex, int TypeOfAudioReproduction) {

    }

    @Override
    public void PrevSong(int CurrentIndex, int TypeOfAudioReproduction) {

    }

    @Override
    public String PlaySong(int TypeOfAudioReproduction) {
        return null;
    }

    @Override
    public boolean Connect_DisconnectPhone( boolean CallStatus) {
        return false;
    }

    @Override
    public boolean getPhoneConnectionStatus() {
        return false;
    }

    @Override
    public ArrayList<String> getListofContacts() {
        return null;
    }

    @Override
    public int getCallStatus() {
        return 0;
    }

    @Override
    public String makeCall(String NameforCall) {
        return null;
    }

    @Override
    public String PlaceCallOnHold() {
        return null;
    }

    @Override
    public String endCall() {
        return null;
    }

    @Override
    public String getWeatherForCast() {
        return null;
    }
}
