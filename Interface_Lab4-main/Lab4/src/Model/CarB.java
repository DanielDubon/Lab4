package Model;

import java.util.ArrayList;

public class CarB extends CarRadio implements ICarB{

    private String lastContact;




    public CarB(boolean isON, int volume, boolean radioMode, ArrayList<Radio> radios, ArrayList<Song> songs, String lastContact) {
        super(isON, volume, radioMode, radios, songs);
        this.lastContact = lastContact;
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
}
