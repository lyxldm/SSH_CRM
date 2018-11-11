package cn.ldm.bean;

public class mes {
	private Integer id;
	private String mes;
	private People people;
	
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	@Override
	public String toString() {
		return "mes [id=" + id + ", mes=" + mes + ", people=" + people + "]";
	}
	
}
