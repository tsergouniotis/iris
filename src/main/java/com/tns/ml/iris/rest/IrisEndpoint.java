package com.tns.ml.iris.rest;

import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tns.ml.iris.domain.Iris;
import com.tns.ml.iris.repository.IrisRepository;

@ApplicationScoped
@Path("/iris")
public class IrisEndpoint {

	@Inject
	private IrisRepository irisRepository;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response doGet() {
		Collection<Iris> res = irisRepository.findAll();
		return Response.ok(res).build();
	}
}