package com.tns.ml.iris.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.tns.ml.iris.domain.Iris;
import com.tns.ml.iris.repository.IrisRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/iris")
public class IrisEndpoint {

	@Inject
	private IrisRepository irisRepository;

	@GET
	@Produces("text/json")
	public Response doGet() {
		List<Iris> res = irisRepository.findAll();
		return Response.ok(res).build();
	}
}