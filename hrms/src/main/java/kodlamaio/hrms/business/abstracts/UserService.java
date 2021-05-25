package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;



import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;


public interface UserService {
    DataResult<List<User>> getAll();
    Result delete(User user);
    DataResult<Optional<User>> getById(int userId);

}
