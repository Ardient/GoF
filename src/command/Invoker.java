package command;


class Invoker {
    private final Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    void callCommand() { // call concrete Command, which executes the Command on the receiver
        command.execute();
    }
}
