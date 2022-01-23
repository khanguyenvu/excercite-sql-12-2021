package com.nguyenvukha.repository;

import java.util.List;

import com.nguyenvukha.repository.entity.BuildingEntity;

public interface IBuildingRepository {
	List<BuildingEntity> getAllBuilding(String name, int floorArena, int numberOfBasement, String street);
}
