package Projeto.Roberto.service;
import Projeto.Roberto.Repository.UserRepository;
import Projeto.Roberto.model.User;

import java.util.List;

public interface UserService {
    UserRepository findById(long id);

    List<UserRepository> create(User  userToCreate);


    Object findById();
}
