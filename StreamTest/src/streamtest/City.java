package streamtest;


public class City implements Comparable  {
	private int id;
	private String name;
	private int population;
	private String countryCode;

	public City() {
	}

	public City(int id, String name, String countryCode, int population) {
		this.id = id;
		this.name = name;
		this.population = population;
		this.countryCode = countryCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population="
				+ population + ", countryCode=" + countryCode + "]";
	};

    public int compare(City c) {
         if (this.getPopulation()> c.getPopulation())
             return 1;
         if (this.getPopulation()< c.getPopulation())
             return -1;
         else
             return 0;
         
    }

    @Override
    public int compareTo(Object c) {
         
         if (this.getPopulation()> ((City)c).getPopulation())
             return 1;
         if (this.getPopulation()< ((City)c).getPopulation())
             return -1;
         else
             return 0;
    }

}
