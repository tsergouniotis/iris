package com.tns.ml.iris.repository;

import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.tns.ml.iris.domain.Iris;
import com.tns.ml.iris.ds.IrisCsvDataSource;

@Transactional
@ApplicationScoped
@Named("irisRepository")
public class IrisRepositoryImpl extends AbstractRepository<Iris, Long> implements IrisRepository {

	@Inject
	private IrisCsvDataSource irisCsvDataSource;

	protected IrisRepositoryImpl() {
		super(Iris.class);
	}

	@Override
	public void saveAll() {
		Set<Iris> set = irisCsvDataSource.read();
		super.save(set);
	}

}
