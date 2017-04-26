package com.infor.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.AjaxResponseBody;
import com.infor.service.CarMaintenanceService;

@RestController
public class CarMaintenanceEndpoint {

	@Autowired
	private CarMaintenanceService s;

	@PostMapping("/savecar")
	public AjaxResponseBody savecar(@RequestBody UserMaintenanceDTO dto){
		AjaxResponseBody response = new AjaxResponseBody();
		try{
			s.saveCar(dto);
			response.setMsg("success");
			response.setCode("200");
		}catch(Exception e){
			response.setMsg("failed");
			response.setCode("400");
		}
		return response;
	}
	
	@PostMapping("/editcar")
	public AjaxResponseBody editcar(@RequestBody UserMaintenanceDTO dto){
		AjaxResponseBody response = new AjaxResponseBody();
		try{
			s.editCar(dto);
			response.setMsg("success");
			response.setCode("200");
		}catch(Exception e){
			response.setMsg("failed");
			response.setCode("400");
		}
		return response;
	}
	
	@PostMapping("/deletecar")
	public AjaxResponseBody deletecar(@RequestBody UserMaintenanceDTO dto){
		AjaxResponseBody response = new AjaxResponseBody();
		try{
			s.deleteCar(dto);
			response.setMsg("success");
			response.setCode("200");
		}catch(Exception e){
			response.setMsg("failed");
			response.setCode("400");
		}
		return response;
	}
	
	@PostMapping("/selectcar")
	public UserMaintenanceDTO selectcar(@RequestBody UserMaintenanceDTO dto){
		UserMaintenanceDTO returndto = new UserMaintenanceDTO();
		returndto.setInforCars(s.selectCars(dto));
		return returndto;
	}
	
}
