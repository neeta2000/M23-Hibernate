package service;

import dao.PlacementDaoImpl;
import entities.Placement;

public class PlacementServiceImpl implements PlacementService{
	
	private PlacementDaoImpl  dao;
	
	public PlacementServiceImpl() {
		super();
		dao=new PlacementDaoImpl();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return null;
	}
	
	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return null;
	}
	
	@Override
	public Placement searchPlacement(int id) {
		Placement placement=dao.searchPlacement(id);
		return placement;
	}
	
	@Override
	public boolean cancelPlacement(int id) {

		dao.beginTransaction();
		boolean res1 = dao.cancelPlacement(id);
		dao.commitTransaction();
		return res1;
	}
		
		

}
