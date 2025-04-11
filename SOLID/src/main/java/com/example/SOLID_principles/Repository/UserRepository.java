package com.example.SOLID_principles.Repository;


import com.example.SOLID_principles.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Marcar esta interfaz como componente del repositorio
@Repository

//Persistencia de la api

// Aqui se hace un proceso de abstraccion, Se relaciona con los principios SOLID
public interface UserRepository extends JpaRepository<User, Long> {
}
