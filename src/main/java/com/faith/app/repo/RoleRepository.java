package com.faith.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Integer> {

}
