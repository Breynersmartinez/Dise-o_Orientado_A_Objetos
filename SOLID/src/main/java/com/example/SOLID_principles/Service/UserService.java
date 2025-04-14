package com.example.SOLID_principles.Service;

import com.example.SOLID_principles.Model.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



import java.util.Optional;


/*
* Esta interfaz nos va permitir definir los metodos que van a interactuar con las
* entidades de tipo usuario, en esta capa de servicios
* En esta interfaztodos los metodos son abstractos
* */


public interface UserService {

/*
 *Este metodo nos va a reornar todos los registros de los usuarios
 * existentes en la base de datos
 * nos devuelve un iterable de onetos de la clase usuario
 * */
    public Iterable<User> findAll();

/*
* Este metodo nos retorna una pagina de registro de usuarios existentes
*  en  la base de datos usando paginacion
* */
    public Page<User> findAll(Pageable pageable); // el parametro se utiliza para definir como se desea paginar y ordenar los resultados


    /*
    * Nos va a retornar un resgistro de usuarios basado en un id especifico
    *  */
    public Optional<User> findById(Long id);


    // Nos guarda un nuevo registro o actualiza
    public User save(User user);


    // metodo vacio que elimina un registro por id
    public void deleteById(Long id);
}
