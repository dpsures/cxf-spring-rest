package org.learning.cxfrest.services;

import org.learning.cxfrest.constants.Constants;
import org.springframework.stereotype.Service;

@Service("applicationAbout")
public class AboutServiceImpl implements AboutService{

	public String about() {
		return Constants.APP_ABOUT;
	}

	public String sayHello(String name) {
		return "Hello!, "+name;
	}
}
