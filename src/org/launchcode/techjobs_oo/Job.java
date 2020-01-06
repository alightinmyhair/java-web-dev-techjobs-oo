package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    // DONE WITH TO-DO

    public Job (){
        this.id = nextId;
        nextId++;
    }

    //initializing here
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.
    //DONE WITH TO-DO

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // DONE WITH TO-DO

    @Override
    public String toString(){
        if(name == null){
            return "OOPS! This job does not seem to exist.";
        }
        String aName = name;
        String aEmployer = employer.getValue();
        String aLocation = location.getValue();
        String aPositionType = positionType.getValue();
        String aCoreCompetency = coreCompetency.getValue();

        if(aName.equals("")){
            aName = "Data not available";
        }
        if(aEmployer.equals("")){
            aEmployer ="Data not available";
        }
        if(aLocation.equals("")){
            aLocation ="Data not available";
        }
        if (aPositionType.equals("")) {
            aPositionType="Data not available";
        }
        if(aCoreCompetency.equals("")){
            aCoreCompetency="Data not available";
        }
        return "\n" + "ID: "+ id + "\n"+
                "Name: " + aName + "\n" +
                "Employer: " + aEmployer + "\n" +
                "Location: " + aLocation + "\n" +
                "Position type: " + aPositionType + "\n" +
                "Core Competency: " + aCoreCompetency + "\n";
    }
}
