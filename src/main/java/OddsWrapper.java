public class OddsWrapper {

  private final String id;
  private final Double odds;

  public OddsWrapper(String id, Double odds) {
    this.id = id;
    this.odds = odds;
  }

  @Override
  public String toString() {
    return "OddsWrapper{" + "id='" + id + '\'' + ", odds=" + odds + '}';
  }
}
