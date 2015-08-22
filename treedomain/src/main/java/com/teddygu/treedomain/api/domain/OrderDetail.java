package com.teddygu.treedomain.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="ADDRESS", schema="netheart")
public class OrderDetail {

	@Id
	@GeneratedValue(generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator", name="TableIdGen", parameters={
			@Parameter(name = "table_name", value = "ODID_GENERATE"),
			@Parameter(name = "segment_value", value = "odId"),
			@Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "10")
		})
	private long odId;
	@Column(name = "NAME", nullable = false, unique = false)
	private String name;
	@Column(name = "QUANTITY", nullable = false, unique = false)
	private String quantity;
	@Column(name = "PRICE", nullable = false, unique = false)
	private String price;
}
