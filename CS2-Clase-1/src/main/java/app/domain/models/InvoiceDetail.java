package app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class InvoiceDetail {
    private long invoiceDetailId;
    private InvoiceHeader invoiceHeader;
    private String item;
    private double amount;

    public InvoiceDetail(long invoiceDetailId, InvoiceHeader invoiceHeader, String item, double amount) {
        this.invoiceDetailId = invoiceDetailId;
        this.invoiceHeader = invoiceHeader;
        this.item = item;
        this.amount = amount;
    }
}
