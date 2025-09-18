package br.com.camilaferreiranas.productfeedbackapi.domain.model;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private String telephone;
    private Boolean isPremium;
    private LocalDate birthDate;
    private String cpfCpnj;
    private List<Order> orders;


    public User() {
    }


    public User(Long id, String name, String email, String telephone, Boolean isPremium, LocalDate birthDate, String cpfCpnj, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.isPremium = isPremium;
        this.birthDate = birthDate;
        this.cpfCpnj = cpfCpnj;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getPremium() {
        return isPremium;
    }

    public void setPremium(Boolean premium) {
        isPremium = premium;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpfCpnj() {
        return cpfCpnj;
    }

    public void setCpfCpnj(String cpfCpnj) {
        this.cpfCpnj = cpfCpnj;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
