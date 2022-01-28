package com.nguyenvukha.ultils;

import com.nguyenvukha.constant.BuildingTypeConstant;

import java.util.HashMap;
import java.util.Map;

public class BuildingTypeUtils {
    public static String getBuildingType(String type) {
        Map<String, String> map = new HashMap<>();
        map.put(BuildingTypeConstant.NGUYEN_CAN, BuildingTypeConstant.NGUYEN_CAN_VAL);
        map.put(BuildingTypeConstant.NOI_THAT, BuildingTypeConstant.NOI_THAT_VAL);
        map.put(BuildingTypeConstant.TANG_TRET, BuildingTypeConstant.NOI_THAT_VAL);
        return map.get(type);
    }
}
