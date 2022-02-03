import java.util.Collection;

public interface Receiver {
    Collection<RawOddsWrapper> processDataToValidation(Collection<RawOddsWrapper> rawOdds);
}
