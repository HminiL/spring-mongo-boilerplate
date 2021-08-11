package shop.jarvis.app.demo.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.jarvis.app.demo.user.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
