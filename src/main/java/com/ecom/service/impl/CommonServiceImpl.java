package com.ecom.service.impl;

import com.ecom.service.ComonService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class CommonServiceImpl implements ComonService {

    @Override
    public void removeSessionMessage() {
        // TODO Auto-generated method stub
        HttpServletRequest request= ((ServletRequestAttributes)(RequestContextHolder.getRequestAttributes())).getRequest();
        request.getSession().removeAttribute("message");

    }
}
