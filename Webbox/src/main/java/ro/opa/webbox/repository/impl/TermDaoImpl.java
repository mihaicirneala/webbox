package ro.opa.webbox.repository.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ro.opa.webbox.model.Term;
import ro.opa.webbox.repository.TermDao;

@Repository
@Transactional
public class TermDaoImpl implements TermDao {

	@Autowired
	private SessionFactory session;

	@Override
	public void add(Term term) {
		session.getCurrentSession().save(term);
	}

	@Override
	public void edit(Term term) {
		session.getCurrentSession().update(term);
	}

	@Override
	public void delete(int termId) {
		session.getCurrentSession().delete(getTerm(termId));
	}

	@Override
	public Term getTerm(int termId) {
		return (Term)session.getCurrentSession().get(Term.class, termId);
	}

}
