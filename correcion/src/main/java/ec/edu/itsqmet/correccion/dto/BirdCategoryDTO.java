package ec.edu.itsqmet.correccion.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "bird_category")

public class BirdCategoryDTO {

	public Integer getPK() {
		return PK;
	}
	public void setPK(Integer pK) {
		PK = pK;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Id
	private Integer PK;
	private String name;
}
