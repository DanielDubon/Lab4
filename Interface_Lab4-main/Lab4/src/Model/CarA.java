package Model;

import java.util.ArrayList;

public class CarA extends CarRadio implements ICarA{


    public CarA(boolean isON, int volume, boolean radioMode, ArrayList<Radio> radios, ArrayList<Song> songs) {
        super(isON, volume, radioMode, radios, songs);

    }

    @Override
    public boolean getSpeakerStatus() {


        return false;
    }

    @Override
    public boolean ChangeSpeakerStatus(boolean LastCalledContact) {
        return false;
    }

    @Override
    public String TripPlanification(String tripday, String tripHour_, String tripPlace, String tripLength, String tripObjective) {
        return null;
    }
}
