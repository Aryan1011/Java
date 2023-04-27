package Map;

import java.util.List;

import javax.persistence.*;

@Entity
public class Project {
	@Id
	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String pname;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> emps;
	public Project(int pid, String pname, List<Emp> emps) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emps = emps;
	}

}
