package ro.opa.webbox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.opa.webbox.repository.TermDao;
import ro.opa.webbox.service.BoxService;

@Service
public class BoxServiceImpl implements BoxService {
	
	@Autowired
	TermDao termDao;

	@Override
	public String test() {
		return termDao.getTerm(1).getUrl();
	}

}
