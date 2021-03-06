package com.rain.gameCommunity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.rain.gameCommunity.entity.GameTypeEntity;

@Repository
public interface GameTypeDAO {

	public List<GameTypeEntity> queryAllGameTypes();
	
	public GameTypeEntity queryGameTypeById(@Param("id") long id);
	
	public Integer queryGameTypeCount ();
	
	public List<GameTypeEntity> queryGameTypesByPage(@Param("startLocation") int startLocation, @Param("perPageNum") int perPageNum);
}
