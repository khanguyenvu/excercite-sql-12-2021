package com.nguyenvukha.controller;

import java.util.List;

import com.nguyenvukha.model.*;
import com.nguyenvukha.service.IBuildingService;
import com.nguyenvukha.service.impl.BuildingService;

public class BuildingController {
	private IBuildingService buildingService;
	
	public BuildingController() {
		buildingService = new BuildingService();
	}
	
	public List<BuildingModel> getAllBuilding(String name, int floorArena, int numberOfBasement, String street) {
		return buildingService.getAllBuilding(name, floorArena, numberOfBasement, street);
	}
}
