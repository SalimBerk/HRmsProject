package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;



import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;


public interface EmployerService {
	DataResult<List<Employer>> getAll();
    Result add(Employer employer);
    Result delete(Employer employer);
    DataResult<Optional<Employer>> getById(int employerId);

}
