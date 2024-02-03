package service;

import lombok.RequiredArgsConstructor;
import repo.SchoolRepository;

import org.springframework.stereotype.Service;

import entity.School;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;
    private final StudentClient client;

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> findAllSchools() {
        return repository.findAll();
    }
}
