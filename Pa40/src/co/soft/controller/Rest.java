package co.soft.controller;

import java.util.ArrayList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.soft.beans.Data1;

@RestController
public class Rest {

	@GetMapping("/t2")
	public ResponseEntity<ArrayList<Data1>> t2() {
		Data1 d1 = new Data1(40, 44.33, false, "aa");
		Data1 d2 = new Data1(60, 11.55, true, "bb");
		Data1 d3 = new Data1(90, 99.33, false, "cc");
		
		
	//Restful api(자원 명시, http method -> CRUD 적용하는 것)
		
		//representational state transfer (표현 상태 전달) json, xml을 통해 데이터 전달
		
		//CRUD
		//Create(생성)
		//Read(조회)
		//Update(수정)
		//Delete(삭제)
		
		ArrayList<Data1> li = new ArrayList<Data1>();
		
		li.add(d1);
		li.add(d2);
		li.add(d3);
		
		ResponseEntity<ArrayList<Data1>> en = new ResponseEntity<ArrayList<Data1>>(li, HttpStatus.OK);
		
		return en;
	}
}