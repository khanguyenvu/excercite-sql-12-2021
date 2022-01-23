package com.nguyenvukha.model;

public class BuildingModel {
	private int id;
	private String name;
	private int floorArena;
	private String street;
	private int numberOfBasement;
	private String types;
	
	public BuildingModel(int id, String name, int floorArena, String street, int numberOfBasement, String types) {
		super();
		this.id = id;
		this.name = name;
		this.floorArena = floorArena;
		this.street = street;
		this.numberOfBasement = numberOfBasement;
		this.types = types;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}

	@Override
	public String toString() {
		String str = "Tên tòa nhà: " + this.name + "\nDiện tích sàn: " + this.floorArena + 
						"\nĐường: " + this.street + "\nSố tầng hầm: " + this.numberOfBasement + "\nLoại: " + this.types;
		return str;
	}
}
