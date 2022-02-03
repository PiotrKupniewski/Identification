import java.util.List;
import java.util.stream.Collectors;

public class KafkaIdentifiedOddsOutput implements OutputCreator {
  @Override
  public List<OddsWrapper> create(List<ValidatedOdds> validatedOdds) {
    return validatedOdds.stream()
        .map(odds -> new OddsWrapper(odds.getId(), odds.getOdds()))
        .collect(Collectors.toList());
  }
}
