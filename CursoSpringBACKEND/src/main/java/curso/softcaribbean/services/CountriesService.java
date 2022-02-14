package curso.softcaribbean.services;

import curso.softcaribbean.model.Countries;
import curso.softcaribbean.repository.CountriesRepository;
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
public class CountriesService implements CountriesRepository {

    @Autowired
    private CountriesRepository countriesRepository;

    @Override
    public List<Countries> findAll() {
        return countriesRepository.findAll();
    }

    @Override
    public List<Countries> findAll(Sort sort) {
        return countriesRepository.findAll(sort);
    }

    @Override
    public Page<Countries> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Countries> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String id) {
        countriesRepository.deleteById(id);
    }

    @Override
    public void delete(Countries entity) {
        countriesRepository.delete(entity);

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Countries> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Countries> S save(S entity) {
        return countriesRepository.save(entity);
    }

    @Override
    public <S extends Countries> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Countries> findById(String s) {
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
    public <S extends Countries> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Countries> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Countries> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Countries getOne(String s) {
        return null;
    }

    @Override
    public Countries getById(String s) {
        return null;
    }

    @Override
    public <S extends Countries> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Countries> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Countries> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Countries> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Countries> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Countries> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Countries, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
