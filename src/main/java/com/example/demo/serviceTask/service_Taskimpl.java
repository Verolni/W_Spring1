package com.example.demo.serviceTask;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.scheduling.config.Task;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class service_Taskimpl implements services_Task {


    @Override
    public List<Task> task_List_Cont(String title) {
        return List.of();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends services_Task> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends services_Task> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<services_Task> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public services_Task getOne(Long aLong) {
        return null;
    }

    @Override
    public services_Task getById(Long aLong) {
        return null;
    }

    @Override
    public services_Task getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends services_Task> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends services_Task> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends services_Task> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends services_Task> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends services_Task> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends services_Task> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends services_Task, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends services_Task> S save(S entity) {
        return null;
    }

    @Override
    public <S extends services_Task> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<services_Task> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<services_Task> findAll() {
        return List.of();
    }

    @Override
    public List<services_Task> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(services_Task entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends services_Task> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<services_Task> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<services_Task> findAll(Pageable pageable) {
        return null;
    }
}
