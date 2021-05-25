package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	 private EmployeeDao employeeDao;

	    @Autowired
	    public EmployeeManager(EmployeeDao employeeDao) {
	        this.employeeDao = employeeDao;
	    }

	    @Override
	    public DataResult<List<Employee>> getAll() {
	        return new SuccessDataResult<List<Employee>>(employeeDao.findAll(),"Veriler Listelendi");
	    }

	    @Override
	    public Result add(Employee employee) {
	        employeeDao.save(employee);
	        return new SuccessResult(" Eklendi");
	    }

	    @Override
	    public Result delete(Employee employee) {
	        employeeDao.delete(employee);
	        return new SuccessResult(" Silindi");
	    }

	    @Override
	    public DataResult<Optional<Employee>> getById(int employeeId) {
	        return new SuccessDataResult<Optional<Employee>>(employeeDao.findById(employeeId),"Veri Listelendi");
	    }

}
