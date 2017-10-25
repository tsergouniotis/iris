package com.tns.ml.iris.repository;

import javax.ejb.Stateless;

import com.tns.ml.iris.domain.Iris;

@Stateless
public class IrisRepository extends AbstractRepository<Iris, Long> {

	protected IrisRepository(Class<Iris> type) {
		super(Iris.class);
	}

}
