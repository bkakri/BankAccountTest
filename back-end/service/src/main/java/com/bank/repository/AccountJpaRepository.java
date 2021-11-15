package com.bank.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface AccountJpaRepository extends JpaRepository<AccountJpaEntity,String> {
	
	@Query("select acc from AccountJpaEntity acc  INNER JOIN acc.ClientJpaEntity clt where clt.name like %?1%")  
	public List<AccountJpaEntity> FindAccountByName(String name);
	
}
