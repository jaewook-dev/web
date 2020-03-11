package com.test.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.main.dto.Member;
import com.test.main.mapper.MainMapper;

@Service
public class MainService {

	@Autowired
	private MainMapper mainMapper;
	
	public List<Member> getMemberList(){
		return mainMapper.getMemberList();
	}
}
