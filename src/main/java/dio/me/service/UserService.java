package dio.me.service;

import dio.me.domain.model.User;

public interface UserService {

    User findById(long id);

    User createUser(User userToCreate);
}
