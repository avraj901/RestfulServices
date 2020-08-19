package com.paytm.walletresource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/paytm-wallet")
public class PayTMWalletResource {

@GET
@Produces("text/plain")
	public Double getBalance(@QueryParam("mobileNumber")String mobilenumber) {
		Double value=1000.0;
		return value;
	}
}
