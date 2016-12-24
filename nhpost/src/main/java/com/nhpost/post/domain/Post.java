package com.nhpost.post.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * The Class Post.
 */
@Entity
@Table(name = "POST", schema = "netheart")
public class Post {

	/** The po id. */
	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "POID_GENERATE"),
			@Parameter(name = "segment_value", value = "poId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "1") })
	public Long poId;

	/** The post text. */
	@Column(name = "POST_TITLE", nullable = false, unique = false)
	public String postTitle;

	/** The post text. */
	@Column(name = "POST_TEXT", nullable = false, unique = false)
	public String postText;

	/** The post property. */
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "POPRID")
	public PostProperty postProperty;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "PORAID")
	public PostRating postRating;

	/** The created date. */
	@Column(name = "CREATED_DATE", nullable = false, unique = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdDate;

	/** The is active. */
	@Column(name = "IS_ACTIVE", nullable = false, unique = false)
	public String isActive;

	/**
	 * Gets the post property.
	 *
	 * @return the post property
	 */
	public PostProperty getPostProperty() {
		return postProperty;
	}

	/**
	 * Sets the post property.
	 *
	 * @param postProperty
	 *            the new post property
	 */
	public void setPostProperty(PostProperty postProperty) {
		this.postProperty = postProperty;
	}

	/**
	 * Gets the post rating.
	 *
	 * @return the post rating
	 */
	public PostRating getPostRating() {
		return postRating;
	}

	/**
	 * Sets the post rating.
	 *
	 * @param postRating
	 *            the new post rating
	 */
	public void setPostRating(PostRating postRating) {
		this.postRating = postRating;
	}

	/**
	 * Gets the po id.
	 *
	 * @return the po id
	 */
	public Long getPoId() {
		return poId;
	}

	/**
	 * Sets the po id.
	 *
	 * @param poId
	 *            the new po id
	 */
	public void setPoId(Long poId) {
		this.poId = poId;
	}

	/**
	 * @return the postTitle
	 */
	public String getPostTitle() {
		return postTitle;
	}

	/**
	 * @param postTitle
	 *            the postTitle to set
	 */
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	/**
	 * Gets the post text.
	 *
	 * @return the post text
	 */
	public String getPostText() {
		return postText;
	}

	/**
	 * Sets the post text.
	 *
	 * @param postText
	 *            the new post text
	 */
	public void setPostText(String postText) {
		this.postText = postText;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate
	 *            the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the checks if is active.
	 *
	 * @return the checks if is active
	 */
	public String getIsActive() {
		return isActive;
	}

	/**
	 * Sets the checks if is active.
	 *
	 * @param isActive
	 *            the new checks if is active
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
