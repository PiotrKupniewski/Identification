import java.util.Collection;
import java.util.List;

public interface Validator {
  List<ValidatedOdds> validate(Collection<RawOdds> rawOdds);
}
