package com.shopping.ecommerceApp.Controller;

import com.shopping.ecommerceApp.Model.User;
import com.shopping.ecommerceApp.Repository.UserRepository;
import com.shopping.ecommerceApp.Service.AuthService;
import com.shopping.ecommerceApp.domain.USER_ROLE;
import com.shopping.ecommerceApp.response.AuthResponse;
import com.shopping.ecommerceApp.response.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {


//    @Autowired
    private final UserRepository userRepository;
    private final AuthService authService;

//    public AuthController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }


    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req){

//        User user= new User();
//    user.setEmail(req.getEmail());
//    user.setFullName(req.getFullName());
////    System.out.println("working");
//        User savedUser=userRepository.save(user);

        String jwt=authService.createUser(req);

        AuthResponse res= new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("registered Successfully");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);
        return ResponseEntity.ok(res);


    }

}
