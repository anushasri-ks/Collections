package com.xworkz.webseries.dto;

import java.io.Serializable;

import com.xworkz.webseries.jdbc.constant.OTTPlatform;
import com.xworkz.webseries.jdbc.constant.genreType;

public class WebseriesDTO implements Serializable, Comparable<WebseriesDTO>
{

	private int id;
	private String name;
	private int noOfEpisodes;
	private int totalSeason;
	private OTTPlatform streamedIn;
	private genreType genre;
	private int yestAgeIndaNodbohudu;

	public WebseriesDTO() {
	}

	public WebseriesDTO(String name, int noOfEpisodes, int totalSeason, OTTPlatform streamedIn, genreType genre,
			int yestAgeIndaNodbohudu) {
		this.name = name;
		this.noOfEpisodes = noOfEpisodes;
		this.totalSeason = totalSeason;
		this.streamedIn = streamedIn;
		this.genre = genre;
		this.yestAgeIndaNodbohudu = yestAgeIndaNodbohudu;
	}

	@Override
	public String toString() {
		return "WebseriesDTO [id=" + id + ", name=" + name + ", noOfEpisodes=" + noOfEpisodes + ", totalSeason="
				+ totalSeason + ", streamedIn=" + streamedIn + ", genre=" + genre + ", yestAgeIndaNodbohudu="
				+ yestAgeIndaNodbohudu + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof WebseriesDTO) {
			WebseriesDTO casted = (WebseriesDTO) obj;
			if (this.name.equals(casted.name) && this.genre.equals(casted.genre) && this.id == casted.id) {
				return true;
			}
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEpisodes() {
		return noOfEpisodes;
	}

	public void setNoOfEpisodes(int noOfEpisodes) {
		this.noOfEpisodes = noOfEpisodes;
	}

	public int getTotalSeason() {
		return totalSeason;
	}

	public void setTotalSeason(int totalSeason) {
		this.totalSeason = totalSeason;
	}

	public OTTPlatform getStreamedIn() {
		return streamedIn;
	}

	public void setStreamedIn(OTTPlatform streamedIn) {
		this.streamedIn = streamedIn;
	}

	public genreType getGenre() {
		return genre;
	}

	public void setGenre(genreType genre) {
		this.genre = genre;
	}

	public int getYestAgeIndaNodbohudu() {
		return yestAgeIndaNodbohudu;
	}

	public void setYestAgeIndaNodbohudu(int yestAgeIndaNodbohudu) {
		this.yestAgeIndaNodbohudu = yestAgeIndaNodbohudu;
	}
	
	@Override
	public int compareTo(WebseriesDTO o) {
		int max = o.getTotalSeason();
		if (this.totalSeason == max)
			return 0;
		if (this.totalSeason > max)
			return 1;
		if (this.totalSeason < max)
			return -1;
		return 0;
	}
}