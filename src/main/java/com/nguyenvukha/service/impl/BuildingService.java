package com.nguyenvukha.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.nguyenvukha.model.BuildingModel;
import com.nguyenvukha.repository.IBuildingRepository;
import com.nguyenvukha.repository.entity.BuildingEntity;
import com.nguyenvukha.repository.impl.BuildingRepository;
import com.nguyenvukha.service.IBuildingService;

public class BuildingService implements IBuildingService {
	private IBuildingRepository buildingRespository;
	
	public BuildingService() {
		buildingRespository = new BuildingRepository();
	}
	
	@Override
	public List<BuildingModel> getAllBuilding(String name, int floorArena, int numberOfBasement, String street) {
		List<BuildingModel> results = new ArrayList<>();
		for(BuildingEntity bd : buildingRespository.getAllBuilding(name, floorArena, numberOfBasement, street)) {
			results.add(new BuildingModel(bd.getId(), bd.getName(), bd.getFloorArena(), 
											bd.getStreet(), bd.getNumberOfBasement(), convertTypes(bd.getTypes())));
		}
		return results;
	}
	
	private String convertTypes(String types) {
		StringBuilder result = new StringBuilder();
		
		int count = 0;
		if(types.indexOf("TANG_TRET") != -1) {
			result.append("Tầng trệt");
			count++;
		}
		if(types.indexOf("NGUYEN_CAN") != -1) {
			if(count > 0) result.append(", ");
			result.append("Nguyên căn");
			count++;
		}
		if(types.indexOf("NOI_THAT") != -1) {
			if(count > 0) result.append(", ");
			result.append("Nội thất");
		}
		return result.toString();
	}

}
