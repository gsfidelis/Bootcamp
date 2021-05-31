package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundExceptions extends RuntimeException {

    public NotFoundExceptions() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}