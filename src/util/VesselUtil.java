package util;

import java.util.ArrayList;
import java.util.List;
import model.Vessel;

public class VesselUtil {

    // stores all vessel objects
    private List<Vessel> vesselList = new ArrayList<>();

    // adds a vessel to the list
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // returns the list when needed
    public List<Vessel> getVesselList() {
        return vesselList;
    }
}