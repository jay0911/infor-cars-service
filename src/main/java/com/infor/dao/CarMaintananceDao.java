package com.infor.dao;

import java.util.List;

import com.infor.dto.MaintenanceDTO;
import com.infor.models.InforCar;

public interface CarMaintananceDao {
	
	public void deleteCar(MaintenanceDTO dto);
	public void saveCar(InforCar inforCar);
	public void editCar(InforCar inforCar);
	public List<InforCar> selectCars(MaintenanceDTO dto);

	
}
