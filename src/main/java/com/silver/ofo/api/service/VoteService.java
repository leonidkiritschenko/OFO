package com.silver.ofo.api.service;

import com.silver.ofo.domain.model.Vote;
import com.silver.ofo.domain.persistence.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    public ResponseEntity<List<Vote>> getVotes() {
        List<Vote> votes = new ArrayList<>();
        votes.addAll(voteRepository.getVotes());
        if (Objects.isNull(votes)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(votes, HttpStatus.OK);
    }

    public ResponseEntity<Vote> getVoteById(String voteId) {
        Vote vote = voteRepository.getVoteById(voteId);
        if (Objects.isNull(vote)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(vote, HttpStatus.OK);
    }
}
