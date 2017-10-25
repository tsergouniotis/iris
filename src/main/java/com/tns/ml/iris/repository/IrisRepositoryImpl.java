package com.tns.ml.iris.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.tns.ml.iris.domain.Iris;

@ApplicationScoped
@Named("irisRepository")
public class IrisRepositoryImpl extends AbstractRepository<Iris, Long> implements IrisRepository {

	protected IrisRepositoryImpl() {
		super(Iris.class);
	}

}
