package io.github.heisid.solarsystemcheatsheet;

import java.util.ArrayList;

public class SolarSystemObjectsData {
    private static String[] objectNames = {
            "Sun",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune",
            "Earth",
            "Venus",
            "Mars"
    };

    private static String[] objectShortDetails = {
            "The Sun is the star at the center of the Solar System. It is a nearly perfect sphere of hot plasma, with internal convective motion that generates a magnetic field via a dynamo process.",
            "Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a gas giant with a mass one-thousandth that of the Sun, but two-and-a-half times that of all the other planets in the Solar System combined.",
            "Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius about nine times that of Earth.",
            "Uranus (from the Latin name Ūranus for the Greek god Οὐρανός) is the seventh planet from the Sun. It has the third-largest planetary radius and fourth-largest planetary mass in the Solar System.",
            "Neptune is the eighth and farthest known planet from the Sun in the Solar System. In the Solar System, it is the fourth-largest planet by diameter, the third-most-massive planet, and the densest giant planet.",
            "Earth is the third planet from the Sun and the only astronomical object known to harbor life. According to radiometric dating and other sources of evidence, Earth formed over 4.5 billion years ago.",
            "Venus is the second planet from the Sun. It is named after the Roman goddess of love and beauty. As the second-brightest natural object in the night sky after the Moon, Venus can cast shadows and, rarely, is visible to the naked eye in broad daylight.",
            "Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System after Mercury. In English, Mars carries a name of the Roman god of war and is often referred to as the \'Red Planet\'."
    };

    // aphelion(km), perihelion(km), orbital period(d), radius(km), mass(kg), surface gravity(m/s2), rotation period(h)
    private static Double[][] objectDetails = {
            // sun
            {null, null, null, 695700.0 ,1.9885e30 ,247.0 ,601.2},
            // jupiter
            {8.1662e8, 7.4052e8, 4332.59, 69911.0, 1.8982e27, 24.79, 9.925},
            // saturn
            {1.5145e9, 1.3255e9, 10759.22, 58232.0, 5.6834e26, 10.44, 10.5},
            // uranus
            {3.008e9, 2.742e9, 30688.5, 25362.0, 8.681e25, 8.69, 17.25},
            // neptune
            {4.54e9, 4.46e9, 60182.0, 24622.0, 11.15, 16.11},
            // earth
            {1.521e8, 1.47e8, 365.25, 6371.0, 5.972e24, 9.807, 23.76},
            // venus
            {1.089e8, 1.0747e8, 224.701, 6051.8, 4.8675e24, 8.87, -5832.6},
            // mars
            {2.492e8, 2.067e8, 686.971, 3389.5, 6.417e23, 3.72, 24.6}
    };

    private static int[] objectPics = {
            R.drawable.sun,
            R.drawable.jupiter,
            R.drawable.saturn,
            R.drawable.uranus,
            R.drawable.neptune,
            R.drawable.earth,
            R.drawable.venus,
            R.drawable.mars
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
