package com.lifecycle.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.lifecycle.resource.ProductResource;

public class LifeCycleApplication extends Application{

	public Set<Object> singletons;
	public Set<Class<?>> classes;
	public LifeCycleApplication() {
		System.out.println("LifeCycleApplication()");
          singletons=new HashSet<Object>();
          classes =new HashSet<Class<?>>();
          singletons.add(new ProductResource());
	}
	@Override
	public Set<Class<?>> getClasses() {
		System.out.println("getClasses()");
		return classes;
	}
	@Override
	public Set<Object> getSingletons() {
		System.out.println("getSingletons()");
		return singletons;
	}
	
	
}
