package com.hiberus.logistic.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.hiberus.commons.dto.LogisticDTO;
import com.hiberus.commons.dto.LogisticResponseDTO;
import com.hiberus.logistic.service.LogisticService;

import lombok.extern.java.Log;

@Log
@Service
public class LogisticServiceImpl implements LogisticService {

	@Override
	public LogisticResponseDTO createDelivery(LogisticDTO logisticDTO) {

		log.info("--- Starting Service---");
		log.info("Setting up delivery information...");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_MONTH, logisticDTO.getTotalNumberProducts());
		log.info("--- Finishing Service---");
		return new LogisticResponseDTO(cal.getTime(), logisticDTO.getAddress(),
				ThreadLocalRandom.current().nextLong(1000, 10000));
	}

}
