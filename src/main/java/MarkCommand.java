public class MarkCommand extends Command {
    private final int index;

    public MarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DreException {
        try {
            tasks.mark(index);
            ui.showMarkedTask(tasks.getTask(index));
        } catch (IndexOutOfBoundsException e) {
            ui.showError("Invalid task index.");
        }
    }
}