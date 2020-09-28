package com.sarkarSiddhant.developer;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String Name;
    private final Double orbitalPeriod;
    private final Set<HeavenlyBody>satellites;

    public HeavenlyBody(String name, Double orbitalPeriod) {
        Name = name;
        this.orbitalPeriod = orbitalPeriod;
        satellites=new HashSet<>();

    }
    public boolean addMoon(HeavenlyBody moon){
        this.satellites.add(moon);
        return true;
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
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o==null||this.getClass()!=o.getClass()){
            return false;
        }else{
            String name=((HeavenlyBody) o).getName();
            return name.equals(this.getName());
        }
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode()+10;
    }


}
