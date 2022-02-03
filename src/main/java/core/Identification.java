package core;

import listener.RawOdds;
import listener.RawOddsListener;
import result.OddsWrapper;
import result.OutputCreator;
import validator.ValidatedOdds;
import validator.Validator;

import java.util.List;

public class Identification {

  private final RawOddsListener listener;
  private final Validator validator;
  private final OutputCreator outputCreator;

  public Identification(
      RawOddsListener listener, Validator validator, OutputCreator outputCreator) {
    this.listener = listener;
    this.validator = validator;
    this.outputCreator = outputCreator;
  }

  public List<RawOdds> startListening() {
    return listener.listenOnStream();
  }

  public List<ValidatedOdds> validate(List<RawOdds> rawOdds) {
    return validator.validate(rawOdds);
  }

  public List<OddsWrapper> createOutput(List<ValidatedOdds> validatedOdds) {
    return outputCreator.create(validatedOdds);
  }
}
