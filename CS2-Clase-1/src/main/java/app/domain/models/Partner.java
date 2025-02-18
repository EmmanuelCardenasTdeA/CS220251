package app.domain.models;
import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Partner extends User{
    private long partnerId;
    private double amount;
    private String type;
    private Date dateCreated;

    public Partner(long userId, String userName, String password, String role, long personId, long document,
            String name, long cellPhone, long partnerId, double amount, String type, Date dateCreated) {
        super(userId, userName, password, role, personId, document, name, cellPhone);
        this.partnerId = partnerId;
        this.amount = amount;
        this.type = type;
        this.dateCreated = dateCreated;
    }

}
