package org.alicoder.spring.contactmanagement.controller;

import org.alicoder.spring.contactmanagement.model.Users;
import org.alicoder.spring.contactmanagement.payload.UserPayload;
import org.alicoder.spring.contactmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired UserService service;

    @GetMapping(value = "/addNewUser")
    public ModelAndView addNewUser(ModelMap modelMap) {
        Users user = new Users();
        modelMap.addAttribute("user",user);
        return new ModelAndView("pages/form_user", modelMap);
    }

    @GetMapping(value = "/users")
    public ModelAndView listUser(ModelMap model) {
        List<Users> usersList = service.listUser();
        model.addAttribute("users", usersList);
        return new ModelAndView("pages/list_user", model);
    }
    @GetMapping(value = "/users/{id}/delete")
    public String deleteUser(@PathVariable(value = "id") int id) {
        service.delete(id);
        return "redirect:/users";
    }

    @GetMapping(value = "/users/{id}/edit")
    public ModelAndView selectUser(@PathVariable(value = "id") int id,ModelMap modelMap) {

            return new ModelAndView("pages/form_user","user",service.select(id));


    }
}
