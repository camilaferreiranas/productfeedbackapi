package br.com.camilaferreiranas.productfeedbackapi.domain.repository;

import br.com.camilaferreiranas.productfeedbackapi.domain.model.User;

public interface UserRepository {

    void save(User user);
    void update(User user);
    User findById(Long id);
    User findByEmail(Long id);
}
