package uz.myproduct.appuser.service;

import org.springframework.stereotype.Service;
import uz.myproduct.appuser.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {

    public List<User> getAllUsers(){
        return new ArrayList<User>();
    }

    public User getUser(Integer id) {
        return new User();
    }

    public User addUser(User user){
        return new User();
    }

    public User editUser(User user) {
        return new User();
    }
}
