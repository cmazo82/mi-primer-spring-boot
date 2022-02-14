package curso.softcaribbean.rest;


import curso.softcaribbean.model.Job;
import curso.softcaribbean.model.Jobhistory;
import curso.softcaribbean.services.JobhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/Jobhistory/")
public class JobhistoryREST {

    @Autowired
    private JobhistoryService jobhistoryService;

    @GetMapping
    private ResponseEntity<List<Jobhistory>> getAllJobhistory(){
        return ResponseEntity.ok(jobhistoryService.findAll());
    }

    @PostMapping
    private ResponseEntity<Jobhistory> saveJobhistory (@RequestBody Jobhistory jobhistory){
        try{
            Jobhistory jobhistoryGuardar = jobhistoryService.save(jobhistory);
            return ResponseEntity.created(new URI("/Jobhistory/"+ jobhistoryGuardar.getEmployee_id())).body(jobhistoryGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteJobhistory(@PathVariable ("id") Long id){
        jobhistoryService.deleteById(id);
        return ResponseEntity.ok(!(jobhistoryService.findById(id)!=null));
    }



}
