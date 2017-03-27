package com.rain.gameCommunity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rain.gameCommunity.dao.GameDAO;
import com.rain.gameCommunity.entity.GameEntity;
import com.rain.gameCommunity.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameDAO gameDao;

	public List<GameEntity> showAllGame() throws Exception {

		List<GameEntity> games = new ArrayList<GameEntity>();
		games = gameDao.queryAllGame();
		return games;
	}

	@Override
	public GameEntity showGame(String gameName) throws Exception {
		GameEntity game = new GameEntity();
		game = gameDao.queryGameByName(gameName);
		return game;
	}

	@Override
	public GameEntity showGameById(String id) throws Exception {
		long idLong = Long.parseLong(id);
		GameEntity game = gameDao.queryGameById(idLong);
		return game;
	}

	@Override
	public List<GameEntity> showGamesByGameType(String gameType) throws Exception {
		long gameTypeId = Long.parseLong(gameType);
		List<GameEntity> games = gameDao.queryGameByGameType(gameTypeId);
		return games;
	}

	@Override
	public Integer queryGameCountByNameCondition(String nameCondition) throws Exception {
		return gameDao.queryGameCountByNameCondition(nameCondition);
	}

}
