package com.greenish_orchid.mapper;

import java.util.List;
import java.util.Map;

import com.greenish_orchid.model.Movie;

/**
 * @author CFC
 *
 *	时间2019年9月4日
 */
public interface BrandMapper {

	List<Movie> queryAllMovie(Map<String, Object> map);

}
