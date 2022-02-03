public class RawOddsWrapper {

  private String id;
  private Double odds;

  public RawOddsWrapper(String id, Double odds) {
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
