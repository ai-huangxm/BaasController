package com.digiwes.baas.controller;

import com.digiwes.baas.interf.HelloService;
import com.digiwes.baas.impl.HelloServiceImpl;

public class HelloController {
	private static HelloService helloImpl = null;
	
	public static HelloService getHelloService() {
		if (null == helloImpl)
			helloImpl = new HelloServiceImpl();
		return helloImpl;
	}
}
