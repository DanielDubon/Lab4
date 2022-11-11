package Model;

import java.util.ArrayList;

public class CarA extends CarRadio implements ICarA{

    private boolean speakerStatus;


    public CarA(boolean isON, int volume, boolean radioMode, ArrayList<Radio> radios, ArrayList<Song> songs, boolean speakerStatus) {
        super(isON, volume, radioMode, radios, songs);
        this.speakerStatus = speakerStatus;

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


}
