package pl.java.learning.todolist.registry.DAO;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gladus on 26.06.2018.
 */
public interface UserRepository extends CrudRepository<User,Long> {
}
