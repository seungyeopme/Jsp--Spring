package co.soft.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.soft.beans.data1;

@RestController
public class Rest {

	
	@GetMapping("/t2")
	public ResponseEntity<ArrayList<data1>> t2() {
		data1 d1 = new data1("d1", 1.2, true, 11);
		data1 d2 = new data1("d2", 2.2, false, 22);
		data1 d3 = new data1("d3", 3.2, true, 33);
		data1 d4 = new data1("d4", 4.2, false, 44);
		//Rest api(자원 명시, http method->crud적용하는 것)
		
		ArrayList<data1> al = new ArrayList();
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		
		ResponseEntity<ArrayList<data1>> en = new ResponseEntity<ArrayList<data1>>(al,HttpStatus.OK);
		return en;
	}
	
	
}
