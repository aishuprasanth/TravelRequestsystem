package com.faith.app.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.Login;


@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
	
	@Query("from Login where username=?1 and password=?2")
	Login findByLoginnameAndPassword(String username, String password);

}
