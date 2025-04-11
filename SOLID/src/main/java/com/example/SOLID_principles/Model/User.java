package com.example.SOLID_principles.Model;


import jakarta.persistence.*;
import lombok.*;


// Indica que la clase user es una entidad persistente que representa una tabla de un bd
// Singnifica que los objetos de la clase usuario pueden ser almacenados, actualizados y recuperados de la bd
@Entity

// Nombre de la tabla de la base de datos que esta mapeada la entidad
@Table(name = "Usuarios")




// Librerias loombok

//Consulta del estado de los atributos
@Data
//------------------------

/*
//Imprimir el objeto con sus atributos
@ToString

//Para comparar en memoria, cuando los objetos son iguales
@EqualsAndHashCode
*/

public class User {


    //Notacion para marcar el campo o la propiedad que representa la clave primaria de la entidad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Atributos y tablas relacionadas en la bd

    @Column (name = "IDENTIFICACION")
    private Long id;

    @Column (name= "NOMBRE_COMPLETO")
    private  String name;


    @Column (name= "EMAIL")
    private String email;

    @Column (name= "PASSWORD")
    private String password;


    @Column (name= "TELEFONO")
    private String phone;


}
