package test190419.exam18;

public class CityDTO {
	private String name;
	private String contryCode;
	private String dist;
	private String pop;
	
	public CityDTO() {}
	
	public CityDTO(String name, String contryCode, String dist, String pop) {
		this.name = name;
		this.contryCode = contryCode;
		this.dist = dist;
		this.pop = pop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContryCode() {
		return contryCode;
	}

	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getPop() {
		return pop;
	}

	public void setPop(String pop) {
		this.pop = pop;
	}

	@Override
	public String toString() {
		return "CityDTO [name=" + name + ", contryCode=" + contryCode + ", dist=" + dist + ", pop=" + pop + "]";
	}
	
}
