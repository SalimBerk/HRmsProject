package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;
@Service
public class UserManager implements UserService{
	 private UserDao userDao;

	    @Autowired
	    public UserManager(UserDao userDao) {
	        this.userDao = userDao;
	    }

	    @Override
	    public DataResult<List<User>> getAll() {
	        return new SuccessDataResult<List<User>>(userDao.findAll(),"Veriler Listelendi");
	    }

	    @Override
	    public Result delete(User user) {
	        userDao.delete(user);
	        return new SuccessResult("Kullanıcı Silindi");
	    }

	    @Override
	    public DataResult<Optional<User>> getById(int userId) {
	        return new SuccessDataResult<Optional<User>>(userDao.findById(userId),"Veri Listelendi");
	    }

}
