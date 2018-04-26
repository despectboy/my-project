package by.kirill.aucion.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import by.kirill.auction.beans.AccountBean;

@RestController
@RequestMapping(value="/api/accounts",
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountApi {
@RequestMapping(method = RequestMethod.GET)
public ResponseEntity<AccountBean> getUser(){
	AccountBean ab = new AccountBean();
	ab.setId(1);
	ab.setEmail("test@httg.by");
	return new ResponseEntity<AccountBean>(ab, HttpStatus.OK);
}
}
