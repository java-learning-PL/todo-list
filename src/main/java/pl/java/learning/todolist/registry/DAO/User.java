package pl.java.learning.todolist.registry.DAO;

import lombok.Data;
import pl.java.learning.todolist.registry.Gender;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String firstName;
    private String lastName;

    private String Login;    //czy te dane mają być jako osobna klasa ?
    private String password; //

    private String email;


    private Gender gender;  // zrobić z tego enuma osobną tabele w bazie ?






}
