package com.xworkz.webseries.dao;

import static com.xworkz.jdbc.constant.JdbcConstant.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.webseries.constant.OTTPlatform;
import com.xworkz.webseries.constant.genreType;
import com.xworkz.webseries.dto.WebseriesDTO;

public class WebseriesDAOimpl implements WebseriesDAO {

	@Override
	public void save(WebseriesDTO dto) {
		int aiId = 0;
		System.out.println("Saved DTO into DAO");
		Connection tempConnection = null;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			tempConnection = connection;
			connection.setAutoCommit(false);
			String query = "INSERT INTO Webseries(name, no_of_episodes, total_season, streamed_in, genre, yestAgeIndaNodbohudu) VALUES(?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			statement.setString(1, dto.getName());
			statement.setInt(2, dto.getNoOfEpisodes());
			statement.setInt(3, dto.getTotalSeason());
			statement.setString(4, dto.getStreamedIn().toString());
			statement.setString(5, dto.getGenre().toString());
			statement.setInt(6, dto.getYestAgeIndaNodbohudu());
			statement.execute();
			ResultSet resultSet = statement.getGeneratedKeys();
			if (resultSet.next()) {
				aiId = resultSet.getInt(1);
			}
			dto.setId(aiId);
			connection.commit();
			System.out.println(dto);
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void saveAll(Collection<WebseriesDTO> collection) {
		Collection<WebseriesDTO> col = new ArrayList<>();
		Connection tempConnection = null;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			tempConnection = connection;
			connection.setAutoCommit(false);
			String query = "INSERT INTO Webseries(name, no_of_episodes, total_season, streamed_in, genre, yestAgeIndaNodbohudu) VALUES(?, ?, ?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			collection.forEach(dto -> {
				int aiId = 0;
				try {
					statement.setString(1, dto.getName());
					statement.setInt(2, dto.getNoOfEpisodes());
					statement.setInt(3, dto.getTotalSeason());
					statement.setString(4, dto.getStreamedIn().toString());
					statement.setString(5, dto.getGenre().toString());
					statement.setInt(6, dto.getYestAgeIndaNodbohudu());
					statement.execute();
					ResultSet resultSet = statement.getGeneratedKeys();
					if (resultSet.next()) {
						aiId = resultSet.getInt(1);
					}
					dto.setId(aiId);
				} catch (Exception e) {
					e.printStackTrace();
				}
				col.addAll(collection);
			});
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				tempConnection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public Collection<WebseriesDTO> findAll() {
		System.out.println("Find all data's from table");
		Collection<WebseriesDTO> collection = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT * FROM Webseries";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				WebseriesDTO dto = createDtoFromResultsetValues(resultSet);
				collection.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return collection;
	}

	@Override
	public int total() {
		int count = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT count(*) FROM Webseries";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				count = resultSet.getInt(1);
			}
			System.out.println("Total Webseries : " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int findMaxSeason() {
		int maxSeason = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT MAX(total_season) FROM Webseries";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				maxSeason = resultSet.getInt(1);
			}
			System.out.println("Maximum Season : " + maxSeason);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return maxSeason;
	}

	@Override
	public int findMinSeason() {
		int minSeason = 0;
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT MIN(total_season) FROM Webseries";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				minSeason = resultSet.getInt(1);
			}
			System.out.println("Minimum Season : " + minSeason);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return minSeason;
	}

	@Override
	public Collection<WebseriesDTO> findAllSortByNameDesc() {
		System.out.println("Find all data's from table sort by name in descending order");
		Collection<WebseriesDTO> collection = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT * FROM Webseries ORDER BY name DESC";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				WebseriesDTO dto = createDtoFromResultsetValues(resultSet);
				collection.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return collection;
	}

	@Override
	public Collection<WebseriesDTO> findAll(Predicate<WebseriesDTO> predicate) {
		System.out.println("Find all data's from table with predicate");
		Collection<WebseriesDTO> collection = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT * FROM Webseries";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				WebseriesDTO dto = createDtoFromResultsetValues(resultSet);
				if (predicate.test(dto)) {
					collection.add(dto);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return collection;
	}

	@Override
	public Optional<WebseriesDTO> findOne(Predicate<WebseriesDTO> predicate) {
		System.out.println("Find one data from table with predicate");
		Optional<WebseriesDTO> opt = Optional.empty();
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT * FROM Webseries";
			ResultSet resultSet = resultSetByPreparedStatement(connection, query);
			while (resultSet.next()) {
				WebseriesDTO dto = createDtoFromResultsetValues(resultSet);
				if (predicate.test(dto)) {
					opt = Optional.of(dto);
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return opt;
	}

	public ResultSet resultSetByPreparedStatement(Connection connection, String query) throws SQLException {
		PreparedStatement statement = connection.prepareStatement(query);
		statement.execute();
		ResultSet resultSet = statement.getResultSet();
		return resultSet;
	}

	public WebseriesDTO createDtoFromResultsetValues(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		int no_of_episodes = resultSet.getInt("no_of_episodes");
		int total_season = resultSet.getInt("total_season");
		String streamed_in = resultSet.getString("streamed_in");
		String genre = resultSet.getString("genre");
		int ageFrom = resultSet.getInt("yestAgeIndaNodbohudu");
		WebseriesDTO dto = new WebseriesDTO(name, no_of_episodes, total_season, OTTPlatform.valueOf(streamed_in),
				genreType.valueOf(genre), ageFrom);
		dto.setId(id);
		return dto;
	}
}



