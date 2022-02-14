package curso.softcaribbean.services;

import curso.softcaribbean.model.Employees;
import curso.softcaribbean.repository.EmployeesRepository;
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
public class EmployeesService implements EmployeesRepository{

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public List<Employees> findAll() {
        return employeesRepository.findAll();
    }

    @Override
    public List<Employees> findAll(Sort sort) {
        return employeesRepository.findAll(sort);
    }

    @Override
    public Page<Employees> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Employees> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        employeesRepository.deleteById(id);

    }

    @Override
    public void delete(Employees entity) {
        employeesRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employees> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Employees> S save(S entity) {
        return employeesRepository.save(entity);
    }

    @Override
    public <S extends Employees> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Employees> findById(Long aLong) {
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
    public <S extends Employees> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Employees> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Employees> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Employees getOne(Long aLong) {
        return null;
    }

    @Override
    public Employees getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Employees> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Employees> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Employees> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Employees> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Employees> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Employees> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Employees, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
