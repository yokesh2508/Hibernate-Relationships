package RelationMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Engine {
	@Id
	private String eno;
	private String type;
	private String cc;

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [eno=" + eno + ", type=" + type + ", cc=" + cc + "]";
	}

}
