package com.rain.gameCommunity.entity;

import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("GameEntity")
public class GameEntity implements Serializable {

	// ��Ϸ���
	private int gameNum;

	// ��Ϸ��С
	private String size;

	// ����ʱ��
	private String buildDate;

	// ��Ϸ����
	private String gameName;

	// ��Ϸ����
	private List<CommentEntity> comments;

	// ��Ϸ����
	private String introduce;

	// ��Ϸ�۸�
	private double price;

	// ��Ϸ����
	private double cutOff;

	// ϵͳ֧��
	private int systemTypeNum;

	// ��ϷͼƬ
	private List<File> pictures;

	// ��Ϸ�汾
	private String version;

	// ��Ϸ·��
	private String path;

	// ϵͳ֧��
	private SystemSupport systemSupport;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	public GameEntity() {
		super();
		this.cutOff = 1;
		this.version = "1.0.0";

	}

	public GameEntity(int gameNum, String size, String buildDate, String gameName, List<CommentEntity> comments,
			String introduce, double price, double cutOff, int systemTypeNum, List<File> pictures, String version,
			String path, SystemSupport systemSupport) {
		super();
		this.gameNum = gameNum;
		this.size = size;
		this.buildDate = buildDate;
		this.gameName = gameName;
		this.comments = comments;
		this.introduce = introduce;
		this.price = price;
		this.cutOff = cutOff;
		this.systemTypeNum = systemTypeNum;
		this.pictures = pictures;
		this.version = version;
		this.path = path;
		this.systemSupport = systemSupport;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getGameNum() {
		return gameNum;
	}

	public void setGameNum(int gameNum) {
		this.gameNum = gameNum;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCutOff() {
		return cutOff;
	}

	public void setCutOff(double cutOff) {
		this.cutOff = cutOff;
	}

	public int getSystemTypeNum() {
		return systemTypeNum;
	}

	public void setSystemTypeNum(int systemTypeNum) {
		this.systemTypeNum = systemTypeNum;
	}

	/**
	 * @return the pictures
	 */
	public List<File> getPictures() {
		return pictures;
	}

	/**
	 * @param pictures
	 *            the pictures to set
	 */
	public void setPictures(List<File> pictures) {
		this.pictures = pictures;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the sdf
	 */
	public SimpleDateFormat getSdf() {
		return sdf;
	}

	/**
	 * @param sdf
	 *            the sdf to set
	 */
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	/**
	 * @return the systemSupport
	 */
	public SystemSupport getSystemSupport() {
		return systemSupport;
	}

	/**
	 * @param systemSupport
	 *            the systemSupport to set
	 */
	public void setSystemSupport(SystemSupport systemSupport) {
		this.systemSupport = systemSupport;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameEntity [gameNum=" + gameNum + ", size=" + size + ", buildDate=" + buildDate + ", gameName="
				+ gameName + ", comments=" + comments + ", introduce=" + introduce + ", price=" + price + ", cutOff="
				+ cutOff + ", systemTypeNum=" + systemTypeNum + ", pictures=" + pictures + ", version=" + version
				+ ", path=" + path + ", systemSupport=" + systemSupport + "]";
	}

}
