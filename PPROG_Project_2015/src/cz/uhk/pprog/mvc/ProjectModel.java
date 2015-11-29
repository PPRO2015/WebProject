package cz.uhk.pprog.mvc;

public class ProjectModel {
    private String team;
    private String name;
    private String workHour;
    private String workHourUntil;

	public String getWorkHourUntil() {
		return workHourUntil;
	}

	public void setWorkHourUntil(String workHourUntil) {
		this.workHourUntil = workHourUntil;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkHour() {
		return workHour;
	}

	public void setWorkHour(String workHour) {
		this.workHour = workHour;
	}  


}
