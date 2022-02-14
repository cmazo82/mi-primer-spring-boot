package curso.softcaribbean.services;

import curso.softcaribbean.model.Job;
import curso.softcaribbean.model.Locations;
import curso.softcaribbean.repository.JobRepository;
import curso.softcaribbean.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class LocationsServices implements LocationsRepository {

    @Autowired
    private LocationsRepository locationsRepository;


    @Override
    public List<Locations> findAll() {
        return locationsRepository.findAll();
    }


    @Override
    public List<Locations> findAll(Sort sort) {
        return locationsRepository.findAll(sort);
    }

    @Override
    public Page<Locations> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Locations> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        locationsRepository.deleteById(id);

    }

    @Override
    public void delete(Locations entity) {
        locationsRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Locations> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Locations> S save(S entity) {
        return locationsRepository.save(entity);
    }

    @Override
    public <S extends Locations> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Locations> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Locations> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Locations> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Locations> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Locations getOne(Long aLong) {
        return null;
    }

    @Override
    public Locations getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Locations> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Locations> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Locations> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Locations> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Locations> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Locations> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Locations, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
