/**
 *
 */
package com.teddygu.tree.api.dao;

import java.util.Collection;

import com.teddygu.tree.api.domain.Person;

/**
 * @author Rupen
 *
 */
public interface PersonDao {
	public void save(Person person);
	public Person findByName(String name);
	public Person findById(String id);
	public Collection<Person> list();
	public void delete(Person person);
}
