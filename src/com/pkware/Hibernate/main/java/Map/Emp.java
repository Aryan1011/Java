package Map;

import java.util.List;

import javax.persistence.*;

@Entity
public class Emp {
	@Id
	private int eid;
	private String ename;

	@ManyToMany
//	JoinTable(name="New Table Name", joinColumns={}, inverseJoinColoumns={})
//	To change name of join table and its columns 
	private List<Project> projects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Emp(int eid, String ename, List<Project> projects) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.projects = projects;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


}
