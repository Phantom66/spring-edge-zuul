package com.edge.filter;



import java.util.logging.Level;
import java.util.logging.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PostFilterProxy extends ZuulFilter {
	
	private final static Logger LOGGER = Logger.getLogger("com.edge.filter.PostFilterProxy");

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String filterType() {
		
		LOGGER.log(Level.INFO,"DENTRO DE LA RESPUESTA POST-FILTER");
		return "post";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
