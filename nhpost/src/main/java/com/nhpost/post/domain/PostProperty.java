package com.nhpost.post.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * The Class PostProperty.
 */
@Entity
@Table(name = "POST_PROPERTY", schema = "netheart")
public class PostProperty {

	/** The po pr id. */
	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "POPRID_GENERATE"),
			@Parameter(name = "segment_value", value = "poPrId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "1") })
	public Long poPrId;
	
	/** The post. */
	@OneToOne(mappedBy = "postProperty")
	private Post post;
	
	/** The like count. */
	@Column(name = "LIKE_COUNT", nullable = true, unique = false)
	public String likeCount;

	/**
	 * Gets the po pr id.
	 *
	 * @return the po pr id
	 */
	public Long getPoPrId() {
		return poPrId;
	}

	/**
	 * Sets the po pr id.
	 *
	 * @param poPrId the new po pr id
	 */
	public void setPoPrId(Long poPrId) {
		this.poPrId = poPrId;
	}

	/**
	 * Gets the post.
	 *
	 * @return the post
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * Sets the post.
	 *
	 * @param post the new post
	 */
	public void setPost(Post post) {
		this.post = post;
	}

	/**
	 * Gets the like count.
	 *
	 * @return the like count
	 */
	public String getLikeCount() {
		return likeCount;
	}

	/**
	 * Sets the like count.
	 *
	 * @param likeCount the new like count
	 */
	public void setLikeCount(String likeCount) {
		this.likeCount = likeCount;
	}

}
