package com.nguyenvukha.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nguyenvukha.constant.SystemConstant;
import com.nguyenvukha.repository.IBuildingRepository;
import com.nguyenvukha.repository.entity.BuildingEntity;
import com.nguyenvukha.ultils.*;

public class BuildingRepository implements IBuildingRepository {

	@Override
	public List<BuildingEntity> getAllBuilding(String name, int floorArena, int numberOfBasement, String street) {
		List<BuildingEntity> results = new ArrayList<>();
		Connection conn = null;
		Statement sttm = null;
		ResultSet rs = null;
		String sql = createBuildingQuerySearch(name, floorArena, numberOfBasement, street);
		try {
			conn = ConnectionUtils.getConnection();
			sttm = conn.createStatement();
			rs = sttm.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String bdName = rs.getString("name");
				int bdFloorArena = rs.getInt("floorarena");
				String bdStreet = rs.getString("street");
				int bdNumberOfBasement = rs.getInt("numberofbasement");
				String types = rs.getString("types");
				results.add(new BuildingEntity(id, bdName, bdFloorArena, bdStreet, bdNumberOfBasement, types));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(sttm != null) {
				try {
					sttm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return results;
	}
	
	private String createBuildingQuerySearch(String name, int floorArena, int numberOfBasement, String street) {
		StringBuilder sql = new StringBuilder("SELECT * FROM building WHERE " + SystemConstant.WHERE_CONSTANT);
		if(!StringUtils.isNullOrEmpty(name)) {
			sql.append(" AND name LIKE '%"+ name +"%'");
		}
		if(!StringUtils.isNullOrEmpty(street)) {
			sql.append(" AND street LIKE '%"+ street +"%'");
		}
		if(!NumberUtils.isEmpty(floorArena)) {
			sql.append(" AND floorArena="+ floorArena +"");
		}
		if(!NumberUtils.isEmpty(numberOfBasement)) {
			sql.append(" AND numberOfBasement="+ numberOfBasement +"");
		}
		return sql.toString();
	}
}
