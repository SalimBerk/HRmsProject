package kodlamaio.hrms.business.abstracts;



import java.util.List;
import java.util.Optional;



import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosition;


public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
    Result add(JobPosition jobPosition);
    Result delete(JobPosition jobPosition);
    DataResult<Optional<JobPosition>> getById(int jobPositionId);
}
