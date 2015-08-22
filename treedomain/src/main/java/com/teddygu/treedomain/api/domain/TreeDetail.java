package com.teddygu.treedomain.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity(name="netheart")
@Table(name="TREE_DETAIL", schema="netheart")
public class TreeDetail {

	@Id
	@GeneratedValue(generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator", name="TableIdGen", parameters={
			@Parameter(name="table_name", value="TRDEID_GENERATE"),
			@Parameter(name = "segment_value", value = "trdeId"),
            @Parameter(name = "optimizer", value = "pooled"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "10")
	})
	private Long trdeId;
	@Column(nullable=false, unique=true, name="TREE_NAME")
	private String name;
	@Column(nullable=false, unique=true, name="TREE_LIFE_DURATION")
	private String lifeDuration;
	@Column(nullable=false, unique=true, name="TYPE")
	private String type;
	@Column(nullable=false, unique=true, name="HEIGHT")
	private String height;
	@Column(nullable=false, unique=true, name="SHORT_DESC")
	private String shortDescription;
	/**
	 * @return the trdeId
	 */
	public Long getTrdeId() {
		return trdeId;
	}

	/**
	 * @param trdeId the trdeId to set
	 */
	public void setTrdeId(Long trdeId) {
		this.trdeId = trdeId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lifeDuration
	 */
	public String getLifeDuration() {
		return lifeDuration;
	}

	/**
	 * @param lifeDuration the lifeDuration to set
	 */
	public void setLifeDuration(String lifeDuration) {
		this.lifeDuration = lifeDuration;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trdeId == null) ? 0 : trdeId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeDetail other = (TreeDetail) obj;
		if (trdeId == null) {
			if (other.trdeId != null)
				return false;
		} else if (!trdeId.equals(other.trdeId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TreeDetail [name=" + name + ", lifeDuration=" + lifeDuration
				+ "]";
	}

}
