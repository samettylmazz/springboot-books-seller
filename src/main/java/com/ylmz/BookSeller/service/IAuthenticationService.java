package com.ylmz.BookSeller.service;

import com.ylmz.BookSeller.Model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
