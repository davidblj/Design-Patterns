/*
  Adapter pattern

The adapter design pattern will help facilitate communication between
two existing systems by providing a compatible interface.

An system can be an external library, for example.

with this pattner you dont need to change your system.
*/


public interface TargetInterce {
  public int handler();
}

// with this configuration, we can have multiple adapters
public void Adapter implements TargetInterce {

  private External externalLibrary;

  public void connect(External externalLibrary) {
    this.externalLibrary = externalLibrary;   // Adaptee
  }

  public void handler() {
    // 1. preparation to use our external library
    // 2. external library use
    // 3. return message (An error code)
  }
}

// notice that the client never interact with the external library or system
public void Client {

  private TargetInterce targetInterce;

  // a class that instantiates this class, needs to provide an Adapter object, which in
  // turn is a "TargetInterface"
  public Client(TargetInterce adapter) {
    this.targetInterce = adapter;
  }

  // this method is not supposed to change becuase it may disrupt other parts of the system
  // instead, you add a new method that uses a new interface, and you add a new response.
  public void doWork() {

    targetInterce.handler();    // adapter usage
    return message;             // our client prepares a response (A message depending of an error code).
                                // This is his responsability
  }
}

public class program {

  External externalLibrary = new External();

  Adaptar adapter = new Adapter();
  adapter.connect(externalLibrary);

  Client client = new Client(adapter);
  client.doWork();
}

/*
TargetInterce: WebRequester
  handler: WebService

Adapter: WebAdapter
  handler: request (to use our web service library)

Client: WebClient
*/
