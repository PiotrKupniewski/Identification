package validator;

import listener.RawOdds;

import java.util.Collection;
import java.util.stream.Stream;

public interface Validator {
  Stream<ValidatedOdds> validate(Collection<RawOdds> rawOdds);
}
