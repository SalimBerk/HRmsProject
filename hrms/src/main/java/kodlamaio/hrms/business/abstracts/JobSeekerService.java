package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;



import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.JobSeeker;


public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	 Result add(JobSeeker jobSeekerr);
	Result delete(JobSeeker jobSeeker);
    DataResult<Optional<JobSeeker>> getById(int systemUserId);
}
