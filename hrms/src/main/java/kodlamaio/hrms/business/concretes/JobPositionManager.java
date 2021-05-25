package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	 private JobPositionDao jobPositionDao;

	    @Autowired
	    public JobPositionManager(JobPositionDao jobPositionDao) {
	        super();
	        this.jobPositionDao = jobPositionDao;
	    }


	    @Override
	    public DataResult<List<JobPosition>> getAll() {
	        return new SuccessDataResult<List<JobPosition>>(jobPositionDao.findAll(),"Veriler Listelendi");
	    }

	    @Override
	    public Result add(JobPosition jobPosition) {
	    	jobPositionDao.save(jobPosition);
	        return new SuccessResult(" Eklendi");
	    }

	    @Override
	    public Result delete(JobPosition jobPosition) {
	        jobPositionDao.delete(jobPosition);
	        return new SuccessResult(" Silindi");
	    }

	    @Override
	    public DataResult<Optional<JobPosition>> getById(int jobPositionId) {
	        return new SuccessDataResult<Optional<JobPosition>>(jobPositionDao.findById(jobPositionId),"Veri Listelendi");
	    }

	

}
