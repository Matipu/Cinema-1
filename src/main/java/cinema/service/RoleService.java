package cinema.service;

import org.springframework.beans.factory.annotation.Autowired;

import cinema.repository.RoleRepository;

public class RoleService {

	RoleRepository roleRepository;

	@Autowired
	public RoleService(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}
}