package curso.softcaribbean.services;

import curso.softcaribbean.model.Job;
import curso.softcaribbean.repository.JobRepository;
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
public class JobService implements JobRepository{

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> findAll(Sort sort) {
        return jobRepository.findAll(sort);
    }

    @Override
    public Page<Job> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Job> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String id) {
        jobRepository.deleteById(id);

    }

    @Override
    public void delete(Job entity) {
        jobRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Job> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Job> S save(S entity) {
        return jobRepository.save(entity);
    }


    @Override
    public <S extends Job> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Job> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Job> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Job> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Job> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Job getOne(String s) {
        return null;
    }

    @Override
    public Job getById(String s) {
        return null;
    }

    @Override
    public <S extends Job> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Job> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Job> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Job> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Job> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Job> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Job, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
