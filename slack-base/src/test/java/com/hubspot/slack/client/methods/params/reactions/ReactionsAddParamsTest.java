package com.hubspot.slack.client.methods.params.reactions;

import org.junit.Test;

import com.hubspot.immutables.validation.InvalidImmutableStateException;

public class ReactionsAddParamsTest {

  @Test(expected = InvalidImmutableStateException.class)
  public void itFailsForMissingRecipient() {
    ReactionsAddParams.builder()
        .setName("slack")
        .build();
  }

  @Test(expected = InvalidImmutableStateException.class)
  public void itFailsForMissingChannelId() {
    ReactionsAddParams.builder()
        .setTimestamp("1521832290718")
        .build();
  }

  @Test(expected = InvalidImmutableStateException.class)
  public void itFailsForMissingTimestamp() {
    ReactionsAddParams.builder()
        .setChannel("C9520P0L9")
        .build();
  }
}
