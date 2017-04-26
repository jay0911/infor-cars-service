package com.infor.dao;

import java.util.List;

import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.InforCar;

public interface CarMaintananceDao {
	
	public void deleteCar(UserMaintenanceDTO dto);
	public void saveCar(InforCar inforCar);
	public void editCar(InforCar inforCar);
	public List<InforCar> selectCars(UserMaintenanceDTO dto);

	
}
