package com.atguigu.gulimall.search.service;

import com.atguigu.gulimall.search.vo.SearchParam;
import com.atguigu.gulimall.search.vo.SearchResult;
/**
 * @author yaoxinjia
 */
public interface MallSearchService {
    SearchResult search(SearchParam param);
}
