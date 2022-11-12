package Model;

import java.util.ArrayList;

public class CarA extends CarRadio implements ICarA, ICarC{

    private boolean speakerStatus;

    public CarA(boolean isON, int volume, boolean radioMode, ArrayList<Float> radios, ArrayList<ISong> songsCD, ArrayList<ISong> songsMP3, ArrayList<ISong> Spotify, int ReproductionType, ArrayList<String> contactos, int actualIndex, boolean inaCall) {
        super(isON, volume, radioMode, radios, songsCD, songsMP3, Spotify, ReproductionType, contactos, actualIndex, inaCall);
    }


    @Override
    public boolean getSpeakerStatus() {
        return speakerStatus;
    }

    public void setSpeakerStatus(boolean speakerStatus){
        this.speakerStatus = speakerStatus;
    }

    @Override
    public boolean ChangeSpeakerStatus(boolean LastCalledContact) {

    if (speakerStatus){
        return false;

    }else{
        return true;
    }

    }


    @Override
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength, String tripObjective) {
        return "El dia del viaje sera el "+tripday+" a las: "+ tripHour_+" al lugar: "+ tripPlace+" con el objetivo de: "+tripObjective;
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
        return getVolumeA();
    }

    @Override
    public void setVolume(int Volume) {
        setVolumeA(Volume);
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
    public boolean Connect_DisconnectPhone(boolean CallStatus) {
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
