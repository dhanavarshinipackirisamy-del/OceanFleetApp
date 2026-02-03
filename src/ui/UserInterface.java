package ui;

import java.util.List;
import java.util.Scanner;

import model.Vessel;
import util.VesselUtil;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        // read number of vessels
        System.out.println("Enter the number of vessels to be added");
        int n = Integer.parseInt(sc.nextLine());

        // read vessel details
        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {

            // input format: id:name:speed:type
            String input = sc.nextLine();
            String[] data = input.split(":");

            // create vessel object
            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            // add to list
            util.addVesselPerformance(vessel);
        }

        // retrieve vessel by id
        System.out.println("Enter the Vessel Id to check speed");
        String searchId = sc.nextLine();

        Vessel result = util.getVesselById(searchId);

        if (result != null) {
            System.out.println(
                    result.getVesselId() + " | " +
                            result.getVesselName() + " | " +
                            result.getVesselType() + " | " +
                            result.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        // display high performance vessels
        System.out.println("High performance vessels are");
        List<Vessel> highList = util.getHighPerformanceVessels();

        for (Vessel v : highList) {
            System.out.println(
                    v.getVesselId() + " | " +
                            v.getVesselName() + " | " +
                            v.getVesselType() + " | " +
                            v.getAverageSpeed() + " knots"
            );
        }

        sc.close();
    }
}