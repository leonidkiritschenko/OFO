package com.silver.ofo.api.controller;

import com.silver.ofo.api.service.VoteService;
import com.silver.ofo.domain.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoteController {

    @Autowired
    private VoteService voteService;

    @RequestMapping(value = "api/votes",
        produces = {"application/json"},
        method = RequestMethod.GET)
    public ResponseEntity<List<Vote>> getVotes() {
        return voteService.getVotes();
    }

    @RequestMapping(value = "api/votes/{voteId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<Vote> getVoteById(@PathVariable("voteId") String voteId) {
        return voteService.getVoteById(voteId);
    }
}
