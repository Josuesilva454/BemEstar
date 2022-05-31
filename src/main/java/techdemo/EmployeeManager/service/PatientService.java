package techdemo.EmployeeManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techdemo.EmployeeManager.Code.EmployeeRepo;
import techdemo.EmployeeManager.Employee;

import java.util.List;
import java.util.UUID;

@Service
public class PatientService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public PatientService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;

    }

    public Employee addEmployee(Employee employee) {
        employee.setPatientcode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);


    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        try {
            return employeeRepo.findEmployeeById(id);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

        public void deleteEmployee (Long id){
            employeeRepo.deleteEmployeeById(id);

        }
    }
