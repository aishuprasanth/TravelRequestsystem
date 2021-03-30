package com.faith.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.Login;
import com.faith.app.service.ILoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	//get usesrs based on username and password
	
	@GetMapping("user-login/{username}&{password}")
	public ResponseEntity<Login> listLogin(@PathVariable("username") String username ,
			@PathVariable("password") String password){
		
		ResponseEntity<Login> response=null;
		Login login=loginService.findUser(username,password);
		if(login==null) {
			response=new ResponseEntity<Login>(HttpStatus.NOT_FOUND);
		}else {
			response=new ResponseEntity<Login>(login, HttpStatus.OK);
		}
		
				return response;
		
	}
}
