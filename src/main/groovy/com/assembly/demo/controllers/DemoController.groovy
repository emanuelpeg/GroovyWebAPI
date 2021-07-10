package com.assembly.demo.controllers

import com.assembly.demo.controllers.utils.NotFoundException
import com.assembly.demo.models.Demo
import com.assembly.demo.services.DemoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('demo')
class DemoController {

    @Autowired
    DemoService service

    @GetMapping
    List<Demo> findAll(){
        service.findAll()
    }

    @PostMapping
    Demo save(@RequestBody Demo demo){
        service.insert(demo)
    }

    @PutMapping
    Demo update(@RequestBody Demo demo){
        service.update(demo)
    }

    @DeleteMapping('/{id}')
    delete(@PathVariable Integer id){
        Optional<Demo> demo = service.delete(id)
        if (!demo.isPresent()) {
            throw new NotFoundException<Demo>(id)
        }
        return demo.get()
    }

    @GetMapping('/{id}')
    Demo getById(@PathVariable Integer id){
        Optional<Demo> demo = service.findById(id)
        if (!demo.isPresent()) {
            throw new NotFoundException<Demo>(id)
        }
        return demo.get()
    }

}
