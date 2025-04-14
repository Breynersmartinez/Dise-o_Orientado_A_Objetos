package com.example.SOLID_principles.Service;

import com.example.SOLID_principles.Model.User;
import com.example.SOLID_principles.Repository.UserRepository;
import org.springframework.transaction.annotation.Transactional; // habia conflicto por la importacion

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*
* 1) Esta clase sobre escribe e implementa la interfaz
* Aqui se maneja la logica de negocio
* */

// Esta ntacion le indica a spring que esta clase es un servicio
@Service
public class UserServiceImpl implements UserService{


    /* Inyeccion de dependencias
    * Se usa la dependecnia  UserRepository es una referencia de la interfaz  UserRepository
    * automaticamente Spring se encarga de proporcionar una instancia
    * Inyecta las dependencias
    * de UserRepository a la clase UserServiceImpl */


    @Autowired
    private UserRepository UserRepository;//inyección de dependencias

    //Metodo que nos retorna todos los usuarios
    // @Transactional(readOnly = true) significa que es una transaciion de una sola lectura
    @Transactional(readOnly = true)
    public Iterable<User> findAll() {
        return UserRepository.findAll();
    }



    // Retorna todos los usuarios pageables utilizando el objeto UserRepository
    // @Transactional(readOnly = true) significa que es una transaciion de una sola lectura
    @Override
    @Transactional(readOnly = true)
    public Page<User> findAll(Pageable pageable) {
        return UserRepository.findAll(pageable);
    }

    // Metod  que busca un usuario por id
    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return UserRepository.findById(id);
    }

    //Metodo con el que guardamos o actualizamos usuarios
    @Override
    @Transactional
    public User save(User user) {
        return UserRepository.save(user);
    }

    /*
    * @Transactional nos indica que esta operacion hacen una trasaccion en la bd
    * */
    @Override
    @Transactional
    public void deleteById(Long id) {
        UserRepository.deleteById(id);
    }
}
