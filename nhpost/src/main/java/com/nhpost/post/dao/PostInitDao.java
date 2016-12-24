/**
 * 
 */
package com.nhpost.post.dao;

import java.util.List;

import com.nhpost.post.common.exception.DataAccessException;
import com.nhpost.post.domain.Post;

// TODO: Auto-generated Javadoc
/**
 * The Interface PostInitDao.
 *
 * @author Rupen_PC
 */
public interface PostInitDao {

	/**
	 * Creates the.
	 *
	 * @throws DataAccessException
	 *             the data access exception
	 */
	public void create() throws DataAccessException;

	/**
	 * Gets the.
	 *
	 * @throws DataAccessException
	 *             the data access exception
	 */
	public void get() throws DataAccessException;

	public List<Post> getAll() throws DataAccessException;

	/**
	 * Delete.
	 *
	 * @throws DataAccessException
	 *             the data access exception
	 */
	public void delete() throws DataAccessException;

	public void add(Post post) throws DataAccessException;
}
