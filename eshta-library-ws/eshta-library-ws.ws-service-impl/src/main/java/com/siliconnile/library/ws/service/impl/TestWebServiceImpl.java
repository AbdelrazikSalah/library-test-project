package com.siliconnile.library.ws.service.impl;

import com.siliconnile.library.domain.SampleObject;
import com.siliconnile.library.dto.SampleObjectDTO;
import com.siliconnile.library.service.api.TestService;
import com.siliconnile.library.ws.service.api.TestWebService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletResponse;

/**
 * User: Andrew
 * Date: 6/27/13
 */
public class TestWebServiceImpl implements TestWebService {
    
    @Autowired
    private TestService testService;
    
    @Override
    public SampleObjectDTO getSampleObjectById(Long id, HttpServletResponse response) {
        SampleObject sampleObject = testService.getSampleObjectById(id);
        SampleObjectDTO result = null;
        if (sampleObject != null) {
            result = new SampleObjectDTO();
            result.setName(sampleObject.getName());
        }
        return result;
    }
}
