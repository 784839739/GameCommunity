package com.rain.gameCommunity.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rain.gameCommunity.entity.GameEntity;
import com.rain.gameCommunity.entity.UserEntity;
import com.rain.gameCommunity.utils.PagingData;

@Component
public interface GameService {

	public List<GameEntity> showAllGame() throws Exception;

	public GameEntity showGame(String gameName) throws Exception;
	
	public GameEntity showGameById(String id) throws Exception;
	
	public List<GameEntity> showGamesByGameType(long gameType, PagingData pagingData) throws Exception;
	
	public Integer queryGameCountByNameCondition(String nameCondition) throws Exception;
	
	public int showGamesCountByGameType(long gameType) throws Exception;
	
	public List<GameEntity> showGameByCondition(String nameCondition, PagingData pagingData) throws Exception;
	
	public int showGameCountByCondition(String nameCondition) throws Exception;
	
	public UserEntity showUserGameByUser(UserEntity user) throws Exception;
	
	public List<GameEntity> showGamesByIds(List<Long> ids) throws Exception;
	
	public void updateGameEntity(GameEntity game) throws Exception;
}
