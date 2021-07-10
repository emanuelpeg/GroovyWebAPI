package com.assembly.demo.services

import com.assembly.demo.models.Demo
import com.assembly.demo.repositories.DemoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DemoServiceImpl implements DemoService {

    @Autowired
    DemoRepository repository

    @Override
    List<Demo> findAll() {
        return repository.findAll()
    }

    @Override
    Optional<Demo> findById(Integer id) {
        return repository.findById(id)
    }

    @Override
    Demo insert(Demo demo) {
        return repository.save(demo)
    }

    @Override
    Demo update(Demo demo) {
        return repository.save(demo)
    }

    @Override
    Optional<Demo> delete(Integer id) {
        Optional<Demo> demo = repository.findById(id)
        if (demo.isPresent()) {
            repository.delete(demo.get())
        }
        return demo
    }
}
