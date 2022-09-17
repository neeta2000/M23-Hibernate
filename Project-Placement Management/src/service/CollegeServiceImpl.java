package service;

import dao.CollegeDao;
import dao.CollegeDaoImpl;
import entities.College;
import entities.Placement;

public class CollegeServiceImpl implements CollegeService{
	private CollegeDao  dao;

	
	public CollegeServiceImpl() {
		super();
		dao=new CollegeDaoImpl();
	}

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
		
	}

	@Override
	public College updateColleget(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
		
	}

	@Override
	public College searchCollege(int id) {
		College college=dao.searchCollege(id);
		return college;
		
		
	}

	@Override
	public boolean deletePlacement(int id) {
		dao.beginTransaction();
		boolean res=dao.deleteCollege(id);
		dao.commitTransaction();
		return res;
		
	}

	@Override
	public College schdulePlacement(Placement placement) {
	
		return null;
	}	
		

}
