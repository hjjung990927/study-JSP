package com.app.repository.member.dao;

import java.util.Optional;

import org.apache.ibatis.session.SqlSession;

import com.app.domain.member.vo.MemberVO;
import com.app.mybatis.config.MyBatisConfig;

//MemberDAO: 컨트롤러와 DB를 이어주는 다리 역할
//MyBatis의 SqlSession을 이용해 insert, select 쿼리 실행
public class MemberDAO {
	public SqlSession sqlSession;
//	쿼리를 실행
	
	public MemberDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
//	SqlSessionFactory를 가져오고, 자동 커밋 한다.
	
//	회원가입
	public void insert(MemberVO memberVO) {
		sqlSession.insert("member.insert", memberVO);
	}
//	member.insert: memberMapper.xml에서 insert id="insert"와 연결됩니다
	
//	로그인
	public MemberVO selectForLogin(MemberVO memberVO) {
		return sqlSession.selectOne("member.selectForLogin", memberVO);
	}
//	selectOne(): DB에서 로그인 정보와 일치하는 회원 한 명만 가져온다.
}



















