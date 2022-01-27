package com.nguyenvukha.model.input;

public class BuildingSearchInput {
    private String name;
    private int floorArena;
    private String street;
    private int numberOfBasement;

    public BuildingSearchInput(String name, int floorArena, String street, int numberOfBasement) {
        super();
        this.name = name;
        this.floorArena = floorArena;
        this.street = street;
        this.numberOfBasement = numberOfBasement;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getFloorArena() {
        return floorArena;
    }
    public void setFloorArena(int floorArena) {
        this.floorArena = floorArena;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getNumberOfBasement() {
        return numberOfBasement;
    }
    public void setNumberOfBasement(int numberOfBasement) {
        this.numberOfBasement = numberOfBasement;
    }
}
