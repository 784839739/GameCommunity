package com.rain.gameCommunity.entity;

import java.io.Serializable;
import java.util.List;

public class UserEntity implements Serializable {

	// id
	private long id;

	// �û���
	private String username;

	// ����
	private String password;

	// ע��ʱ��
	private String registeTime;

	// �Ա�
	private int sex;

	// ����
	private int level;

	// ����
	private int exp;

	// �Ƿ��ǹ���Ա
	private int isManager;

	// ����
	private String introduce;

	// ͷ��·��
	private String head;

	// �ѹ������Ϸ����,�ָ���
	private String games;

	// ��Ϸʵ��
	private List<GameEntity> hasBuyedGames;

	public UserEntity() {
		super();
	}

	public UserEntity(long id, String username, String password, String registeTime, int sex, int level, int exp,
			int isManager, String introduce, String head, String games, List<GameEntity> hasBuyedGames) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.registeTime = registeTime;
		this.sex = sex;
		this.level = level;
		this.exp = exp;
		this.isManager = isManager;
		this.introduce = introduce;
		this.head = head;
		this.games = games;
		this.hasBuyedGames = hasBuyedGames;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", registeTime="
				+ registeTime + ", sex=" + sex + ", level=" + level + ", exp=" + exp + ", isManager=" + isManager
				+ ", introduce=" + introduce + ", head=" + head + ", games=" + games + ", hasBuyedGames="
				+ hasBuyedGames + "]";
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the registeTime
	 */
	public String getRegisteTime() {
		return registeTime;
	}

	/**
	 * @param registeTime
	 *            the registeTime to set
	 */
	public void setRegisteTime(String registeTime) {
		this.registeTime = registeTime;
	}

	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}

	/**
	 * @param exp
	 *            the exp to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}

	/**
	 * @return the isManager
	 */
	public int getIsManager() {
		return isManager;
	}

	/**
	 * @param isManager
	 *            the isManager to set
	 */
	public void setIsManager(int isManager) {
		this.isManager = isManager;
	}

	/**
	 * @return the introduce
	 */
	public String getIntroduce() {
		return introduce;
	}

	/**
	 * @param introduce
	 *            the introduce to set
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	/**
	 * @return the head
	 */
	public String getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(String head) {
		this.head = head;
	}

	/**
	 * @return the games
	 */
	public String getGames() {
		return games;
	}

	/**
	 * @param games
	 *            the games to set
	 */
	public void setGames(String games) {
		this.games = games;
	}

	/**
	 * @return the hasBuyedGames
	 */
	public List<GameEntity> getHasBuyedGames() {
		return hasBuyedGames;
	}

	/**
	 * @param hasBuyedGames
	 *            the hasBuyedGames to set
	 */
	public void setHasBuyedGames(List<GameEntity> hasBuyedGames) {
		this.hasBuyedGames = hasBuyedGames;
	}

}
