package comspring.restfulapim2.exceptions;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<?> handleResponseException(ResponseStatusException e){

        log.error("Error ហើយ");
        Map<String, Object> body = new HashMap<>();
        body.put("Status Code : ", e.getStatusCode().value());
        body.put("Message : ", e.getMessage());
        body.put("Time Stamp : ", System.currentTimeMillis());
        return ResponseEntity.status(e.getStatusCode().value()).body(body);

    }


}
