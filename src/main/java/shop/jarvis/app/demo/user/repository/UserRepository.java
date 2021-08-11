package shop.jarvis.app.demo.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.jarvis.app.demo.user.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    public List<User> findAllByName(String name);
}
