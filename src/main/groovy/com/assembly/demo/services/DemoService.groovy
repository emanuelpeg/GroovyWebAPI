package com.assembly.demo.services

import com.assembly.demo.models.Demo

interface DemoService {

    List<Demo> findAll()

    Optional<Demo> findById(Integer todoId)

    Demo insert(Demo demo)

    Demo update(Demo demo)

    Optional<Demo> delete(Integer id)

}