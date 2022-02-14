package curso.softcaribbean.services;

import curso.softcaribbean.model.Job;
import curso.softcaribbean.model.Regions;
import curso.softcaribbean.repository.RegionsRepository;
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
public class RegionsService implements RegionsRepository {

    @Autowired
    private RegionsRepository regionsRepository;


    //Método de Listar
    @Override
    public List<Regions> findAll() {
        return regionsRepository.findAll();
    }

    @Override
    public List<Regions> findAll(Sort sort)  {
        return regionsRepository.findAll(sort);
    }

    @Override
    public Page<Regions> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Regions> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        regionsRepository.deleteById(id);

    }

    //Método de Borrar
    @Override
    public void delete(Regions entity) {
        regionsRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {


    }

    @Override
    public void deleteAll(Iterable<? extends Regions> entities) {

    }

    @Override
    public void deleteAll() {

    }

    //Metodo de Guardar
    @Override
    public <S extends Regions> S save(S entity) {
        return regionsRepository.save(entity);
    }


    @Override
    public <S extends Regions> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Regions> findById(Long aLong) {
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
    public <S extends Regions> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Regions> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Regions> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Regions getOne(Long aLong) {
        return null;
    }

    @Override
    public Regions getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Regions> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Regions> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Regions> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Regions> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Regions> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Regions> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Regions, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
