package kodlamaio.hrms.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	
	 @Autowired
	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    @GetMapping("/getall")
	    public DataResult<List<User>> getAll(){
	       return userService.getAll();
	    }


	    @PostMapping("/delete")
	    public Result delete(@RequestBody User user){
	        return userService.delete(user);
	    }

	    @GetMapping("/getbyid")
	    public DataResult<Optional<User>> getById(int userId){
	        return userService.getById(userId);
	    }

}
