package com.semicolon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.semicolon.domain.Member;
import com.semicolon.domain.Role;

	@Repository
	public interface MemberRepository extends  CrudRepository<Member,Long> 
	{
		@Query("select m from Member m where m.role = :role")
		public List<Member> findMemberByRole(@Param("role") Role role);
 	}

