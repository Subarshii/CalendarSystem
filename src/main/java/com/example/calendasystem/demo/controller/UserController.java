//package com.example.calendasystem.demo.controller;
//
//import com.example.calendasystem.demo.model.*;
//import com.example.calendasystem.demo.repository.DepartmentReository;
//import com.example.calendasystem.demo.repository.NOTUSE.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/user/")
//class UserController {
//  @Autowired private UserRepository userRepository;
//  private DepartmentReository departmentReository;
//
//  UserController(UserRepository userRepository, DepartmentReository departmentReository) {
//    this.userRepository = userRepository;
//    this.departmentReository = departmentReository;
//  }
//
//  @GetMapping("{userId}")
//  Optional<User> getUser(@PathVariable(name = "userId") Integer userId) {
//    return userRepository.findById(userId);
//  }
//
//  @PostMapping
//  User saveUser(@RequestBody User userToSave, @RequestParam Integer departmentid) {
//    User newuser = new User();
//
////    newuser.setDepartment(departmentReository.getOne(departmentid));
//    newuser.setFirstname(userToSave.getFirstname());
//    newuser.setLastname(userToSave.getLastname());
//    newuser.setDescription(userToSave.getDescription());
//    newuser.setEmail(userToSave.getEmail());
//    newuser.setPhone(userToSave.getPhone());
//    newuser.setWorkstart(userToSave.getWorkstart());
//    newuser.setHolidayTime(new HolidayTime(7, 7, 7));
//    return userRepository.save(newuser);
//  }
//
//  @PutMapping("{userId}")
//  @Transactional
//  Optional<User> updateUser(
//      @RequestBody User users, @PathVariable Integer userId, @RequestParam Integer departmentid) {
//    Optional<User> userOptional = userRepository.findById(userId);
//    userOptional.ifPresent(
//        user -> {
////user.setDepartment(departmentReository.getOne(departmentid));
//          user.setFirstname(users.getFirstname());
//          user.setLastname(users.getLastname());
//          user.setDescription(users.getDescription());
//          user.setPhone(users.getPhone());
//          user.setWorkstart(users.getWorkstart());
//          user.setEmail(users.getEmail());
//          user.setHolidayTime(new HolidayTime(7, 7, 7));
//
//          userRepository.save(user);
//        });
//    return userOptional;
//  }
//
//  @DeleteMapping("{userid}")
//  Optional<User> deleteUser(@PathVariable(name = "userid") Integer userid) {
//    Optional<User> founduser = userRepository.findById(userid);
//    founduser.ifPresent(
//        delete -> {
//          userRepository.deleteById(userid);
//        });
//
//    return founduser;
//  }
//}
