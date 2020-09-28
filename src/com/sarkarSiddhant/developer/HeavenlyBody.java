package com.sarkarSiddhant.developer;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final key key;
    private final Double orbitalPeriod;
    private final Set<HeavenlyBody>satellites;


    public enum BodyTypes{
        PLANET,
        MOON,
    }

    public HeavenlyBody(String name, Double orbitalPeriod,BodyTypes bodyType) {
        this.key=new key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
        satellites=new HashSet<>();

    }
    public boolean addSatellite(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public key getKey() {
        return key;
    }

    public static HeavenlyBody.key generateKey (String name, BodyTypes bodyTypes){
        return new key(name,bodyTypes);
    }

    @Override
    public final boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o instanceof HeavenlyBody){
            HeavenlyBody temp= (HeavenlyBody) o;
            return temp.key.equals(temp.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return "Name : "+this.key.getName()+" || Type : "+key.getBodyTypes()+" || Orbital Period : "+this.getOrbitalPeriod();
    }

    public static final class key {
        private String Name;
        private BodyTypes bodyTypes;

        public key(String name,BodyTypes bodyTypes) {
            Name = name;
            this.bodyTypes=bodyTypes;
        }

        public String getName() {
            return Name;
        }

        public BodyTypes getBodyTypes() {
            return bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.Name.hashCode()+56+this.bodyTypes.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            if (this.Name==((key)obj).getName()){
                if (this.bodyTypes==((key) obj).getBodyTypes()){
                    return true;

                }
            }
            return false;
        }
    }
}
