package com.epam.user.dao;


import com.epam.user.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by alex on 15.2.17.
 */
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public UserDaoImpl(DataSource dataSource){
        jdbcTemplate=new JdbcTemplate(dataSource);
        namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
    }
    @Override
    public User findUserByUserId(Long userId) {
        SqlParameterSource sqlParameterSource=new MapSqlParameterSource("user_id",userId);
        User user=namedParameterJdbcTemplate.queryForObject("select user_id, login, password, description from app_user where user_id =: user_id",sqlParameterSource,new UserRowMapper());
        return user;
    }

    @Override
    public Long save(User User) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(User User) {

    }

    @Override
    public List<User> findAllUsers() {
        String getAllUsersSql = "select user_id, login, password, description from app_user";
        return jdbcTemplate.query(getAllUsersSql, new UserRowMapper());
    }

    public class UserRowMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user=new User();
            user.setUserId(resultSet.getInt("user_id"));
            user.setPassword(resultSet.getString("password"));
            user.setLogin(resultSet.getString("login"));
            user.setDescription(resultSet.getString("description"));
            return null;
        }
    }

}

