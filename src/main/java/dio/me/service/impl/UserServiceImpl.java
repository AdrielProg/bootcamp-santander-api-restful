package dio.me.service.impl;

import dio.me.domain.model.User;
import dio.me.domain.repository.UserRepository;
import dio.me.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) {
        return userRepository.findById( id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(User userToCreate) {
        if (userRepository.existsByAccountAccountNumber(userToCreate.getAccount().getAccountNumber())) {
            throw new IllegalArgumentException("A record with the same account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
