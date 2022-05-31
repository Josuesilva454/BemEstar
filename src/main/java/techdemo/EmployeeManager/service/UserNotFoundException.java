package techdemo.EmployeeManager.service;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String messege) {
        super(messege);
    }
}
