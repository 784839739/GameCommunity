package com.rain.gameCommunity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rain.gameCommunity.entity.GameEntity;

public interface GameDAO {

	public List<GameEntity> queryAllGame();

	public GameEntity queryGameByName(@Param("gameName") String gameName);

	public GameEntity queryGameById(@Param("id") long id);
	
	public List<GameEntity> queryGameByGameType(@Param("gameType") long gameType);
	
	public Integer queryGameCountByNameCondition(@Param("nameCondition") String nameCondition);
}
