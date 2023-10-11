package dio.me.domain.controller.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;


@RestControllerAdvice
public class GlobalExceptionHandle {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandle.class);


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBusinessException (IllegalArgumentException businessException){
        return new ResponseEntity<>(businessException.getMessage().toUpperCase(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource Id not found.", HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException){
        var message = "Unexpected Server Error";
        logger.error(message,unexpectedException );
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
