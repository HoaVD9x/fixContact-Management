package org.alicoder.spring.contactmanagement.service.impl;

import org.alicoder.spring.contactmanagement.model.Users;
import org.alicoder.spring.contactmanagement.payload.UserPayload;
import org.alicoder.spring.contactmanagement.repository.UserRepository;
import org.alicoder.spring.contactmanagement.service.UserService;
import org.alicoder.spring.contactmanagement.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired UserRepository repository;

    @Override
    public void save(UserPayload payload) throws NoSuchAlgorithmException {
        Users user = new Users(payload.getFirstName(), payload.getLastName(), payload.getEmail(), MD5Util.encrypt(payload.getPassword()));
        repository.save(user);
    }
    @Override
    public void saveUsers(Users users) throws  NoSuchAlgorithmException {
        users.setPassword(MD5Util.encrypt(users.getPassword()));
        repository.save(users);

    }

    @Override
    public List<Users> listUser() {
        return repository.findAll();
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Users select(int id) {
        return repository.findByUserId(id);
    }


}
