package ghartur.msemail.controllers;

import ghartur.msemail.models.EmailModel;
import ghartur.msemail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class EmailController {

    @Autowired
    EmailService emailService;

}
