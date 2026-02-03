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
    // returns vessel object for given vesselId
    public Vessel getVesselById(String vesselId) {

        // iterate through vessel list
        for (Vessel vessel : vesselList) {

            // case-sensitive comparison
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel; // vessel found
            }
        }

        // if no vessel matches
        return null;
    }
}
