package com.hiberus.logistic.service;

import com.hiberus.commons.dto.LogisticDTO;
import com.hiberus.commons.dto.LogisticResponseDTO;

public interface LogisticService {

	public LogisticResponseDTO createDelivery(LogisticDTO logisticDTO);
}
