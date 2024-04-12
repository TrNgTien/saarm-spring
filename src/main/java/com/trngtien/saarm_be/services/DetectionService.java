package com.trngtien.saarm_be.services;

import org.slf4j.*;
import org.springframework.stereotype.Service;


@Service
public class DetectionService {

    private static final Logger logger = LoggerFactory.getLogger(DetectionService.class);

    public int getWaterMeter () throws Exception {
        logger.info("data: " + 5);
        return 5;
    }
}
