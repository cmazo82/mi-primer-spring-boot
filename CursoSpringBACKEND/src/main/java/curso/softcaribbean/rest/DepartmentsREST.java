package curso.softcaribbean.rest;


import curso.softcaribbean.model.Countries;
import curso.softcaribbean.model.Departments;
import curso.softcaribbean.services.CountriesService;
import curso.softcaribbean.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/Departments/")
public class DepartmentsREST {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    private ResponseEntity<List<Departments>> getAllDepartments(){
        return ResponseEntity.ok(departmentService.findAll());
    }

    @PostMapping
    private ResponseEntity<Departments> saveDepartments (@RequestBody Departments departments){
        try{
            Departments departmentGuardar = departmentService.save(departments);
            return ResponseEntity.created(new URI("/Departments/"+departmentGuardar.getDepartment_id())).body(departmentGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteDepartment(@PathVariable ("id") Long id){
        departmentService.deleteById(id);
        return ResponseEntity.ok(!(departmentService.findById(id)!=null));
    }
}
