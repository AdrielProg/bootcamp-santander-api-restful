package dio.me.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name ="tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String accountNumber;
    private String accountAgency;
    @Column(scale = 13 ,precision = 2)
    private BigDecimal accountBalance;
    @Column(name = "additional_limit", scale = 13 ,precision = 2)
    private  BigDecimal AccountLimit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountAgency() {
        return accountAgency;
    }

    public void setAccountAgency(String accountAgency) {
        this.accountAgency = accountAgency;
    }

    public  BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance( BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public  BigDecimal getAccountLimit() {
        return AccountLimit;
    }

    public void setAccountLimit( BigDecimal accountLimit) {
        AccountLimit = accountLimit;
    }
}
