import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String mname;
	private int yop;
	private String language;
	private double mrating;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getMrating() {
		return mrating;
	}

	public void setMrating(double mrating) {
		this.mrating = mrating;
	}

	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", yop=" + yop + ", language=" + language + ", mrating="
				+ mrating + "]";
	}

}
