package com.eazybytes.accounts.controller;

import static com.eazybytes.accounts.constants.AccountsConstants.STATUS_201;
import static com.eazybytes.accounts.constants.AccountsConstants.MESSAGE_201;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import com.eazybytes.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(
    path = "/api",
    produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

  private IAccountsService iAccountsService;

  @PostMapping("/create")
  public ResponseEntity<ResponseDto> create(@RequestBody CustomerDto customerDto) {

    return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(STATUS_201, MESSAGE_201));
  }
}