package org.learning.cxfrest.services;

import org.springframework.stereotype.Service;

@Service("applicationProduct")
public class ProductServiceImpl implements ProductService{

	public String reply(String name) {
		return name;
	}

}
