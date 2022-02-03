import core.Identification;
import listener.KafkaRawListener;
import result.KafkaIdentifiedOddsOutput;
import validator.KafkaValidator;

public class Simulation {
  public static void main(String[] args) {

    Identification identification = start();

    var rawOdds = identification.startListening();
    var validatedOdds = identification.validate(rawOdds);
    var output = identification.createOutput(validatedOdds);

    System.out.println(output);
  }

  public static Identification start(){
    var kafkaRawListener = new KafkaRawListener();
    var kafkaValidator = new KafkaValidator();
    var outputCreator = new KafkaIdentifiedOddsOutput();

    return new Identification(kafkaRawListener, kafkaValidator, outputCreator);
  }
}
