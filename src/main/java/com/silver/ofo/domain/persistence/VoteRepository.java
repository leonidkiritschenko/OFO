package com.silver.ofo.domain.persistence;

import com.silver.ofo.domain.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres")
public class VoteRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VoteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Vote> getVotes() {
        final String sqlQuery = "SELECT ID, Value, SuggestionID, UserID FROM Votes";

        List<Vote> votes = jdbcTemplate.query(sqlQuery, new BeanPropertyRowMapper<>(Vote.class));

        return votes;
    }

    public Vote getVoteById(String voteId) {
        final String sqlQuery = "SELECT ID, Value, SuggestionID, UserID FROM Votes WHERE ID = ?";

        Vote vote = jdbcTemplate.queryForObject(sqlQuery, new Object[]{voteId}, new BeanPropertyRowMapper<>(Vote.class));

        return vote;
    }

}
