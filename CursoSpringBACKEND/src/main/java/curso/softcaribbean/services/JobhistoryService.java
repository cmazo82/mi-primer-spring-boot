package curso.softcaribbean.services;

import curso.softcaribbean.model.Jobhistory;
import curso.softcaribbean.repository.JobhistoryRepository;
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
public class JobhistoryService implements JobhistoryRepository {


    @Autowired
    private JobhistoryRepository jobhistoryRepository;


    @Override
    public List<Jobhistory> findAll() {
        return jobhistoryRepository.findAll();
    }

    @Override
    public List<Jobhistory> findAll(Sort sort) {
        return jobhistoryRepository.findAll(sort);
    }

    @Override
    public Page<Jobhistory> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Jobhistory> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        jobhistoryRepository.deleteById(id);
    }

    @Override
    public void delete(Jobhistory entity) {
        jobhistoryRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Jobhistory> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Jobhistory> S save(S entity) {
        return jobhistoryRepository.save(entity);
    }

    @Override
    public <S extends Jobhistory> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Jobhistory> findById(Long aLong) {
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
    public <S extends Jobhistory> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Jobhistory> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Jobhistory> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Jobhistory getOne(Long aLong) {
        return null;
    }

    @Override
    public Jobhistory getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Jobhistory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Jobhistory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Jobhistory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Jobhistory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Jobhistory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Jobhistory> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Jobhistory, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
