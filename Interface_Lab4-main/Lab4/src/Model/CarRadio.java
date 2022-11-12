package Model;

import java.util.ArrayList;

public abstract class CarRadio {

    private boolean isON;
    private int volume;
    private boolean RadioMode;

    private boolean inaCall;

    private int actualIndex;
    private ArrayList<Float> radios = new ArrayList<>();
    private ArrayList<ISong> songsCD = new ArrayList<>();
    private ArrayList<ISong> songsMP3 = new ArrayList<>();
    private ArrayList<ISong> Spotify = new ArrayList<>();
    private ArrayList<String> contactos = new ArrayList<>();

    private int ReproductionType;

    public CarRadio(boolean isON, int volume, boolean radioMode,ArrayList<Float> radios, ArrayList<ISong> songsCD,ArrayList<ISong> songsMP3,ArrayList<ISong> Spotify, int ReproductionType,ArrayList<String> contactos, int actualIndex,boolean inaCall){
        this.isON = isON;
        this.volume = volume;
        this.RadioMode = radioMode;
        this.radios = radios;
        this.songsCD = songsCD;
        this.songsMP3 = songsMP3;
        this.Spotify = Spotify;
        this.ReproductionType = ReproductionType;
        this.contactos = contactos;
        this.actualIndex = actualIndex;
        this.inaCall = inaCall;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }


    public boolean isRadioMode() {
        return RadioMode;
    }

    public void setRadioMode(boolean radioMode) {
        RadioMode = radioMode;
    }

    public ArrayList<Float> getRadios() {
        return radios;
    }

    public void setRadios(ArrayList<Float> radios) {
        this.radios = radios;
    }

    public ArrayList<ISong> getSongsCD() {
        return songsCD;
    }

    public void setSongsCD(ArrayList<ISong> songsCD) {
        this.songsCD = songsCD;
    }

    public ArrayList<ISong> getSongsMP3() {
        return songsMP3;
    }

    public void setSongsMP3(ArrayList<ISong> songsMP3) {
        this.songsMP3 = songsMP3;
    }

    public ArrayList<ISong> getSpotify() {
        return Spotify;
    }

    public void setSpotify(ArrayList<ISong> spotify) {
        Spotify = spotify;
    }

    public int getReproductionType() {
        return ReproductionType;
    }

    public void setReproductionType(int reproductionType) {
        ReproductionType = reproductionType;
    }

    public int getVolumeA() {
        return volume;
    }

    public void setVolumeA(int volume) {
        this.volume = volume;
    }

    public ArrayList<String> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<String> contactos) {
        this.contactos = contactos;
    }

    public int getActualIndex() {
        return actualIndex;
    }

    public void setActualIndex(int actualIndex) {
        this.actualIndex = actualIndex;
    }

    public boolean isInaCall() {
        return inaCall;
    }

    public void setInaCall(boolean inaCall) {
        this.inaCall = inaCall;
    }
}
