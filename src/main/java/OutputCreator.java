import java.util.List;

public interface OutputCreator {
    List<OddsWrapper> create(List<ValidatedOdds> validatedOdds);
}
