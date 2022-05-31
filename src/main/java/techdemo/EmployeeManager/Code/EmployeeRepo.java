package techdemo.EmployeeManager.Code;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import techdemo.EmployeeManager.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
   void deleteEmployeeById(Long id);

   Employee findEmployeeById(Long id);
}
