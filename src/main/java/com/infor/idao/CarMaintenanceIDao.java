package com.infor.idao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import com.infor.dao.CarMaintananceDao;
import com.infor.dto.UserMaintenanceDTO;
import com.infor.models.InforCar;

@Repository
@Transactional
public class CarMaintenanceIDao extends HibernateDaoSupport implements CarMaintananceDao{


	private static final String USERCAR_MODIFY_HQL = "update InforCar set carbrand=:carbrand, carcolor=:carcolor where carplatenumber=:carplatenumber";
	private static final String USERCAR_DELETE_HQL = "delete from InforCar where carplatenumber=:carplatenumber";
	
	private static final String CAR_FETCH_HQL = "from InforCar where userid=:userid";
	


	@Override
	public void deleteCar(UserMaintenanceDTO dto) {
		// TODO Auto-generated method stub
		Query query = getSessionFactory().createQuery(USERCAR_DELETE_HQL);
	    query.setParameter("carplatenumber", dto.getCarplatenumber());
	    int deleted = query.executeUpdate();
	    System.out.println("Deleted: " + deleted + " Cars(s)");
	}

	@Override
	public void saveCar(InforCar inforCar) {
		// TODO Auto-generated method stub
		getSessionFactory().save(inforCar);
	}

	@Override
	public void editCar(InforCar inforCar) {
		// TODO Auto-generated method stub
		Query q= getSessionFactory().createQuery(USERCAR_MODIFY_HQL);
		q.setParameter("carbrand", inforCar.getCarbrand());
		q.setParameter("carcolor", inforCar.getCarcolor());
		q.setParameter("carplatenumber", inforCar.getCarplatenumber());
		q.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InforCar> selectCars(UserMaintenanceDTO dto) {
		// TODO Auto-generated method stub
		return customSelectQuery(CAR_FETCH_HQL)
				.setParameter("userid", dto.getUserid())
				.list();
	}
}
