package bees.joro.bees.data.models.repositories;

import bees.joro.bees.data.models.base.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    boolean existsByUsername(String username);

    User findByUsername(String username);

    // boolean existsByUsernameAndPassword(String username, String password);

//    String userInfo = "SELECT email, first_name, last_name, username FROM users WHERE id = 1";

//    @Query(userInfo)
//    List<User> findUser();
}
