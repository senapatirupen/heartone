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
 * The Class PostRating.
 */
@Entity
@Table(name = "POST_RATING", schema = "netheart")
public class PostRating {

	/** The po ra id. */
	@Id
	@GeneratedValue(generator = "TableIdGen")
	@GenericGenerator(strategy = "org.hibernate.id.enhanced.TableGenerator", name = "TableIdGen", parameters = {
			@Parameter(name = "table_name", value = "PORAID_GENERATE"),
			@Parameter(name = "segment_value", value = "poRaId"), @Parameter(name = "optimizer", value = "pooled"),
			@Parameter(name = "initial_value", value = "1000"), @Parameter(name = "increment_size", value = "1") })
	public Long poRaId;

	/** The post. */
	@OneToOne(mappedBy = "postProperty")
	private Post post;

	/** The one star count. */
	@Column(name = "ONE_STAR_COUNT", nullable = true, unique = false)
	public String oneStarCount;

	/** The two star count. */
	@Column(name = "TWO_STAR_COUNT", nullable = true, unique = false)
	public String twoStarCount;

	/** The three star count. */
	@Column(name = "THREE_STAR_COUNT", nullable = true, unique = false)
	public String threeStarCount;

	/** The four star count. */
	@Column(name = "FOUR_STAR_COUNT", nullable = true, unique = false)
	public String fourStarCount;

	/** The five star count. */
	@Column(name = "FIVE_STAR_COUNT", nullable = true, unique = false)
	public String fiveStarCount;

	/**
	 * Gets the po ra id.
	 *
	 * @return the po ra id
	 */
	public Long getPoRaId() {
		return poRaId;
	}

	/**
	 * Sets the po ra id.
	 *
	 * @param poRaId
	 *            the new po ra id
	 */
	public void setPoRaId(Long poRaId) {
		this.poRaId = poRaId;
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
	 * @param post
	 *            the new post
	 */
	public void setPost(Post post) {
		this.post = post;
	}

	/**
	 * Gets the one star count.
	 *
	 * @return the one star count
	 */
	public String getOneStarCount() {
		return oneStarCount;
	}

	/**
	 * Sets the one star count.
	 *
	 * @param oneStarCount
	 *            the new one star count
	 */
	public void setOneStarCount(String oneStarCount) {
		this.oneStarCount = oneStarCount;
	}

	/**
	 * Gets the two star count.
	 *
	 * @return the two star count
	 */
	public String getTwoStarCount() {
		return twoStarCount;
	}

	/**
	 * Sets the two star count.
	 *
	 * @param twoStarCount
	 *            the new two star count
	 */
	public void setTwoStarCount(String twoStarCount) {
		this.twoStarCount = twoStarCount;
	}

	/**
	 * Gets the three star count.
	 *
	 * @return the three star count
	 */
	public String getThreeStarCount() {
		return threeStarCount;
	}

	/**
	 * Sets the three star count.
	 *
	 * @param threeStarCount
	 *            the new three star count
	 */
	public void setThreeStarCount(String threeStarCount) {
		this.threeStarCount = threeStarCount;
	}

	/**
	 * Gets the four star count.
	 *
	 * @return the four star count
	 */
	public String getFourStarCount() {
		return fourStarCount;
	}

	/**
	 * Sets the four star count.
	 *
	 * @param fourStarCount
	 *            the new four star count
	 */
	public void setFourStarCount(String fourStarCount) {
		this.fourStarCount = fourStarCount;
	}

	/**
	 * Gets the five star count.
	 *
	 * @return the five star count
	 */
	public String getFiveStarCount() {
		return fiveStarCount;
	}

	/**
	 * Sets the five star count.
	 *
	 * @param fiveStarCount
	 *            the new five star count
	 */
	public void setFiveStarCount(String fiveStarCount) {
		this.fiveStarCount = fiveStarCount;
	}

}
