package curso.softcaribbean.rest;

import curso.softcaribbean.model.Locations;
import curso.softcaribbean.services.LocationsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path="/Locations/")
public class LocationsREST {

    @Autowired
    private LocationsServices locationsServices;

    @GetMapping
    private ResponseEntity<List<Locations>> getAllLocations() {
        return ResponseEntity.ok(locationsServices.findAll());
    }

    @PostMapping
    private ResponseEntity<Locations> saveLocations (@RequestBody Locations locations){
        try{
            Locations locationGuardar= locationsServices.save(locations);
            return ResponseEntity.created(new URI("/Locations/"+locationGuardar.getLocation_id())).body(locationGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    private ResponseEntity<Boolean> deleteLocation(@PathVariable("id") Long id){
        locationsServices.deleteById(id);
        return ResponseEntity.ok(!(locationsServices.findById(id)!=null));
    }
}
