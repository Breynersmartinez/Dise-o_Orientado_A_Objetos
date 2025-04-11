package com.example.SOLID_principles.SRP.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name = "Usuarios")
public class User {

    @Column (name = "id")
    private Long id;
    private

}
