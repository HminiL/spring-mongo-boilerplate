package shop.jarvis.app.demo.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.lang.annotation.Documented;

@Document(collation = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id private String userId;
    private String name;
    private String email;
    private String password;
}

