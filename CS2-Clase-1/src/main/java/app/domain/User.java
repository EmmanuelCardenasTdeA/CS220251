package app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class User extends Person {
    private long userId;
    private String userName;
    private String password;
    private String role;

    public User(long userId, String userName, String password, String role, long personId, long document, String name, long cellPhone) {
        super(personId, document, name, cellPhone);
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    
}
