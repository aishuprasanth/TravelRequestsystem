package com.faith.app.service;

import com.faith.app.entity.Login;

public interface ILoginService {

	public Login findUser(String username, String password);

}
