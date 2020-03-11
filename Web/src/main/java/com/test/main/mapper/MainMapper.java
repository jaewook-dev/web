package com.test.main.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.main.dto.Member;

@Mapper
public interface MainMapper {

	public List<Member> getMemberList();
	
}
