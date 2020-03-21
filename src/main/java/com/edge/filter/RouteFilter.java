package com.edge.filter;




import java.util.logging.Level;
import java.util.logging.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter {
	
	private final static Logger LOGGER = Logger.getLogger("com.edge.filter.RouteFilter");

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		LOGGER.log(Level.INFO," DENTRO DEL ROUTER FILTER");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "route";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
