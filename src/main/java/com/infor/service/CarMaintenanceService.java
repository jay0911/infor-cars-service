package com.infor.service;

import java.util.List;

import com.infor.dto.MaintenanceDTO;
import com.infor.models.InforCar;

public interface CarMaintenanceService {

	public void deleteCar(MaintenanceDTO dto);
	public void saveCar(MaintenanceDTO dto);
	public void editCar(MaintenanceDTO dto);
	public List<InforCar> selectCars(MaintenanceDTO dto);
	
}	
