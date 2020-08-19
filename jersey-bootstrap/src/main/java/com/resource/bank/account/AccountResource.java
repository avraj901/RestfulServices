package com.resource.bank.account;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/account")
public class AccountResource {

	@GET
	@Produces("text/plain")
	public double getAccountBalance(@QueryParam("accountNo")String accountNo) {
		//business logic
		
		return 30.89;
	}
}
