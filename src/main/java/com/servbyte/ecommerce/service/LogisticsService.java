package com.servbyte.ecommerce.service;

import com.servbyte.ecommerce.dtos.LogisticsDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface LogisticsService {
    void registerLogisticsCompany(Optional<LogisticsDto> logisticsDto);
}
