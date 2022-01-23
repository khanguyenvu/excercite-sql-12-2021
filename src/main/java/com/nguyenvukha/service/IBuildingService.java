package com.nguyenvukha.service;

import java.util.List;

import com.nguyenvukha.model.*;
import com.nguyenvukha.repository.entity.BuildingEntity;

public interface IBuildingService {
	List<BuildingModel> getAllBuilding(String name, int floorArena, int numberOfBasement, String street);
}
