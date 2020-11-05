/*영속성 전이*/
/*영속성 전이를 이용하여 등록하기*/
package com.rubypaper.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
@Entity
public class Member {
	@Id
	@Column(name="MEMBER_ID")
	private String id;
	private String password;
	private String name;
	private String role;
	
	@OneToMany(mappedBy = "member", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Board> boardList = new ArrayList<Board>();
}

//package com.rubypaper.domain;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.FetchType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter 
//@Setter
//@ToString
//@Entity
//public class Member {
//	@Id
//	@Column(name="MEMBER_ID")
//	private String id;
//	private String password;
//	private String name;
//	private String role;
//	
//	@OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
//	private List<Board> boardList = new ArrayList<Board>();
//}