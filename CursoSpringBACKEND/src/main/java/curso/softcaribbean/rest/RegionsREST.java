package curso.softcaribbean.rest;

import curso.softcaribbean.model.Job;
import curso.softcaribbean.model.Regions;
import curso.softcaribbean.services.RegionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/Regions/")
public class RegionsREST {

    @Autowired
    private RegionsService regionsService;

    @GetMapping
    private ResponseEntity<List<Regions>> getAllRegions() {
        return ResponseEntity.ok(regionsService.findAll());
    }

    @PostMapping
    private ResponseEntity<Regions> saveRegions (@RequestBody Regions regions){
        try{
            Regions regionsGuardar = regionsService.save(regions);
            return ResponseEntity.created(new URI("/Regions/"+regionsGuardar.getRegion_id())).body(regionsGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteRegions(@PathVariable ("id") Long id){
        regionsService.deleteById(id);
        return ResponseEntity.ok(!(regionsService.findById(id)!=null));
    }
}
