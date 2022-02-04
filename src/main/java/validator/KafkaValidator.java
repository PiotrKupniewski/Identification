package validator;

import listener.RawOdds;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

public class KafkaValidator implements Validator {

  @Override
  public Stream<ValidatedOdds> validate(Collection<RawOdds> rawOdds) {
    return rawOdds.stream()
        .filter(Objects::nonNull)
        .map(raw -> new ValidatedOdds(raw.getId(), raw.getOdds()));
  }
}
