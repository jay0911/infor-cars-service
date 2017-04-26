package com.infor.service;

import java.util.List;

import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.InforCar;

public interface CarMaintenanceService {

	public void deleteCar(UserMaintenanceDTO dto);
	public void saveCar(UserMaintenanceDTO dto);
	public void editCar(UserMaintenanceDTO dto);
	public List<InforCar> selectCars(UserMaintenanceDTO dto);
	
}	
