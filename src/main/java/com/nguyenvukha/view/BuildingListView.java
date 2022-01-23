package com.nguyenvukha.view;

import com.nguyenvukha.controller.BuildingController;
import com.nguyenvukha.model.*;
import com.nguyenvukha.ultils.NumberUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BuildingListView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên tòa nhà: ");
		String name = sc.nextLine();
		System.out.print("Nhập diện tích sàn: ");
		int floorArena = NumberUtils.tryParseInt(sc.nextLine(), -1);
		System.out.print("Nhập số tầng hầm: ");
		int numberOfBasement = NumberUtils.tryParseInt(sc.nextLine(), -1);
		System.out.print("Nhập đường: ");
		String street = sc.nextLine();
		
		BuildingController buildingController = new BuildingController();
		
		System.out.println();
		for(BuildingModel buildingModel : buildingController.getAllBuilding(name, floorArena, numberOfBasement, street)) {
			System.out.println("--------------------------" + buildingModel.getName() + "--------------------------");
			System.out.println(buildingModel);
			System.out.println();
		}
	}
}
