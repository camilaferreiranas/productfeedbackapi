package br.com.camilaferreiranas.productfeedbackapi.domain.model;

public class Review {

    private Long id;
    private String email;
    private String telephone;
    private Product product;
    private String title;
    private Double rating;
    private String description;


    public Review() {
    }

    public Review(Long id, String email, String telephone, Product product, String title, Double rating, String description) {
        this.id = id;
        this.email = email;
        this.telephone = telephone;
        this.product = product;
        this.title = title;
        this.rating = rating;
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
