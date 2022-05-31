package techdemo.EmployeeManager.employeemanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import techdemo.EmployeeManager.Employee;
import techdemo.EmployeeManager.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResouce {
    private final PatientService patientService;

    public EmployeeResouce(PatientService patientService) {
        this.patientService = patientService;

    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = patientService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = patientService.findEmployeeById(id);
         return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee>addEmployee(@RequestBody Employee employee){
        Employee newEmployee = patientService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Employee>updateEmployee(@RequestBody Employee employee){
        Employee updateEmployee = patientService.addEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete{id}")
    public ResponseEntity<?>deleteEmployee(@PathVariable ("id")Long id){
        patientService.deleteEmployee(id);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
}