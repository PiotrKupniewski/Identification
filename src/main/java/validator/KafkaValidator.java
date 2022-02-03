package validator;

import listener.RawOdds;
import validator.ValidatedOdds;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class KafkaValidator implements Validator {

  @Override
  public List<ValidatedOdds> validate(Collection<RawOdds> rawOdds) {
    return rawOdds.stream()
        .filter(Objects::nonNull)
        .map(raw -> new ValidatedOdds(raw.getId(), raw.getOdds()))
        .collect(Collectors.toList());
  }
}
