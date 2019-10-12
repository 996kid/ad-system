package com.kid.ad.service;


import com.kid.ad.vo.CreativeRequest;
import com.kid.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
