package com.sarkarSiddhant.developer;

public class Planet extends HeavenlyBody {
    public Planet(String name, Double orbitalPeriod) {
        super(name, orbitalPeriod,BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getKey().getBodyTypes()==BodyTypes.MOON){
            return super.addSatellite(moon);
        }
        return false;
    }
}
