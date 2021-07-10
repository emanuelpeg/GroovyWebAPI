package com.assembly.demo.controllers.utils

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "not found")
class NotFoundException<T> extends RuntimeException {

    private Long id

    NotFoundException() {}

    NotFoundException(Long id) {
        this.id = id
    }

    @Override
    String getMessage() {
        return T + " not found"
    }
}
