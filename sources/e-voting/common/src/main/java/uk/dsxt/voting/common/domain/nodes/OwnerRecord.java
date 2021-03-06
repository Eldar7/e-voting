/******************************************************************************
 * e-voting system                                                            *
 * Copyright (C) 2016 DSX Technologies Limited.                               *
 * *
 * This program is free software; you can redistribute it and/or modify       *
 * it under the terms of the GNU General Public License as published by       *
 * the Free Software Foundation; either version 2 of the License, or          *
 * (at your option) any later version.                                        *
 * *
 * This program is distributed in the hope that it will be useful,            *
 * but WITHOUT ANY WARRANTY; without even the implied                         *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * *
 * You can find copy of the GNU General Public License in LICENSE.txt file    *
 * at the top-level directory of this distribution.                           *
 * *
 * Removal or modification of this copyright notice is prohibited.            *
 * *
 ******************************************************************************/

package uk.dsxt.voting.common.domain.nodes;

import lombok.AllArgsConstructor;
import uk.dsxt.voting.common.domain.dataModel.ClientVoteReceipt;
import uk.dsxt.voting.common.domain.dataModel.VoteResult;
import uk.dsxt.voting.common.domain.dataModel.VoteResultAndStatus;
import uk.dsxt.voting.common.utils.MessageBuilder;

public class OwnerRecord {
    final VoteResultAndStatus resultAndStatus;
    final String serializedVote;
    final String signature;
    final String voteDigest;
    final String voteMessageId;
    
    @Override
    public String toString() {
        //TODO save receipt and status
        return MessageBuilder.buildMessage(voteMessageId, resultAndStatus.getResult().toString(), 
            serializedVote, signature, voteDigest);
    }
    
    public OwnerRecord(String string) {
        if (string == null)
            throw new IllegalArgumentException("OwnerRecord can not be created from null string");
        String[] terms = MessageBuilder.splitMessage(string);
        if (terms.length != 5)
            throw new IllegalArgumentException(String.format("OwnerRecord can not be created from string with %d parts", terms.length));
        voteMessageId = terms[0];
        //TODO add receipt
        resultAndStatus = new VoteResultAndStatus(new VoteResult(terms[1]), null, null);
        serializedVote = terms[2];
        signature = terms[3];
        voteDigest = terms[4];
    }
    
    public OwnerRecord(VoteResult result, String serializedVote, String signature, String voteDigest, String voteMessageId, ClientVoteReceipt receipt) {
        this.resultAndStatus = new VoteResultAndStatus(result, null, receipt);
        this.serializedVote = serializedVote;
        this.signature = signature;
        this.voteDigest = voteDigest;
        this.voteMessageId = voteMessageId;
    }
}
