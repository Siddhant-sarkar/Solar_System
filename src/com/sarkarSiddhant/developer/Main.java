package com.sarkarSiddhant.developer;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,HeavenlyBody>solarSystem=new HashMap<>();
    private static Set<HeavenlyBody>planets=new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody plant1=new HeavenlyBody("Mercury",88.00);
        solarSystem.put(plant1.getName(),plant1);
        planets.add(plant1);

        plant1=new HeavenlyBody("Venus",88.00);
        solarSystem.put(plant1.getName(),plant1);
        planets.add(plant1);

        plant1=new HeavenlyBody("Earth",365.25);
        solarSystem.put(plant1.getName(),plant1);
        planets.add(plant1);

        HeavenlyBody moon1=new HeavenlyBody("Moon",24.00);
        solarSystem.put(moon1.getName(),moon1);
        plant1.addMoon(moon1);

        plant1=new HeavenlyBody("Mars",365.25);
        solarSystem.put(plant1.getName(),plant1);
        planets.add(plant1);

        moon1=new HeavenlyBody("MarsMoon_1",22.00);
        solarSystem.put(moon1.getName(),moon1);
        plant1.addMoon(moon1);
        moon1=new HeavenlyBody("MarsMoon_2",42.00);
        solarSystem.put(moon1.getName(),moon1);
        plant1.addMoon(moon1);


        System.out.println("Planets are as follows :");
        for (HeavenlyBody Planets:planets) {
            System.out.println("\t"+Planets.getName());
        }
        HeavenlyBody tempBody=solarSystem.get("Earth");
        System.out.println("Now printing the moons Of planets"+tempBody.getName());
        for (HeavenlyBody moons :tempBody.getSatellites()){
            System.out.println("\t"+moons.getName());
        }

        Set<HeavenlyBody>allMoons=new HashSet<>();
        for (HeavenlyBody temp:planets){
            allMoons.addAll(temp.getSatellites());
        }
        System.out.println("All the Moons are ");
        for (HeavenlyBody temp:allMoons) {
            System.out.println("\t"+temp.getName());
        }

        plant1=new HeavenlyBody("Mars",365.25);
        solarSystem.put(plant1.getName(),plant1);
        planets.add(plant1);

        System.out.println("Planets are as follows :");
        for (HeavenlyBody Planets:planets) {
            System.out.println("\t"+Planets.getName());
        }
        
    }
}
