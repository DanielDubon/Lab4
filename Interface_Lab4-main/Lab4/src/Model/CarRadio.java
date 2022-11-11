package Model;

import java.util.ArrayList;

public abstract class CarRadio {

    private boolean isON;
    private int volume;
    private boolean RadioMode;
    private ArrayList<Radio> radios = new ArrayList<>();
    private ArrayList<Song> songs = new ArrayList<>();

    public CarRadio(boolean isON, int volume, boolean radioMode, ArrayList<Radio> radios, ArrayList<Song> songs){
        this.isON = isON;
        this.volume = volume;
        this.RadioMode = radioMode;
        this.radios = radios;
        this.songs = songs;

    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isRadioMode() {
        return RadioMode;
    }

    public void setRadioMode(boolean radioMode) {
        RadioMode = radioMode;
    }

    public ArrayList<Radio> getRadios() {
        return radios;
    }

    public void setRadios(ArrayList<Radio> radios) {
        this.radios = radios;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
