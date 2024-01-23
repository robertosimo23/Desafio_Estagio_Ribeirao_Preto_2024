package Projeto.Roberto.service;

import Projeto.Roberto.Repository.UserRepository;
import Projeto.Roberto.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserRepository findById(long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<UserRepository> create(User userToCreate) {
        if (userToCreate.getID()!= null && userRepository.existsById(userToCreate.getID()))
        {
            throw new IllegalArgumentException("This User ID already exists. ");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public Object findById() {
        return null;
    }
}
