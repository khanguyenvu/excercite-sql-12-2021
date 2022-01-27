package com.nguyenvukha.service;

import java.util.List;

import com.nguyenvukha.model.output.BuildingSearchOutput;

public interface IBuildingService {
	List<BuildingSearchOutput> getAllBuilding(String name, int floorArena, int numberOfBasement, String street);
}
