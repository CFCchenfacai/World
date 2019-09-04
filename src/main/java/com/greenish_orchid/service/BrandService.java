package com.greenish_orchid.service;

import java.util.List;
import java.util.Map;

import com.greenish_orchid.model.Movie;

/**
 * @author CFC
 *
 *	时间2019年9月4日
 */
public interface BrandService {

	List<Movie> queryAllMovie(Map<String, Object> map);

}
