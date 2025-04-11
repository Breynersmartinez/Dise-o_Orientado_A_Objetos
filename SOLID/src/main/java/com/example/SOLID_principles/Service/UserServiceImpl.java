package com.example.SOLID_principles.Service;

import com.example.SOLID_principles.Model.User;
import com.example.SOLID_principles.Repository.UserRepository;
import org.springframework.transaction.annotation.Transactional; // habia conflicto por la importacion

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository UserRepository;//inyección de dependencias

    @Transactional(readOnly = true)
    public Iterable<User> findAll() {
        return UserRepository.findAll();
    }




    @Override
    @Transactional(readOnly = true)
    public Page<User> findAll(Pageable pageable) {
        return UserRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return UserRepository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return UserRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        UserRepository.deleteById(id);
    }
}
