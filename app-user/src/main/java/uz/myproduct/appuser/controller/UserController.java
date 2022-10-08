package uz.myproduct.appuser.controller;

import org.springframework.web.bind.annotation.*;
import uz.bepro.apphomeworklesson1.model.User;
import uz.bepro.apphomeworklesson1.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
//    @Autowired
//    UserServiceImpl userService;

// @Autowired.ga qaraganda constructor orqali chaqirish mukammalroq (constructor 100% garantiya)
     private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    //    Get list all of users (Barcha user.lar ro'yxatini olish)
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return new ArrayList<User>();
    }


    //    Get one user by user's id (Bitta user.ni uning id orqali olish)
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return new User();
    }

    //    Add user (User qo'shish)
    @PostMapping("/user")
    public User addUser(@RequestBody User user) { // @RequestBody User objectini berish uchun
        return new User();
    }

    //    Edid user (User o'zgartirish)
    @PostMapping("/user/{id}")
    public User editUser(@RequestBody User user, @PathVariable Integer id) { // @RequestBody User objectini berish uchun, @PathVariable - id tipini olish u-n
        return new User();
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable Integer id) {
        return new User();
    }


}
