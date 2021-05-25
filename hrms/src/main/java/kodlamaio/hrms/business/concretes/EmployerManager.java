package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;

import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		 return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		employerDao.save(employer);
        return new SuccessResult(" Eklendi");
	}

	@Override
	public Result delete(Employer employer) {
		 employerDao.delete(employer);
	      return new SuccessResult(" Silindi");
	}

	@Override
	public DataResult<Optional<Employer>> getById(int employerId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Optional<Employer>>(employerDao.findById(employerId),"Veri Listelendi");
	}
	


	}
