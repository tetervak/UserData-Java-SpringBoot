package ca.tetervak.userdata.controller;

import ca.tetervak.userdata.data.UserDataRepository;
import ca.tetervak.userdata.data.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserDataController {
    private final UserDataRepository userDataRepository;

    public UserDataController(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    @GetMapping(value = {"/","/user-list"})
    public ModelAndView userList() {

        List<UserEntity> userEntityList = userDataRepository.findAll();

        return new ModelAndView("UserList", "users", userEntityList);
    }
}
