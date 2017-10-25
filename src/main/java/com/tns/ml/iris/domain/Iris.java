package com.tns.ml.iris.domain;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "flowers")
public class Iris {

	@Id
	@Column(name = "database_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FLOWERSEQ")
	@SequenceGenerator(name = "FLOWERSEQ", sequenceName = "flowerseq", allocationSize = 50)
	private Long id;

	@Column(name = "petal_pength")
	private Double petalLength;

	@Column(name = "petal_width")
	private Double petalWidth;

	@Column(name = "sepal_length")
	private Double sepalLength;

	@Column(name = "sepal_width")
	private Double sepalWidth;

	@Column(name = "class")
	private String category;

	public Iris() {
		super();
	}

	public Iris(Double petalLength, Double petalWidth, Double sepalLength, Double sepalWidth, String category) {
		super();
		this.petalLength = petalLength;
		this.petalWidth = petalWidth;
		this.sepalLength = sepalLength;
		this.sepalWidth = sepalWidth;
		this.category = category;
	}

	public Double getPetalLength() {
		return petalLength;
	}

	public void setPetalLength(Double petalLength) {
		this.petalLength = petalLength;
	}

	public Double getPetalWidth() {
		return petalWidth;
	}

	public void setPetalWidth(Double petalWidth) {
		this.petalWidth = petalWidth;
	}

	public Double getSepalLength() {
		return sepalLength;
	}

	public void setSepalLength(Double sepalLength) {
		this.sepalLength = sepalLength;
	}

	public Double getSepalWidth() {
		return sepalWidth;
	}

	public void setSepalWidth(Double sepalWidth) {
		this.sepalWidth = sepalWidth;
	}

	public Optional<String> getCategory() {
		return Optional.ofNullable(this.category);
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(petalLength);
		builder.append(",");
		builder.append(petalWidth);
		builder.append(",");
		builder.append(sepalLength);
		builder.append(",");
		builder.append(sepalWidth);
		builder.append(",");
		builder.append(category);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((petalLength == null) ? 0 : petalLength.hashCode());
		result = prime * result + ((petalWidth == null) ? 0 : petalWidth.hashCode());
		result = prime * result + ((sepalLength == null) ? 0 : sepalLength.hashCode());
		result = prime * result + ((sepalWidth == null) ? 0 : sepalWidth.hashCode());
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
		Iris other = (Iris) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (petalLength == null) {
			if (other.petalLength != null)
				return false;
		} else if (!petalLength.equals(other.petalLength))
			return false;
		if (petalWidth == null) {
			if (other.petalWidth != null)
				return false;
		} else if (!petalWidth.equals(other.petalWidth))
			return false;
		if (sepalLength == null) {
			if (other.sepalLength != null)
				return false;
		} else if (!sepalLength.equals(other.sepalLength))
			return false;
		if (sepalWidth == null) {
			if (other.sepalWidth != null)
				return false;
		} else if (!sepalWidth.equals(other.sepalWidth))
			return false;
		return true;
	}

}
