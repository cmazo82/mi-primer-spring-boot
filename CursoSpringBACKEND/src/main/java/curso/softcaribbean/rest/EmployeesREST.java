package curso.softcaribbean.rest;

import curso.softcaribbean.model.Countries;
import curso.softcaribbean.model.Employees;
import curso.softcaribbean.services.CountriesService;
import curso.softcaribbean.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/Employees/")
public class EmployeesREST {
    @Autowired
    private EmployeesService employeesService;

    @GetMapping
    private ResponseEntity<List<Employees>> getAllEmployees(){
        return ResponseEntity.ok(employeesService.findAll());
    }

    @PostMapping
    private ResponseEntity<Employees> saveEmployees (@RequestBody Employees employees){
        try{
            Employees employeeGuardar = employeesService.save(employees);
            return ResponseEntity.created(new URI("/Countries/"+employeeGuardar.getEmployee_id())).body(employeeGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteEmployee(@PathVariable ("id") Long id){
        employeesService.deleteById(id);
        return ResponseEntity.ok(!(employeesService.findById(id)!=null));
    }

}
