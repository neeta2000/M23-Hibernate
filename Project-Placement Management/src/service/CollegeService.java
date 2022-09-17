package service;

import entities.College;
import entities.Placement;

public interface CollegeService {
	public abstract College addCollege(College college);
	public abstract College updateColleget(College college);
	public abstract College searchCollege(int id);
	public abstract boolean deletePlacement(int id);
	public abstract College schdulePlacement(Placement placement);

}
