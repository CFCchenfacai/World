package com.greenish_orchid.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.greenish_orchid.mapper.BrandMapper;
import com.greenish_orchid.model.Movie;


/**
 * @author CFC
 *
 *	时间2019年9月4日
 */
@Service
public class BrandServiceImpl implements BrandService {

	@Resource
	private BrandMapper mapper;

	@Override
	public List<Movie> queryAllMovie(Map<String, Object> map) {
		return mapper.queryAllMovie(map);
	}
	
}
