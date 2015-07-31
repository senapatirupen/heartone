package com.teddygu.treedomain.api.model;

public class TreeInfo implements java.io.Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 959749666653088024L;
	private Integer treeId;
	private String name;
	/**
	 * @return the treeId
	 */
	public Integer getTreeId() {
		return treeId;
	}
	/**
	 * @param treeId the treeId to set
	 */
	public void setTreeId(Integer treeId) {
		this.treeId = treeId;
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

}
