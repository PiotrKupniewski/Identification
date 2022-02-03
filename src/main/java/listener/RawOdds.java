package listener;

public class RawOdds {

  private final String id;
  private final Double odds;

  public RawOdds(String id, Double odds) {
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
