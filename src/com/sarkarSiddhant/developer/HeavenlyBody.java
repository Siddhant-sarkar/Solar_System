package com.sarkarSiddhant.developer;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

public  class HeavenlyBody {
    private final String Name;
    private final Double orbitalPeriod;
    private final Set<HeavenlyBody>satellites;
    private static BodyTypes bodyType;

    public enum BodyTypes{

        PLANET,
        MOON,
    }

    public static void setBodyType(BodyTypes bodyType) {
        HeavenlyBody.bodyType = bodyType;
    }

    public HeavenlyBody(String name, Double orbitalPeriod,BodyTypes bodyType) {
        Name = name;
        this.orbitalPeriod = orbitalPeriod;
        satellites=new HashSet<>();
        this.bodyType=bodyType;
    }
    public boolean addSatellite(HeavenlyBody moon){

        return this.satellites.add(moon);
    }
    public String getName() {
        return Name;
    }
    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public static BodyTypes getBodyType() {
        return bodyType;
    }

    @Override
    public final boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o instanceof HeavenlyBody){
            HeavenlyBody temp= (HeavenlyBody) o;
            if (this.getName().equals(temp.getName())){
                return this.bodyType==temp.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.getName().hashCode()+10+this.bodyType.hashCode();
    }

    @Override
    public String toString() {
        return "Name : "+this.getName()+" || Type : "+getBodyType()+" || Orbital Period : "+this.getOrbitalPeriod();
    }
}
