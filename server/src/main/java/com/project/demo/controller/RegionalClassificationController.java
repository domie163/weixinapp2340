package com.project.demo.controller;

import com.project.demo.entity.RegionalClassification;
import com.project.demo.service.RegionalClassificationService;
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
 * 地区分类：(RegionalClassification)表控制层
 *
 */
@RestController
@RequestMapping("/regional_classification")
public class RegionalClassificationController extends BaseController<RegionalClassification, RegionalClassificationService> {

    /**
     * 地区分类对象
     */
    @Autowired
    public RegionalClassificationController(RegionalClassificationService service) {
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
