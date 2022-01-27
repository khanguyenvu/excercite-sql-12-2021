package com.nguyenvukha.controller;

import java.util.List;

import com.nguyenvukha.model.*;
import com.nguyenvukha.model.input.BuildingSearchInput;
import com.nguyenvukha.model.output.BuildingSearchOutput;
import com.nguyenvukha.service.IBuildingService;
import com.nguyenvukha.service.impl.BuildingService;

public class BuildingController {
	private IBuildingService buildingService;
	
	public BuildingController() {
		buildingService = new BuildingService();
	}
	
	public List<BuildingSearchOutput> showAllBuilding(BuildingSearchInput input) {
		return buildingService.getAllBuilding(input.getName(), input.getFloorArena(), input.getNumberOfBasement(), input.getStreet());
	}
}
