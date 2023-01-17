package terminal;

public interface CommandExecutableFactory <I, U>{
    I create (U [] input);
}
