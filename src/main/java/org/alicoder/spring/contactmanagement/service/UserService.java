package org.alicoder.spring.contactmanagement.service;

import org.alicoder.spring.contactmanagement.payload.UserPayload;

import java.security.NoSuchAlgorithmException;

public interface UserService {

    void save(UserPayload payload) throws NoSuchAlgorithmException;
}
