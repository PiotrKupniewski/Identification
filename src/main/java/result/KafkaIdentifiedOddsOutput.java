package result;

import validator.ValidatedOdds;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KafkaIdentifiedOddsOutput implements OutputCreator {
  @Override
  public List<OddsWrapper> create(Stream<ValidatedOdds> validatedOdds) {
    return validatedOdds
        .map(odds -> new OddsWrapper(odds.getId(), odds.getOdds()))
        .collect(Collectors.toList());
  }
}
