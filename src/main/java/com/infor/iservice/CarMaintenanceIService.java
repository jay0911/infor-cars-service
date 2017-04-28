package com.infor.iservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infor.dao.CarMaintananceDao;
import com.infor.dto.MaintenanceDTO;
import com.infor.models.InforCar;
import com.infor.models.InforUser;
import com.infor.service.CarMaintenanceService;
/**
 * 
 * @author joliveros
 * @see InforUser
 * @since 1.0
 */
@Service
public class CarMaintenanceIService implements CarMaintenanceService{
	
	@Autowired
	private CarMaintananceDao md;

	@Override
	public void deleteCar(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		md.deleteCar(dto);
	}

	@Override
	public void saveCar(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		InforCar inforCar = new InforCar();
		inforCar.setCarbrand(dto.getCarbrand());
		inforCar.setCarcolor(dto.getCarcolor());
		inforCar.setCarplatenumber(dto.getCarplatenumber());
		inforCar.setUserid(dto.getUserid());
		md.saveCar(inforCar);
	}

	@Override
	public void editCar(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		InforCar inforCar = new InforCar();
		inforCar.setCarbrand(dto.getCarbrand());
		inforCar.setCarcolor(dto.getCarcolor());
		inforCar.setCarplatenumber(dto.getCarplatenumber());
		md.editCar(inforCar);
	}

	@Override
	public List<InforCar> selectCars(MaintenanceDTO dto) {
		// TODO Auto-generated method stub
		return md.selectCars(dto);
	}

}
