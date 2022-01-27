package com.nguyenvukha.view;

import com.nguyenvukha.controller.BuildingController;
import com.nguyenvukha.model.input.BuildingSearchInput;
import com.nguyenvukha.model.output.BuildingSearchOutput;
import com.nguyenvukha.ultils.NumberUtils;

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
		BuildingSearchInput input = new BuildingSearchInput(name, floorArena, street, numberOfBasement);
		List<BuildingSearchOutput> buildings = buildingController.showAllBuilding(input);

		System.out.println();
		for(BuildingSearchOutput building : buildings) {
			System.out.println("--------------------------" + building.getName() + "--------------------------");
			System.out.println("Tên tòa nhà: " + building.getName());
			System.out.println("Diện tích sàn: " + building.getFloorArena());
			System.out.println("Số tầng hầm: " + building.getNumberOfBasement());
			System.out.println("Đường: " + building.getStreet());
			System.out.println("Loại tòa nhà: " + building.getTypes());
		}
	}
}
