package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Building {
	@Id
	private long BuildingID;
	private String Building_Address;
	enum BuildingType{
		office,
		Retail,
		Residence,
		Warehouse
	}
	@Enumerated(EnumType.STRING)
	private BuildingType buildingType;
	private int QualityLevel; 
	private int Status;
	@OneToMany(mappedBy = "building")
	private List<Assignment>workAssignment;
	public Building() {
		// TODO Auto-generated constructor stub
	}
	public Building(long building_ID, String building_Address, BuildingType buildingType, int qlty_Level, int status) {
		super();
		BuildingID = building_ID;
		Building_Address = building_Address;
		this.buildingType = buildingType;
		QualityLevel = qlty_Level;
		Status = status;
	}
	public long getBuilding_ID() {
		return BuildingID;
	}
	public void setBuilding_ID(long building_ID) {
		BuildingID = building_ID;
	}
	public String getBuilding_Address() {
		return Building_Address;
	}
	public void setBuilding_Address(String building_Address) {
		Building_Address = building_Address;
	}
	public BuildingType getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(BuildingType buildingType) {
		this.buildingType = buildingType;
	}
	public int getQlty_Level() {
		return QualityLevel;
	}
	public void setQlty_Level(int qlty_Level) {
		QualityLevel = qlty_Level;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	
}
