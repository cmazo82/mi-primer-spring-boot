package curso.softcaribbean.services;

import curso.softcaribbean.model.Departments;
import curso.softcaribbean.repository.DepartmentsRepostiory;
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
public class DepartmentService implements DepartmentsRepostiory {

    @Autowired
    private DepartmentsRepostiory departmentsRepostiory;


    @Override
    public List<Departments> findAll() {
        return departmentsRepostiory.findAll();
    }

    @Override
    public List<Departments> findAll(Sort sort) {
        return departmentsRepostiory.findAll(sort);
    }

    @Override
    public Page<Departments> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Departments> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        departmentsRepostiory.deleteById(id);

    }

    @Override
    public void delete(Departments entity) {
        departmentsRepostiory.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Departments> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Departments> S save(S entity) {
        return departmentsRepostiory.save(entity);
    }

    @Override
    public <S extends Departments> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Departments> findById(Long aLong) {
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
    public <S extends Departments> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Departments> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Departments> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Departments getOne(Long aLong) {
        return null;
    }

    @Override
    public Departments getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Departments> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Departments> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Departments> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Departments> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Departments> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Departments> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Departments, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
