package com.sarkarSiddhant.developer;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.key,HeavenlyBody>solarSystem=new HashMap<>();
    private static Set<HeavenlyBody>planets=new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody plant1=new Planet("Mercury",88.00);
        solarSystem.put(plant1.getKey(),plant1);
        planets.add(plant1);

        plant1=new Planet("Venus",88.00);
        solarSystem.put(plant1.getKey(),plant1);
        planets.add(plant1);

        plant1=new Planet("Earth",365.25);
        solarSystem.put(plant1.getKey(),plant1);
        planets.add(plant1);

        HeavenlyBody moon1=new Moon("Moon",24.00);
        solarSystem.put(moon1.getKey(),moon1);
        plant1.addSatellite(moon1);

        plant1=new Planet("Mars",365.25);
        solarSystem.put(plant1.getKey(),plant1);
        planets.add(plant1);

        moon1=new Moon("Demios",22.00);
        solarSystem.put(moon1.getKey(),moon1);
        plant1.addSatellite(moon1);
        moon1=new Moon("Phobos",42.00);
        solarSystem.put(moon1.getKey(),moon1);
        plant1.addSatellite(moon1);


        plant1=new Planet("Mars",365.25);
        solarSystem.put(plant1.getKey(),plant1);
        planets.add(plant1);

        printSet(planets);
        System.out.println("Adding the duplicate of Earth");

        plant1=new Planet("Earth",720.543);
        solarSystem.put(plant1.getKey(),plant1);
        planets.add(plant1);
        System.out.println(solarSystem.get(HeavenlyBody.generateKey("Earth",HeavenlyBody.BodyTypes.PLANET)).toString());
    }

    public static void printSet(Set<HeavenlyBody>planets){
        for (HeavenlyBody planet :planets) {
            System.out.println(planet.toString());
            if (planet.getSatellites().isEmpty()==false){
                System.out.println("\tPrinting the list of Moons For Planet : "+planet.getKey().getName());
                for (HeavenlyBody temp:planet.getSatellites()){
                    System.out.println("\t\t"+temp.toString());
                }
            }
        }
    }

}
