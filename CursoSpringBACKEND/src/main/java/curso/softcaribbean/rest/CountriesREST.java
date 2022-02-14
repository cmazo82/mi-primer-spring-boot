package curso.softcaribbean.rest;
import curso.softcaribbean.model.Countries;
import curso.softcaribbean.services.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/Countries/")
public class CountriesREST {

    @Autowired
    private CountriesService countriesService;

    @GetMapping
    private ResponseEntity<List<Countries>> getAllCountries(){
        return ResponseEntity.ok(countriesService.findAll());
    }

    @PostMapping
    private ResponseEntity<Countries> saveCountries (@RequestBody Countries countries){
        try{
            Countries countryGuardar = countriesService.save(countries);
            return ResponseEntity.created(new URI("/Countries/"+countryGuardar.getCountry_id())).body(countryGuardar);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteCountry(@PathVariable ("id") String id){
        countriesService.deleteById(id);
        return ResponseEntity.ok(!(countriesService.findById(id)!=null));
    }


}
