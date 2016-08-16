package com.kohls.registry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kohls.registry.dao.CreateRegistryDao;
import com.kohls.registry.dao.Registry;

@SpringBootApplication
@EnableDiscoveryClient
public class CreateRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateRepositoryApplication.class, args);
	}
}

@RestController
class GetRegistryController {

	@Autowired
	private CreateRegistryDao dao;

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void findRegistry(@RequestBody RegistryUI ui) {
		Registry r = new Registry();
		r.setRegistry_id(ui.getId());
		r.setName(ui.getDescription());
		r.setCreatedBy(ui.getCreatedBy());

		dao.save(r);
	}
}
