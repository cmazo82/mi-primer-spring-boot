package curso.softcaribbean.rest;

import curso.softcaribbean.model.Job;
import curso.softcaribbean.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/Job/")
public class JobREST {

    @Autowired
    private JobService jobService;

    @GetMapping
    private ResponseEntity<List<Job>> getAllJob(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping
    private ResponseEntity<Job> saveJob (@RequestBody Job job){
        try{
            Job jobGuardar = jobService.save(job);
            return ResponseEntity.created(new URI("/Job/"+jobGuardar.getJob_id())).body(jobGuardar);
        }catch (Exception e){
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @DeleteMapping(value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteJob(@PathVariable ("id") String id){
        jobService.deleteById(id);
        return ResponseEntity.ok(!(jobService.findById(id)!=null));
    }
}
