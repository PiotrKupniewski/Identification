package listener;

import java.util.List;

public class KafkaRawListener implements RawOddsListener {
  @Override
  public List<RawOdds> listenOnStream() {
    return List.of(new RawOdds("event:1", 2.25), new RawOdds("event2", 2.1));
  }
}
