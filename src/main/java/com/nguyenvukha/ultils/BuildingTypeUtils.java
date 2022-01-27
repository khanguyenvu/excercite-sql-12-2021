package com.nguyenvukha.ultils;

import com.nguyenvukha.constant.BuildingTypeConstant;

import java.util.HashMap;
import java.util.Map;

public class BuildingTypeUtils {
    public static String getBuildingType(String type) {
        Map<String, String> map = new HashMap<>();
        map.put(BuildingTypeConstant.NGUYEN_CAN, "Nguyên căn");
        map.put(BuildingTypeConstant.NOI_THAT, "Nội thất");
        map.put(BuildingTypeConstant.TANG_TRET, "Tầng trệt");
        return map.get(type);
    }
}
