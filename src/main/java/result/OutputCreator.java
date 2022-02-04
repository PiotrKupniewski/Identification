package result;

import result.OddsWrapper;
import validator.ValidatedOdds;

import java.util.List;
import java.util.stream.Stream;

public interface OutputCreator {
    List<OddsWrapper> create(Stream<ValidatedOdds> validatedOdds);
}
