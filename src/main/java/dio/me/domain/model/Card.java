package dio.me.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name ="tb_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cardNumber;
    @Column(name = "available_limit", scale = 13 ,precision = 2)
    private BigDecimal cardLimit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public  BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit( BigDecimal cardLimit) {
        this.cardLimit = cardLimit;
    }
}
