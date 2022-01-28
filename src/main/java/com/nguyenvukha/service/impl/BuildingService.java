package com.nguyenvukha.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.nguyenvukha.constant.BuildingTypeConstant;
import com.nguyenvukha.model.output.BuildingSearchOutput;
import com.nguyenvukha.repository.IBuildingRepository;
import com.nguyenvukha.repository.entity.BuildingEntity;
import com.nguyenvukha.repository.impl.BuildingRepository;
import com.nguyenvukha.service.IBuildingService;
import com.nguyenvukha.ultils.BuildingTypeUtils;

public class BuildingService implements IBuildingService {
	private IBuildingRepository buildingRespository;
	
	public BuildingService() {
		buildingRespository = new BuildingRepository();
	}
	
	@Override
	public List<BuildingSearchOutput> getAllBuilding(String name, int floorArena, int numberOfBasement, String street) {
		List<BuildingSearchOutput> results = new ArrayList<>();
		for(BuildingEntity bd : buildingRespository.getAllBuilding(name, floorArena, numberOfBasement, street)) {
			results.add(new BuildingSearchOutput(bd.getId(), bd.getName(), bd.getFloorArena(),
											bd.getStreet(), bd.getNumberOfBasement(), convertTypes(bd.getTypes())));
		}
		return results;
	}
	
	private String convertTypes(String types) {
		StringBuilder result = new StringBuilder();
		String[] arr = types.split(",");
		for(String type : arr) {
			result.append(BuildingTypeUtils.getBuildingType(type) + ", ");
		}
		if(arr.length > 0) {
			result.deleteCharAt(result.length() - 2);
		}
		return result.toString();
	}

}
