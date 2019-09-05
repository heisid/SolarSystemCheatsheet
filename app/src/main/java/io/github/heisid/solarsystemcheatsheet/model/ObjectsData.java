package io.github.heisid.solarsystemcheatsheet.model;

import java.util.ArrayList;

import io.github.heisid.solarsystemcheatsheet.R;

public class ObjectsData {
    private static String[] objectNames = {
            "Sun",
            "Jupiter",
            "Saturn"
    };

    private static String[] objectShortDetails = {
            "The Sun is the star at the center of the Solar System. It is a nearly perfect sphere of hot plasma, with internal convective motion that generates a magnetic field via a dynamo process.",
            "Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a gas giant with a mass one-thousandth that of the Sun, but two-and-a-half times that of all the other planets in the Solar System combined.",
            "Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius about nine times that of Earth."
    };

    private static int[] objectPics = {
            R.drawable.sun,
            R.drawable.jupiter,
            R.drawable.saturn
    };

    static ArrayList<SolarSystemObject> getListData() {
        ArrayList<SolarSystemObject> l = new ArrayList<>();
        for (int i = 0; i < objectNames.length; i++) {
            SolarSystemObject ssobj = new SolarSystemObject();
            ssobj.setName(objectNames[i]);
            ssobj.setShortDetail(objectShortDetails[i]);
            ssobj.setPic(objectPics[i]);
            l.add(ssobj);
        }
        return l;
    }
}
