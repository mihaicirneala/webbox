package ro.opa.webbox.repository;

import ro.opa.webbox.model.Term;

/**
 * @author Mihai Cirneala
 * 
 */
public interface TermDao {

	public void add(Term term);

	public void edit(Term term);

	public void delete(int termId);

	public Term getTerm(int termId);

}
