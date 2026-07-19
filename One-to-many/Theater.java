import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Theater {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String tname;
	private String tloc;
	private int noOfScreens;
	private int seatCapacity;
	private double trating;

	@OneToMany
	private List<Movie> movies;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTloc() {
		return tloc;
	}

	public void setTloc(String tloc) {
		this.tloc = tloc;
	}

	public int getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(int noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public double getTrating() {
		return trating;
	}

	public void setTrating(double trating) {
		this.trating = trating;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Theater [tid=" + tid + ", tname=" + tname + ", tloc=" + tloc + ", noOfScreens=" + noOfScreens
				+ ", seatCapacity=" + seatCapacity + ", trating=" + trating + ", movies=" + movies + "]";
	}

}
