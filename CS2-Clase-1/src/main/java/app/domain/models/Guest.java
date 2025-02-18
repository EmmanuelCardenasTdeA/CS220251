package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Guest extends User{
    private long guestId;
    private Partner partner;
    private boolean status;

    public Guest(long userId, String userName, String password, String role, long personId, long document,
            String name, long cellPhone, long guestId, Partner partner, boolean status) {
        super(userId, userName, password, role, personId, document, name, cellPhone);
        this.guestId = guestId;
        this.partner = partner;
        this.status = status;
    }
}
