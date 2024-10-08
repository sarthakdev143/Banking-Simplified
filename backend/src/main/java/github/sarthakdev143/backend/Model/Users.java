package github.sarthakdev143.backend.Model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Users {
    @Id
    private String id;
    private String account_holder_name;
    private String email;
    private String password;
    private String account_balance;
    private Set<Roles> roles;
}
