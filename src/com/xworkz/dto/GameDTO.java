package com.xworkz.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {
	private String name;
	private String version;
	private String devolopedBy;
	private int maxPlayers;
	private double memoryRequired;
	private boolean online;

	public GameDTO(String name, String version, String devolopedBy, int maxPlayers, double memoryRequired,
			boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.devolopedBy = devolopedBy;
		this.maxPlayers = maxPlayers;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", devolopedBy=" + devolopedBy + ", maxPlayers="
				+ maxPlayers + ", memoryRequired=" + memoryRequired + ", online=" + online + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Original Hashcode:" + System.identityHashCode(this));
		return 43;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof GameDTO) {
			GameDTO casted = (GameDTO) obj;
			if (this.name.equals(casted.name) && this.version.equals(casted.version)
					&& this.devolopedBy.equals(casted.devolopedBy)) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDevolopedBy() {
		return devolopedBy;
	}

	public void setDevolopedBy(String devolopedBy) {
		this.devolopedBy = devolopedBy;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}

	public double getMemoryRequired() {
		return memoryRequired;
	}

	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
}