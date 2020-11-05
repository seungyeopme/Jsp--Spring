/*영속성 전이*/
/*영속성 전이를 이용하여 등록하기*/
package com.rubypaper.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "member")
@Entity
public class Board {
	@Id @GeneratedValue
	private Long seq;
	private String title;
//	private String writer;
	private String content;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;
	private Long cnt;
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID", nullable = false)
	private Member member;
	
	public void setMember(Member member) {
		this.member = member;
		member.getBoardList().add(this);
	}
}

/*양방향 연관관계 매핑하기*/
/*양방향 매핑 설정하기*/
/*RelationMapptinTest.java에서 실행*/
//package com.rubypaper.domain;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString(exclude = "member")
//@Entity
//public class Board {
//	@Id @GeneratedValue
//	private Long seq;
//	private String title;
////	private String writer;
//	private String content;
//	@Temporal(value = TemporalType.TIMESTAMP)
//	private Date createDate;
//	private Long cnt;
//	
//	@ManyToOne
//	@JoinColumn(name="MEMBER_ID", nullable = false)
//	private Member member;
//}

/*다대일 연관관계 테스트하기*/
/*게시 글 상세 조회 테스트*/
/*inner join*/
/*RelationMapptinTest.java에서 실행*/
//package com.rubypaper.domain;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@Entity
//public class Board {
//	@Id @GeneratedValue
//	private Long seq;
//	private String title;
////	private String writer;
//	private String content;
//	@Temporal(value = TemporalType.TIMESTAMP)
//	private Date createDate;
//	private Long cnt;
//	
//	@ManyToOne
//	@JoinColumn(name="MEMBER_ID", nullable = false)
//	private Member member;
//}

/*다대일 연관관계 테스트하기*/
/*게시 글 상세 조회 테스트*/
/*outer join*/
/*RelationMapptinTest.java에서 실행*/
//package com.rubypaper.domain;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@Entity
//public class Board {
//	@Id @GeneratedValue
//	private Long seq;
//	private String title;
////	private String writer;
//	private String content;
//	@Temporal(value = TemporalType.TIMESTAMP)
//	private Date createDate;
//	private Long cnt;
//	
//	@ManyToOne
//	@JoinColumn(name="MEMBER_ID")
//	private Member member;
//}

//package com.rubypaper.domain;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@Getter
//@Setter
//@ToString
//@Entity
//public class Board {
//	@Id @GeneratedValue
//	private Long seq;
//	private String title;
//	private String writer;
//	private String content;
//	@Temporal(value = TemporalType.TIMESTAMP)
//	private Date createDate;
//	private Long cnt;
//}