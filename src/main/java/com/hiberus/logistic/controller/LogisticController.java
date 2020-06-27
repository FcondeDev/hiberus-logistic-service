package com.hiberus.logistic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.commons.dto.JsonDTO;
import com.hiberus.commons.dto.LogisticDTO;
import com.hiberus.commons.dto.LogisticResponseDTO;
import com.hiberus.logistic.service.LogisticService;

@RestController
public class LogisticController {

	@Autowired
	private LogisticService logisticService;

	@PostMapping("logistics")
	public ResponseEntity<JsonDTO<LogisticResponseDTO>> store(@Valid @RequestBody LogisticDTO logisticDTO) {
		return new ResponseEntity<>(new JsonDTO<>(logisticService.createDelivery(logisticDTO)), HttpStatus.OK);
	}

}
