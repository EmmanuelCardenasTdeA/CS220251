package app.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class InvoiceHeader {
    private long invoiceHeaderId;
    private Person person;
    private Partner partner;
    private Date date;
    private double amount;
    private boolean status;

    public InvoiceHeader(long invoiceHeaderId, Person person, Partner partner, Date date, double amount, boolean status) {
        this.invoiceHeaderId = invoiceHeaderId;
        this.person = person;
        this.partner = partner;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }
}
