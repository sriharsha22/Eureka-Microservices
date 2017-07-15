package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.myInfo;



@RestController
public class Producer1Controller {
	

	

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public myInfo myDetails() {

		myInfo info = new myInfo();
		info.setId("112");
		info.setName("Harsha");
		info.setPhone("1234556778");
		info.setAddress(1234);
		return info;
	}
}
