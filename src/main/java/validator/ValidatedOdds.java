package validator;

public class ValidatedOdds {

  private final String id;
  private final Double odds;

  public ValidatedOdds(String id, Double odds) {
    this.id = id;
    this.odds = odds;
  }

  public String getId() {
    return id;
  }

  public Double getOdds() {
    return odds;
  }
}
