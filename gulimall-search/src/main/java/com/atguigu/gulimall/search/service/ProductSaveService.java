package com.atguigu.gulimall.search.service;


import com.atguigu.common.to.es.SkuEsModel;

import java.util.List;

/**
 * @author yaoxinjia
 */
public interface ProductSaveService {
    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws Exception;
}
