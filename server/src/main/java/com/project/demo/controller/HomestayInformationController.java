package com.project.demo.controller;

import com.project.demo.entity.HomestayInformation;
import com.project.demo.service.HomestayInformationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

/**
 * 民宿信息：(HomestayInformation)表控制层
 *
 */
@RestController
@RequestMapping("/homestay_information")
public class HomestayInformationController extends BaseController<HomestayInformation, HomestayInformationService> {

    /**
     * 民宿信息对象
     */
    @Autowired
    public HomestayInformationController(HomestayInformationService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
